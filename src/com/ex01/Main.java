package com.ex01;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro("50 Toms de Jerry", "Spike", 2069, 420.69);
		System.out.println("Titulo:: "+livro.getTitulo());
		System.out.println("Autor: "+livro.getAutor());
		System.out.println("Ano: "+livro.getAnoPublicacao());
		System.out.println("Preço: "+livro.getPreco());
	}

}
