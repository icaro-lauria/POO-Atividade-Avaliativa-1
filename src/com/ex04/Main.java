package com.ex04;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João Daskina", 17, 66699);
		System.out.println("Exibindo dados do aluno...");
		aluno1.exibirDados();

		Professor prof1 = new Professor("Ronaldo Guimarães", 28, 4200.69);
		System.out.println("Exibindo dados do professor...");
		prof1.exibirDados();		
	}

}
