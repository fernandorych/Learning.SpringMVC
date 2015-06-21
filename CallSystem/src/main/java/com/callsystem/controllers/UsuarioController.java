package com.callsystem.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.callsystem.dao.PessoaDAO;
import com.callsystem.dao.RamalDAO;
import com.callsystem.model.PessoaVO;
import com.callsystem.model.RamalVO;

@Controller
public class UsuarioController {

	@RequestMapping(value = "/cadastrarUsuarios", method = RequestMethod.GET)
	public String cadastrarUsuarios() {

		return "cadastrarUsuarios";
	}

	@RequestMapping(value = "/cadastrarUsuarios", method = RequestMethod.POST)
	public String cadastrarUsuarios(@ModelAttribute("usuario") PessoaVO usuario) {
		try {
			PessoaDAO pessoa = new PessoaDAO();
			pessoa.cadastrar(usuario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "redirect:listarUsuarios";
	}

	@RequestMapping(value = "/listarUsuarios", method = RequestMethod.GET)
	public ModelAndView listarUsuarios() {
		try {
			List<RamalVO> ramais = null;
			List<RamalVO> itens = new ArrayList<RamalVO>();
			List<PessoaVO> pessoas = new PessoaDAO().listar();
			List<Integer> listId = new ArrayList<Integer>();
			ramais = new RamalDAO().listar();
			for (PessoaVO pessoa : pessoas) {
				for (RamalVO ramalVO : ramais) { 
					if (ramalVO.getPessoa().getId() == pessoa.getId()) {
						ramalVO.setPessoa(pessoa);
						listId.add(ramalVO.getPessoa().getId());
						itens.add(ramalVO);
						
					}
					
					
				}
			}
			
			 for (PessoaVO pessoa : pessoas) {
				if (!listId.contains(pessoa.getId())) {
					RamalVO ramal = new RamalVO();
					ramal.setNumero("0");
					ramal.setId(0);
					ramal.setPessoa(pessoa);
					itens.add(ramal);
				}
			}
			
			ModelAndView model = new ModelAndView("listarUsuarios");
//			if (ramais.size() == 0) {
//				itens = new ArrayList<RamalVO>();
//
//				for (PessoaVO pessoaVO : pessoas) {
//					RamalVO ramal = new RamalVO();
//					ramal.setNumero("0");
//					ramal.setId(0);
//					ramal.setPessoa(pessoaVO);
//					itens.add(ramal);
//				}
//
//			}
			model.addObject("ramais", itens);

			return model;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
