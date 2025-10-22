package br.edu.fatecpg.tecprog;
import br.edu.fatecpg.tecprog.Interfaces.Pagamento;

public class pagamentoCartao implements Pagamento {
	public double pagamento;
	
	public double calcularPagamento() {
		 return this.pagamento *1.05;
	}
	public String emitirRecibo() { 
		return "Você realizou um  pagamento de R$" + this.pagamento 
				+ " porém como você pagou pelo cartão, você foi taxado em 5%, ficando R$"
				+ this.pagamento *1.05;
}
}

