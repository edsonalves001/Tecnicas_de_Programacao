package br.edu.fatecpg.tecprog;

public class Interfaces {
	interface OperacaoMatematica{
		public double soma(double a, double b);
		public double subtracao(double a, double b);
		public double multiplicacao(double a, double b);
		public double divisao(double a, double b);
	}
	interface Pagamento{
		public double calcularPagamento();
		public String emitirRecibo();
	}
	interface Autenticavel{
		public String login(String usuario, String senha);
		public String logout();
	}

}
