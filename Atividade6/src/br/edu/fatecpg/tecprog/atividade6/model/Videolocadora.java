package br.edu.fatecpg.tecprog.atividade6.model;

public class Videolocadora {

	private String[] filmes;
	private int[] vezesAlugado;
	private double[] precosLocacao;
	
	public int quantidade;
	
	 public Videolocadora(int quantidade){
	        this.quantidade = quantidade;
	         filmes = new String[quantidade];
	        vezesAlugado = new int[quantidade];
	        precosLocacao = new double[quantidade];
	    }
	 
	public void setfilmes(int index, String catalogo, int alugado, double precos) {
		this.filmes[index] = catalogo;
		this.vezesAlugado[index] = alugado;
		this.precosLocacao[index] = precos;
	}
	
	public void getfilmes() {
		for(int c=0;c<this.quantidade; c++){
			System.out.println("Filme: " + this.filmes[c] + " || foi alugado: " + this.vezesAlugado[c] + " || o Preço para aluga-lo é de: R$" 
				+ this.precosLocacao[c]);
		}
	}
	public void faturamentoTodos() {
		double total = 0.0;
		for(int c=0;c<this.quantidade; c++){
			total += precosLocacao[c];
		}
		System.out.println("Se você alugar todos os filmes de uma vez, dá esse valor: R$"+ total);
	}
	public void maisAlugado() {
		int maisalugado = 0;
		String nomedomaisalugado = "";
		for(int c=0;c<this.quantidade;c++) {
			if(maisalugado<vezesAlugado[c]) {
				maisalugado = 0;
				nomedomaisalugado = "";
				maisalugado += vezesAlugado[c];
				nomedomaisalugado = filmes[c];				
			}
		}
		System.out.println("O filme mais alugado é: " + nomedomaisalugado);
	}
	public void alugaFilme(int index, String catalogo, double precos) {
		if(index>this.quantidade || catalogo != filmes[index] ||precos <precosLocacao[index]) {
			System.out.println("O filme não foi alugado por algum motivo...");
		}else {
			System.out.println("\n"+"Filme alugado!!!");
			System.out.println("Atualização da lista dos filmes");
			for(int c=0;c<this.quantidade; c++){
				if(this.vezesAlugado[index] == this.vezesAlugado[c]) {
					this.vezesAlugado[c] += 1;
					}
			System.out.println("\n"+"Filme: " + this.filmes[c] + " || foi alugado: " + (this.vezesAlugado[c]) + " || o Preço para aluga-lo é de: R$" 
					+ this.precosLocacao[c]);
		}
		}
	}
	public void devolverFilme(int index,String catalogo) {
		if(catalogo != filmes[index] || index > this.quantidade) {
			System.out.println("Esse filme não é da nossa locadora!!!");
		}else {
			System.out.println("Filme devolvido...");
		}
	}
	}
