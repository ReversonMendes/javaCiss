package br.com.ciss.restfull.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciss.restfull.model.Livro;
import br.com.ciss.restfull.repository.LivroRepository;

@RestController()
@RequestMapping("livros")
public class LivroController {

	@Autowired
	private LivroRepository repository;
	
	@GetMapping("/{id}")
	public Livro buscarPorId(@PathVariable Long id){
		Livro l = repository.findOne(id);
		
		if(l !=null){
			return l;
		}else{
			throw new IllegalArgumentException("Livro não encontrado!");
		}
	}
	
	@PostMapping
	public Livro salvarLivro(@RequestBody Livro livro){
		livro = repository.save(livro);
		return livro;
	}
	
	@PutMapping
	public Livro alterarLivro(@RequestBody Livro livro){
		if(livro.getId() != null){
			Livro l = repository.findOne(livro.getId());
			if(l != null){
				return repository.save(livro);
			}else{
				throw new IllegalArgumentException("Livro Não encontrado!");
			}
		}
		return null;
		
	}
	
	@DeleteMapping("/{id}")
	public String excluirLivro(@PathVariable Long id){
		repository.delete(id);
		return "Registro ecluído com sucesso!";
	}
	
}
