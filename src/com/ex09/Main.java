package com.ex09;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Professor professor = new Professor("64042042038", "Lucas Moratti", "Química", 160);
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("32046942069", "Kauã", 202069, 9));
		alunos.add(new Aluno("32046942069", "Ronaldo", 000000, 3));
		
		System.out.println("O salario de "+professor.getNome()+" é R$"+professor.calcularSalarioMensal(55));
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).verificarAprovacao()) {
				System.out.println("O aluno "+alunos.get(i).getNome()+" passou!");				
			}else {
				System.out.println("O aluno "+alunos.get(i).getNome()+" não passou. :(");				
			}
		}
	}

}
