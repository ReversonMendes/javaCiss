package br.com.ciss.restfull.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciss.restfull.model.Saudacao;
import br.com.ciss.restfull.repository.SaudacaoRepository;

@RestController()
@RequestMapping("/saudacao")
public class SaudacaoController {

	@Autowired
	private SaudacaoRepository repository;

	// Isso é um contador
	// private AtomicLong contador = new AtomicLong();

	@GetMapping
	public Saudacao buscaPorCodigo(@PathParam("id") Long id) {
		return repository.findOne(id);
	}

	@PostMapping
	public Saudacao salvar(@RequestBody Saudacao saudacao) {
		saudacao = repository.save(saudacao);
		return saudacao;
	}

	@PutMapping
	public Saudacao altera(@RequestBody Saudacao saudacao) {
		if (saudacao.getId() != null) {
			Saudacao s = repository.findOne(saudacao.getId());
			if (s != null) {
				return repository.save(saudacao);
			} else {
				throw new IllegalArgumentException("id não encontrado");
			}
		}
		return null;
	}

	@DeleteMapping
	public String excluir(@PathParam("id") Long id) {
		repository.delete(id);
		return "Registro excluído com sucesso!";
	}

}
