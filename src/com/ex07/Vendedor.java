package com.ex07;

public class Vendedor extends Funcionario{

	private double comissao;
	
	public Vendedor(String nome, int matricula, double salario, double comissao) {
		super(nome, matricula, salario);
		this.comissao = comissao;
	}

	public double calcularSalarioFinal() {
		return salarioBase+comissao;
	}
	
	public double getComissao() {
		return this.comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
