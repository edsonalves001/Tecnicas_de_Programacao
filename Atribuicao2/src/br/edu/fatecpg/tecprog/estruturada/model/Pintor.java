package br.edu.fatecpg.tecprog.estruturada.model;

public class Pintor {
	public String nome,estilo,obrasexibidas,experiencias;
	public int idade, premios;
	public boolean pedido = false;
	
	public void pintar() {
		if(pedido) {
			System.out.println("Pedido em andamento...");
		}else {
			System.out.println("Estamos aceitando pedidos");
			pedido = true;
		}
	}
	public void estilizar() {
		if(pedido) {
			System.out.println("Estamos estilizando o seu pedido");
		}else {
			System.out.println("Sem pedidos para estilizar");
		}
	}
	public void exposicao() {
		if(pedido) {
			System.out.println("Pedido pronto para exposição");
		}else {
			System.out.println("Sem pedidos para a exposição");

		}
	}
	public void nobel() {
		switch(premios) {
			case 1:
				System.out.println("Este é o seu " + premios + "º premio");
				break;
			case 2:
				System.out.println("Este é o seu " + premios + "º premio");
				break;
			case 3:
				System.out.println("Este é o seu " + premios + "º premio");
				break;
			case 4:
				System.out.println("Este é o seu " + premios + "º premio");
				break;
			case 5:
				System.out.println("Este é o seu " + premios + "º premio");
				break;
		}
	}
}
