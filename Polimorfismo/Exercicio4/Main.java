public class Main
{
	public static void main(String[] args) {
	   PagamentoCartao cartao = new PagamentoCartao();
	   PagamentoBoleto boleto = new PagamentoBoleto();
	   System.out.println(boleto.processarPagamento());
	   System.out.println(cartao.processarPagamento());
	}
}
