package br.edu.fatecpg.tecprog;
public class Main {

	public static void main(String[] args) {
		
		  calculadora calc = new calculadora();
		  
		  System.out.println(calc.soma(5,4)); System.out.println(calc.divisao(10, 2));
		  System.out.println(calc.subtracao(10, 1));
		  System.out.println(calc.divisao(10, 5));
		  System.out.println(calc.multiplicacao(5,5));
		  
		  pagamentoCartao nubank = new pagamentoCartao(); pagamentoDinheiro real = new
		  pagamentoDinheiro();
		  
		  nubank.pagamento = 100; nubank.calcularPagamento();
		  System.out.println(nubank.emitirRecibo());
		  
		  real.pagamento = 100; real.calcularPagamento();
		  System.out.println(real.emitirRecibo());
		 
		
		SistemadeSeguranca seguranca = new SistemadeSeguranca();
		ClasseDTeste teste = new ClasseDTeste();
		teste.informarValores();
		System.out.println(seguranca.login(teste.usuario,teste.senha));
		System.out.println(seguranca.logout());
		System.out.println(seguranca.logout());
		teste.informarValores();
		System.out.println(seguranca.login(teste.usuario,teste.senha));


}
}

