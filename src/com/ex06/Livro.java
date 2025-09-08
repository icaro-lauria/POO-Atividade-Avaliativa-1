package com.ex06;

public class Livro extends Publicacao{
	
	private String autor;

	public Livro(String titulo, int ano, String autor) {
		super(titulo, ano);
		this.autor = autor;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Autor: "+autor);
	}
	
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
