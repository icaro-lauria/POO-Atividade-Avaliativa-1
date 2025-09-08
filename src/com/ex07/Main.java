package com.ex07;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Juan", 010101, 4200.69, 420);
		System.out.println("O gerente "+gerente.getNome()
			+ " recebeu: R$"+gerente.calcularSalarioFinal()+" neste mês.");
		Vendedor vendedor = new Vendedor("Eric", 102125, 3333.33, 80);
		System.out.println("O vendedor "+vendedor.getNome()
			+ " recebeu: R$"+vendedor.calcularSalarioFinal()+" neste mês.");
	}

}
