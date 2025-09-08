package com.ex02;

public class Carro {

	private String marca, modelo;
	private int ano, velocidadeAtual;
	
	public Carro() {}
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual = 0;
	}
	
	public void acelerar(int velocidade) {
		this.velocidadeAtual+=velocidade;
	}

	public void frear(int velocidade) {
		velocidadeAtual-=velocidade;
		if(velocidadeAtual < 0) velocidadeAtual = 0;
	}

	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidade() {
		return this.velocidadeAtual;
	}
	public void setVelocidade(int velocidade) {
		this.velocidadeAtual = velocidade;
	}

}
