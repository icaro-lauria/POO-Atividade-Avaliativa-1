package com.ex10;

public class Main {

	public static void main(String[] args) {

		Produto pdt1 = new Produto(69, "Lubrificante industrial", 69);
		Produto pdt2 = new Produto(420, "Óleo de canabidol", 4.20);
		Produto pdt3 = new Produto(666, "Livro", 66.6);
				
		Pedido pedido = new Pedido(1);
		pedido.adicionarPedido(pdt1, 3);
		pedido.adicionarPedido(pdt2, 5);
		pedido.adicionarPedido(pdt3, 6);
				
		System.out.printf("O valor total foi: R$%.2f", pedido.getValorTotal());
	}

}
