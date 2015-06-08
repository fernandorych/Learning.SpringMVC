package com.callsystem.controllers;

 
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;  
import com.callsystem.model.PessoaVO; 

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
 
	@RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	public String login() {
	 
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") PessoaVO user) 
	{
		try{
			if(user.getEmail() != null && user.getSenha() != null){
				return "redirect:listar";
			} 
			return "login";
		}
		catch(Exception ex){
			System.out.println("Erro : " + ex.getMessage());
			return "login";
		}
	}
	
	
}
