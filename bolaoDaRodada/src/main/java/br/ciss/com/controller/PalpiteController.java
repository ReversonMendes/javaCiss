package br.ciss.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ciss.com.model.Palpite;
import br.ciss.com.repository.JogoRepository;
import br.ciss.com.repository.PalpiteRepository;


@Controller
@RequestMapping("/palpites")
public class PalpiteController {

		@Autowired
		private PalpiteRepository palpiteRepository;
		
		@Autowired
		private JogoRepository jogoRepository;
			
		
		@GetMapping("/novo/{idjogo}")
		public ModelAndView novo(@PathVariable("idjogo") Long idjogo) {

			ModelAndView mv = new ModelAndView("palpite");
			mv.addObject(new Palpite());
			mv.addObject("palpites", palpiteRepository.findAll());
			mv.addObject("jogos", jogoRepository.findOne(idjogo));
			return mv;
		}
		
		
		@GetMapping("listapalpites")
		public ModelAndView listar() {

			ModelAndView mv = new ModelAndView("listapalpite");
			mv.addObject(new Palpite());
			mv.addObject("palpites", palpiteRepository.findAll());
			return mv;
		}
		
		@PostMapping
		public String salvar(Palpite palpite) {
			palpiteRepository.save(palpite);
			return "redirect:/palpites/listapalpites";
		}
		
		@GetMapping("/delete/{codigo}")
		public String excluir(@PathVariable("codigo") Long codigo){
			
			palpiteRepository.delete(codigo);
			
			return "redirect:/palpites/listapalpites";
		}
}
