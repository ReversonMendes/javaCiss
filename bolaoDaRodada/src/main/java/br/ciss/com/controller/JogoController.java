package br.ciss.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ciss.com.model.Jogo;
import br.ciss.com.repository.JogoRepository;
import br.ciss.com.repository.TimeRepository;
import br.ciss.com.repository.RodadaRepository;

@Controller
@RequestMapping("/jogos")
public class JogoController {
	
	@Autowired
	private JogoRepository JogoRepository;
	
	@Autowired
	private TimeRepository TimeRepository;
	
	@Autowired
	private RodadaRepository RodadaRepository;
	
	@GetMapping
	public ModelAndView listarJogos() {

		ModelAndView mv = new ModelAndView("ListaJogos");
		mv.addObject(new Jogo());
		mv.addObject("jogos", JogoRepository.findAll());
		mv.addObject("times", TimeRepository.findAll());
		mv.addObject("rodadas", RodadaRepository.findAll());
		return mv;
	}
	
	
	@PostMapping
	public String salvar(Jogo jogo) {
		JogoRepository.save(jogo);
		return "redirect:/jogos";
	}

}
