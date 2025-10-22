package br.edu.fatecpg.tecprog;
import br.edu.fatecpg.tecprog.Interfaces.Pagamento;

public class pagamentoDinheiro implements Pagamento {

	public double pagamento;
	
	public double calcularPagamento() {
		return this.pagamento*0.9;
	}
	public String emitirRecibo() { 
		return "Você realizou um  pagamento de R$" + this.pagamento 
				+ " porém como você pagou com dinheiro, você teve um desconto de 10%, ficando R$"
				+ this.pagamento*0.9 ;
}
}
