package com.callsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callsystem.model.PessoaVO;

 

@Controller
public class UsuarioController {

	@RequestMapping(value = "/cadastrarUsuarios", method = RequestMethod.GET)
	public String cadastrarUsuarios() {
	 
		return "cadastrarUsuarios";
	}
	
	@RequestMapping(value = "/cadastrarUsuarios", method = RequestMethod.POST)
	public String cadastrarUsuarios(@ModelAttribute("usuario") PessoaVO usuario) {
	 
		return "cadastrarUsuarios";
	}
}
