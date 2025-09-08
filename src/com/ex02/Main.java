package com.ex02;

public class Main {
	
	public static void main(String args[]) {

		Carro suv = new Carro("Peugeot", "SUV",2008);
		Carro onix = new Carro("Chrevolet", "Onix", 2025);
		
		onix.setVelocidade(10);
		System.out.println("ONIX: "+onix.getVelocidade()+"km/h");
		onix.frear(20);
		System.out.println("ONIX: "+onix.getVelocidade()+"km/h");

		suv.setVelocidade(10);
		System.out.println("SUV: "+suv.getVelocidade()+"km/h");
		suv.acelerar(20);
		System.out.println("SUV: "+suv.getVelocidade()+"km/h");
	}
	

}
