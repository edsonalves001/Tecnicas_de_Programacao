package br.edu.fatecpg.tecprog.atividade6.model;

public class Loja{
    private String[] nomesProdutos;
    private int[] quantidadeEstoque;
    private double[] precosProdutos;
    private int quantidade;
    
    public Loja(int quantidade){
        this.quantidade = quantidade;
        nomesProdutos = new String[quantidade];
        quantidadeEstoque = new int[quantidade];
        precosProdutos = new double[quantidade];
    }
    public void setProdutos(int index, String nome, double prod,int qtde){
        this.nomesProdutos[index-1]=nome;
        this.quantidadeEstoque[index-1]=qtde;
        this.precosProdutos[index-1]=prod;
    }
    public void getProdutos(){
        for(int i =0; i<this.quantidade; i++){
            System.out.println("Nome: "+ this.nomesProdutos[i]+"\n"
            + "Preço: "+ this.precosProdutos[i]+"\n"
            + "Estoque: "+ this.quantidadeEstoque[i]+"\n");
        }
    }
    public void maisCaroemaisBarato(){
        double valorcaro = 0;
        double valorbarato = Double.MAX_VALUE;
        String nomecaro = "";
        String nomebarato = "";
        for(int i =0; i<this.quantidade; i++){
            if(precosProdutos[i]>valorcaro){
                valorcaro =0;
                nomecaro = "";
                valorcaro = valorcaro+precosProdutos[i];
                nomecaro = nomesProdutos[i];
            }
             if(precosProdutos[i]<valorbarato){
                valorbarato = 0;
                nomebarato = "";
                valorbarato = valorbarato+precosProdutos[i];
                nomebarato = nomesProdutos[i];
            }
        }
                System.out.println("O produto mais caro é: " + nomecaro + "|| seu preço é de: R$" 
                + valorcaro + "\n" + "O produto mais barato é: " + nomebarato + "|| seu preço é de: R$" 
                + valorbarato);
    }
    
    public void valorTotalEstoque(){
        for(int c=0;c<this.quantidade;c++){
        System.out.println("O valor total do Estoque é de: " + (precosProdutos[c]*quantidadeEstoque[c]));
        }
    }
    
    public void compra(int index,int quantidadeComprada){
            if(quantidadeEstoque[index]<quantidadeComprada){
                System.out.println("Não temos essa quantidade disponivel...");
            }else{
            System.out.println("Você comprou: " + quantidadeComprada + " "+nomesProdutos[index] + "\n" +
            "Agora temos " + (quantidadeEstoque[index]-quantidadeComprada) + " itens do "
            + nomesProdutos[index] + " no estoque.");
            
            System.out.println("\n"+"Estoque atualizado do " +nomesProdutos[index]+"\n"+"Nome: "+ this.nomesProdutos[index]+"\n"
                    + "Preço: "+ this.precosProdutos[index]+"\n"
                    + "Estoque: "+ (this.quantidadeEstoque[index]-quantidadeComprada)+"\n");
            }
    }
    public void devolucao(int index,int quantidadeComprada, int quantidadeDevolvida) {
    	if(quantidadeComprada < quantidadeDevolvida) {
    		System.out.println("Não foi possivel fazer a devolução");
    	}else {
    		System.out.println("Os " + quantidadeDevolvida +" do " + nomesProdutos[index] + " foram devolvidas" );
    		System.out.println("\n"+"Estoque atualizado do " +nomesProdutos[index]+"\n"+"Nome: "+ this.nomesProdutos[index]+"\n"
    				+ "Preço: "+ this.precosProdutos[index]+"\n"
    				+ "Estoque: "+ (this.quantidadeEstoque[index]-quantidadeComprada+quantidadeDevolvida)+"\n");
    	}
    	
    
         }
    }