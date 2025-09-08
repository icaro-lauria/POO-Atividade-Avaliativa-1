package com.ex05;

public class Gato extends Animal{

	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	
	public void miar() {
		System.out.println(nome+" miou!");
	}

}
