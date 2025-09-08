package com.ex10;

public class Produto {
	
	private int codigo;
	private String nome;
	private double precoUnitario;
	
	public Produto(int codigo, String nome, double precoUnitario) {
		this.codigo = codigo;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrecoUnitario() {
		return this.precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

}
