package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@Controller
public class HelloController {
	
	@RequestMapping("/topicos")
	@ResponseBody
	public String Hello () {
		return "hello";
	}
}
