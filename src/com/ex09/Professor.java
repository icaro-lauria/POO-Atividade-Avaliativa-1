package com.ex09;

public class Professor extends Pessoa{

	protected String disciplina;
	protected int cargaHoraria;
	
	public Professor(String cpf, String nome, String disciplina, int cargaHoraria) {
		super(cpf, nome);
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
	}
	
	public double calcularSalarioMensal(double valorHora) {
		return this.cargaHoraria*valorHora;
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getCargaHoraria() {
		return this.cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
