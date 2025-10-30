public class Produto{
    public String nome;
    public double preco;
    public int qtd_estoque;
    
    Produto(String nome){
        this.nome = nome;
    }
    Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
    Produto(String nome,double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd;
    }
}