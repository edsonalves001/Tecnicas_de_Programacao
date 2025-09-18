package br.edu.fatecpg.tecprog.atividade6.model;

public class Biblioteca {
	private String[] livros;
	private int[] diasdAtraso;
	private double[] valorMultaporDia;
	private boolean[] emprestado;
	
	public int quantidade;
	
	public Biblioteca(int quantidade) {
		this.quantidade = quantidade;
		livros = new String [quantidade];
		diasdAtraso = new int[quantidade];
		valorMultaporDia = new double[quantidade];
		emprestado = new boolean[quantidade];
	}
	
	public void setlivros(int index, String livro, int qtddatraso, double precomultapordia) {
		this.livros[index] = livro;
		this.diasdAtraso[index]=qtddatraso;
		this.valorMultaporDia[index]=precomultapordia;
	}
	
	public void getlivros() {
		for(int c =0; c<this.quantidade; c++) {
			System.out.println("Livro: "+this.livros[c]+ " || Atraso de: " + this.diasdAtraso[c]
					+ " || Multa a pagar: " + this.valorMultaporDia[c]);
		}
	}
	public void mediadiasatrasados(int index,int qtddatraso, double precomultapordia) {
		if(qtddatraso != this.diasdAtraso[index] || precomultapordia != this.valorMultaporDia[index]) {
			System.out.println("Algo de errado foi inserido...");
		}else {
		if(qtddatraso == 0) {
			System.out.println("Parabéns, você não tem pedencias");
		}else {
			System.out.println("Multa pendente: R$" + (qtddatraso*precomultapordia));
		}}
	}
	public void  multaTotalAcumulada() {
		double total =0;
		for(int c=0; c<this.quantidade ;c++) {
		total += this.diasdAtraso[c]*this.valorMultaporDia[c];
		}
		System.out.println("\n"+"Multa de todos os livros com pedencia: R$" + total);
	}
	 public void emprestarLivro(int index) {
	        if (index >= 0 && index < quantidade) {
	            if (this.emprestado[index]) {
	                System.out.println("O livro '" + this.livros[index] + "' já está emprestado.");
	            } else {
	                this.emprestado[index] = true; // Marca como emprestado
	                System.out.println("O livro '" + this.livros[index] + "' foi emprestado com sucesso.");
	            }
	        } else {
	            System.out.println("Índice inválido.");
	        }
	    }

	 public void devolverLivro(int index, int diasAtraso) {
	        if (index >= 0 && index < quantidade) {
	            if (!this.emprestado[index]) {
	                System.out.println("Este livro não foi emprestado.");
	            } else {
	                this.diasdAtraso[index] += diasAtraso;
	                this.emprestado[index] = false; 
	                double multa = this.diasdAtraso[index] * this.valorMultaporDia[index];
	                System.out.println("O livro '" + this.livros[index] + "' foi devolvido. Multa a pagar: R$" + multa);
	            }
	        } else {
	            System.out.println("Índice inválido.");
	        }
	    }
	

	
}
