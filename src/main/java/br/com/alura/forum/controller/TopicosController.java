package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos1")
	public List<TopicoDto> lista(String curso) {
		if(curso != null) {
			List<Topico> topicos = topicoRepository.findByCurso_Nome(curso);
			return TopicoDto.converter(topicos);
		} else {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoDto.converter(topicos);
		}
		
	}
}
