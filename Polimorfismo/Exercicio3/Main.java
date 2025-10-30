public class Main
{
	public static void main(String[] args) {
	    Produto prd1 = new Produto("Abacaxi");
	    Produto prd2 = new Produto("Pessego", 9.99);
	    Produto prd3 = new Produto("Lichia", 11, 5);
	    
	    System.out.println("Nome do produto 1: " + prd1.nome);
	    System.out.println("Nome do produto 2: " + prd2.nome + " || Preço: R$" +prd2.preco);
	    System.out.println("Nome do produto 3: " + prd3.nome + " || Preço: R$" + prd3.preco + " || Quantidade em estoque: " + prd3.qtd_estoque);

	}
}
