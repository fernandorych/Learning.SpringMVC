package com.callsystem.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.util.ArrayList;
import java.util.List;

import com.callsystem.dao.contracts.IPessoa;
import com.callsystem.database.ConnectionFactory; 
import com.callsystem.model.PessoaVO;  

public class PessoaDAO implements IPessoa {

	PreparedStatement prepare = null;
	Connection conexao = null;
	public void cadastrar(PessoaVO PessoaVO) throws  Exception{

		String sql = "INSERT INTO `tb_usuario`(DS_NOME , DS_EMAIL , DS_SENHA) VALUES(?,?,?)";
		try(Connection conexao = ConnectionFactory.createConnectionToMySQL()) { 
			prepare = conexao.prepareStatement(sql);	 
			prepare.setString(1, PessoaVO.getNome());  
			prepare.setString(2, PessoaVO.getEmail());  
			prepare.setString(3, PessoaVO.getSenha());    

			prepare.execute();

		} 

	}

	public PessoaVO pesquisarPorId(int id)throws  Exception{  
		try(Connection conexao = ConnectionFactory.createConnectionToMySQL()) { 
			prepare = conexao.prepareStatement("select * from `tb_usuario` where id =?");			
			ResultSet rs = prepare.executeQuery();  

			PessoaVO contato = new PessoaVO();  
			contato.setId(rs.getInt("ID"));  
			contato.setNome(rs.getString("DS_NOME"));  
			contato.setEmail(rs.getString("DS_EMAIL"));  
			contato.setSenha(rs.getString("DS_SENHA"));  

			prepare.execute();

			return contato;  
		}  

	}  

	public List<PessoaVO>  listar()throws  Exception{  
		try(Connection conexao = ConnectionFactory.createConnectionToMySQL()) { 
			prepare = conexao.prepareStatement("select * from `tb_usuario`");			
			ResultSet rs = prepare.executeQuery();  

			List<PessoaVO> listPessoa = new ArrayList<PessoaVO>();
			while (rs.next()) {
				PessoaVO pessoa = new PessoaVO();  
				pessoa.setId(rs.getInt("ID"));  
				pessoa.setNome(rs.getString("DS_NOME"));  
				pessoa.setEmail(rs.getString("DS_EMAIL"));  
				pessoa.setSenha(rs.getString("DS_SENHA"));  
				
				listPessoa.add(pessoa);
			}
			return listPessoa;
  
		}  

	}  
	
	public PessoaVO getLogin(String usuario, String senha)throws  Exception{
		try(Connection conexao = ConnectionFactory.createConnectionToMySQL()) { 
			prepare = conexao.prepareStatement("select * from `tb_usuario` where DS_EMAIL =? and DS_SENHA =?");	
			prepare.setString(1, usuario);
			prepare.setString(2, senha);
			
			ResultSet result = prepare.executeQuery();  

			if (result.next()) {
				PessoaVO contato = new PessoaVO();  
				contato.setId(result.getInt("ID"));  
				contato.setNome(result.getString("DS_NOME"));  
				contato.setEmail(result.getString("DS_EMAIL"));  
				contato.setSenha(result.getString("DS_SENHA"));  



				return contato;  
			}
			return null;
		} 


	}
	
	 public static void main(String[] args) throws Exception{
		
		 PessoaVO p = new PessoaVO();
		 p.setEmail("erick.rocknroll@gmail.com");
		 p.setNome("Erick");
		 p.setSenha("123");
		 new PessoaDAO().cadastrar(p);
	 
	 
	   }


}
