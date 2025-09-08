package com.ex06;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Publicacao> publicacoes = new ArrayList<>();
		publicacoes.add(new Livro("O Corvo", 1845, "Edgar Allan Poe"));
		publicacoes.add(new Livro("O Gato Preto", 1843, "Edgar Allan Poe"));
		publicacoes.add(new Livro("O Chamado de Cthulhu", 1928, "H. P. Lovecraft"));
		publicacoes.add(new Livro("Azathoth", 1938, "H. P. Lovecraft"));
		publicacoes.add(new Revista("Veja", 2023, 1));
		
		for(int i = 0; i < publicacoes.size(); i++) {
			System.out.println("Publicação N°"+i);
			publicacoes.get(i).exibirInformacoes();
			System.out.println();
		}
	}

}
