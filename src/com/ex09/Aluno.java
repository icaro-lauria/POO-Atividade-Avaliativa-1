package com.ex09;

public class Aluno extends Pessoa{

	protected int matricula;
	protected double notaFinal;
	
	public Aluno(String cpf, String nome, int matricula, double notaFinal) {
		super(cpf, nome);
		this.matricula = matricula;
		this.notaFinal = notaFinal;
	}
	
	public boolean verificarAprovacao() {
		if(notaFinal >= 6) return true;
		else return false;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double notaFinal() {
		return this.notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
}
