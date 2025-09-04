package br.edu.fatecpg.tecprog.estruturada.model;

public class Cientista {
	
	public int idade;
	public String nome,experiencia,area_de_pesquisa, publicacoes;
	public boolean estudo = false;
	public boolean analisado = false;
	
	public void pesquisar() {
		if(estudo) {
			System.out.println("Já foi pesquisado....");
			estudo = false;
		}else {
			System.out.println("Tamo pesquisando, Tamo pesquisando....");
			estudo = true;
		}
	}
	public void analisar() {
		if(analisado) {
			System.out.println("Já foi analisado fih....");
			analisado = false;
		}else {
			System.out.println("Tamo analisando, Tamo analisando....");
			analisado = true;
		}
	}
	public void publicar() {
		if(analisado && estudo) {
			System.out.println("Tamo publicando, Tamo publicando....");
		}else {
			System.out.println("O artigo já foi publicado....");
		}
	}
	
}
