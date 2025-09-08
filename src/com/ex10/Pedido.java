package com.ex10;
import java.time.LocalDate;

public class Pedido {
	private int numero;
	private LocalDate data;
	private double valorTotal;
	
	public Pedido(int numero) {
		this.numero = numero;
		this.data = LocalDate.now();
		this.valorTotal = 0;
	}
	
	public void adicionarPedido(Produto p, int quantidade) {
		this.valorTotal += p.getPrecoUnitario()*quantidade;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getValorTotal() {
		return this.valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
