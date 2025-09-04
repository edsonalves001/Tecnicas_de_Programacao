package br.edu.fatecpg.tecprog.estruturada.model;

public class Arquiteto {
	public String nome;
	public int idade;
	public int CAU;
	public String projetos;
	public String Especializacao;
	public boolean feito = false;
	
	public void projetar() {
		if(feito) {
			System.out.println("O Projeto ja foi projetado");
		}else {
			System.out.println("Projetando...");
			feito = true;
		}
	}
	
	public void criar() {
		if(feito) {
			System.out.println("O Projeto ja foi criado");
		}else {
			System.out.println("Criando...");
			feito = true;
		}
	}
	
	public void supervisionar() {
		if(feito) {
			System.out.println("O Projeto está sendo supervisionado");
		}else {
			System.out.println("Em analise..");
			feito = true;
		}
	}
}
