package br.edu.fatecpg.tecprog.atividade6.view;
import br.edu.fatecpg.tecprog.atividade6.model.*;
class Main {
	public static void main(String[] args) {
		
		/*EXERCICIO 1 
		 * Loja Lojinha = new Loja(3); Lojinha.setProdutos(1,"produto1",100.0,22);
		 * Lojinha.setProdutos(2,"produto2",200.0,100);
		 * Lojinha.setProdutos(3,"produto3",300.0,10); Lojinha.getProdutos();
		 * Lojinha.maisCaroemaisBarato(); Lojinha.valorTotalEstoque();
		 * Lojinha.compra(1,10); Lojinha.devolucao(1,10,10);
		 */
		
		/*EXERCICIO 2
		
		Videolocadora alocafilmes = new Videolocadora(6);
		alocafilmes.setfilmes(0, "A casa monstro", 100, 10.0);
		alocafilmes.setfilmes(1, "Vingadores ultimato", 999, 17.0);
		alocafilmes.setfilmes(2, "O diabo veste prada", 666, 66.6);
		alocafilmes.setfilmes(3, "Super mario bros", 5, 11.4);
		alocafilmes.setfilmes(4, "Sonic 4", 0, 1000.0);
		alocafilmes.setfilmes(5, "Minecraft", 123, 500.0);

		alocafilmes.getfilmes();
		alocafilmes.faturamentoTodos();
		alocafilmes.maisAlugado();
		alocafilmes.alugaFilme(1, "Vingadores ultimato", 17.0);
		alocafilmes.devolverFilme(1, "Vingadores ultimato");
		*/
		
		/*EXERCICIO 3*/
		
		Biblioteca bibliocps = new Biblioteca(4);
		bibliocps.setlivros(0, "O hobbit", 0, 5);
		bibliocps.setlivros(1, "Harry potter", 5,4);
		bibliocps.setlivros(2, "Biblia", 10,3);
		bibliocps.setlivros(3, "Do mil ao milhão sem cortar o cafezinho", 7, 2);
		bibliocps.getlivros();
		bibliocps.multaTotalAcumulada();
		bibliocps.mediadiasatrasados(3, 7, 2);
		System.out.println("\n");
		bibliocps.emprestarLivro(1);
		bibliocps.getlivros();
		bibliocps.emprestarLivro(1);
		System.out.println("\n");
		bibliocps.devolverLivro(1,2);
		bibliocps.getlivros();
		bibliocps.devolverLivro(1,4);

	}
}
