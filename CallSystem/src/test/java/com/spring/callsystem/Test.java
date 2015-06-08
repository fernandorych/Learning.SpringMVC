package com.spring.callsystem;

import com.callsystem.business.PessoaBUS; 
import com.callsystem.model.PerfilVO;
import com.callsystem.model.PessoaVO; 
import com.callsystem.model.enums.PerfilEnum;

public class Test {

	public static void main(String[] args) {
		PessoaVO user = new PessoaVO();
		user.setNome("Erick");
		user.setEmail("e@e.com");
		user.setSenha("123");
		PerfilVO perfil = new PerfilVO(); 
		perfil.setId(1);
		user.setPerfil(perfil);
		
		PessoaBUS bus = new PessoaBUS();
		bus.cadastrar(user);
		System.out.println("Cadastrado com Sucesso !");
		
		
		
	}
	
}
