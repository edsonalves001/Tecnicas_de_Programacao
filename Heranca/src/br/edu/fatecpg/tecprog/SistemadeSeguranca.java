package br.edu.fatecpg.tecprog;
import br.edu.fatecpg.tecprog.ClasseDTeste;
import java.util.Scanner;

import br.edu.fatecpg.tecprog.Interfaces.Autenticavel;

public class SistemadeSeguranca implements Autenticavel {
	public String usuario = "admin";
	public String senha = "1234";
	public boolean valorBooleano = false; 
    ClasseDTeste teste = new ClasseDTeste();
    
	public String login(String usuario, String senha) {
		if(valorBooleano) {
			return "Você já está logado";
		}
		
		if(usuario.equals(null) && senha.equals(null)){
		    teste.informarValores();
		}
		
		if(usuario.equals(this.usuario) && senha.equals(this.senha)) {
			valorBooleano = true;
			return "Seja bem-vindo " + usuario;
		}else {
		    System.out.print("Acesso negado, tente novamente..." + "\n");
		    /*O eclipse deu problema com a recursividade, algo relacionado ao 
		     console do eclipse, porém eu testei no compilador online e funcionou perfeitamente*/
		    teste.informarValores();
			return login(teste.usuario,teste.senha);
			
		}
}
	
	
	public String logout() {
		if(valorBooleano) {
		    valorBooleano = false;
		    teste.usuario = null;
		    teste.senha = null;
			return "Deslogando...";
		}else {
			return "Você tem que estar logado para se deslogar";
		}
	}
}


