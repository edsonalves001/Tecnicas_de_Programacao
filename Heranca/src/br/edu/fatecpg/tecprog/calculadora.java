package br.edu.fatecpg.tecprog;
import br.edu.fatecpg.tecprog.Interfaces.OperacaoMatematica;

 public class calculadora implements OperacaoMatematica{

	 public double soma(double n1,double n2) {
		double somado = n1+n2;
		return somado;
	}
	public double subtracao(double n1, double n2) {
		if(n1>n2) {
			double subtracao = n1-n2;
			return subtracao;
		}else {
			double subtracao = n2-n1;
			return subtracao;
		}
	}
	public double multiplicacao(double n1, double n2) {
		double multiplicacao = n1*n2;
		return multiplicacao;
	}
	public double divisao(double n1, double n2) {
		if(n1>n2) {
			double divisor = n1/n2;
			return divisor;
		}else {
			double divisor = n2/n1;
			return divisor;
		}
	}
}
 

