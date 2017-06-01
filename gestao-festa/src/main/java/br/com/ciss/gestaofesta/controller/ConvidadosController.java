package br.com.ciss.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ciss.gestaofesta.model.Convidado;
import br.com.ciss.gestaofesta.repository.ContribuicaoRepository;
import br.com.ciss.gestaofesta.repository.ConvidadosRepository;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private ConvidadosRepository repository;
	
	@Autowired
	private ContribuicaoRepository contribuicaoRepository;

	@GetMapping
	public ModelAndView listar() {

		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject(new Convidado());
		mv.addObject("convidados", repository.findAll());
		mv.addObject("contribuicoes", contribuicaoRepository.findAll());
		return mv;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		repository.save(convidado);
		return "redirect:/convidados";
	}

}
