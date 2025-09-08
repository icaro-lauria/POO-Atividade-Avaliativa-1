package com.ex04;

public class Pessoa {

	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	protected void exibirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
