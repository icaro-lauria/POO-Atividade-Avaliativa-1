package com.ex04;
public class Aluno extends Pessoa{

	private int matricula;
	
	public Aluno(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matricula: "+matricula);		
	}

	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
