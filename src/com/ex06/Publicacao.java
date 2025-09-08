package com.ex06;

public class Publicacao {
	protected String titulo;
	protected int ano;
	
	public Publicacao(String titulo, int ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public void exibirInformacoes() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Ano: "+ano);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
