package com.callsystem.model;
 

 
public class RamalVO   {
	 
	private int Id; 
	private String Numero; 
	private PessoaVO Pessoa;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public PessoaVO getPessoa() {
		return Pessoa;
	}
	public void setPessoa(PessoaVO pessoa) {
		this.Pessoa = pessoa;
	}
}
