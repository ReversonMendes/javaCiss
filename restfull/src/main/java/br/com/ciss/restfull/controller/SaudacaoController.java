package br.com.ciss.restfull.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciss.restfull.model.Saudacao;
import br.com.ciss.restfull.repository.SaudacaoRepository;

@RestController
public class SaudacaoController { 
	
	@Autowired
	private SaudacaoRepository repository;
	
	private AtomicLong contador = new AtomicLong();

	@GetMapping(value = "/saudacao")
	public Saudacao saudacao(@PathParam("nome") String nome, @PathParam("idade") Integer idade) {
		return new Saudacao(contador.getAndIncrement(), "Olá " + nome + " idade: " + idade);
	}
	
	@PostMapping("/saudacao")
	public String salvar(@PathParam("saudacao") String saudacao){
		
		Saudacao s = new Saudacao(null, saudacao);
		
		repository.save(s); 
		
		return s.getId().toString();
	}
	
	@PostMapping("/saudacao/incluir")
	public String incluir(){
		return "método incluir";
	}
	
	@PutMapping("/saudacao")
	public String altera(){
		return "Aqui deve alterar algum registro";
	}
	
	@DeleteMapping("/saudacao")
	public String excluir(){
		return "Aqui deve excluir algum registro";
	}
	
	
	
}
