package com.ex07;

public class Funcionario {
	protected String nome;
	protected int matricula;
	protected double salarioBase;
	
	public Funcionario(String nome, int matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salario;
	}
	
	public void atualizarSalario(double percentual) {
		this.salarioBase *=(100+percentual);
	}
	
	public double calcularSalarioFinal() {
		return salarioBase;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getSalario() {
		return this.salarioBase;
	}
	public void setSalario(double salario) {
		this.salarioBase = salario;
	}
}
