package com.ex06;

public class Revista extends Publicacao{

	int edicao;
	public Revista(String titulo, int ano, int edicao) {
		super(titulo, ano);
		this.edicao = edicao;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Edição: "+edicao);
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

}
