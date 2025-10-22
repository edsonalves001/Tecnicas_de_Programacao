package br.edu.fatecpg.tecprog; 
import java.util.Scanner;
public class ClasseDTeste {
	public String usuario;
	public String senha;
	
	public void informarValores() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o usuario:");
		this.usuario = scan.next();
		System.out.println("Digite sua senha");
		this.senha = scan.next();
		scan.close();
	}
}
