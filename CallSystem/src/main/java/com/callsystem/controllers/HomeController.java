package com.callsystem.controllers;
 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	 

	// TODO: MAPEAR O HIBERNATE

	// CRIAR PAGINA DE CADASTRO DE USUARIOS
	// CRIAR PAGINA DE CADASTRO DE RAMAIS

	// CRIAR PAGINA DE LOGIN
	// CRIAR PAGINA DE LISTAGEM DE USUARIOS
	// CRIAR PAGINA DE LISTAGEM DE RAMAIS E PESQUISA
	// RELATORIO DE RAMAIS

	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar() {
		
		return "listar";
	}

	 

	
}
