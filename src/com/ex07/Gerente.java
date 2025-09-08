package com.ex07;

public class Gerente extends Funcionario{

	private double bonusMensal;
	
	public Gerente(String nome, int matricula, double salario, double bonusMensal) {
		super(nome, matricula, salario);
		this.bonusMensal = bonusMensal;
	}
	
	public double calcularSalarioFinal() {
		return salarioBase+bonusMensal;
	}
	
	public double getBonus() {
		return this.bonusMensal;
	}
	
	public void setBonus(double bonus) {
		this.bonusMensal = bonus;
	}

}
