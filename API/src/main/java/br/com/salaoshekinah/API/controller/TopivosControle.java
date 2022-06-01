package br.com.salaoshekinah.API.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopivosControle {
	
	
	@RequestMapping("/topicos")
	public List<Topico> lista() {
		Topico topico = new Topico("Duvida", "Mensagem", new Curso("Spring, Pro"));
		
		return Arrays.asList(topico, topico, topico);
	}
}
 