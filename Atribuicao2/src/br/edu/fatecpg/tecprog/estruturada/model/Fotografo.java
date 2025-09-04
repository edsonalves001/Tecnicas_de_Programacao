package br.edu.fatecpg.tecprog.estruturada.model;

public class Fotografo {
	public String nome;
	public int idade;
	public String equipamento;
	public String portfolio;
	public String area;
	public boolean fotossecretas = false;
	public boolean organizar = false;

	public void organizarambiente() {	
		if(organizar) {
			System.out.println("Organizando ambiente");
			organizar = true;
		}else {
			System.out.println("Ambiente já foi organizado...");
		}
	}
	
	public void fotografar() {
		if(organizar) {
			System.out.println("X, Tirando foto..");
			fotossecretas = true;
		}else {
			System.out.println("Foto já foi tirada...");
		}
	}
	
	public void edicao() {
		if(fotossecretas) {
			System.out.println("Sem fotos para editar...");
			fotossecretas = false;
		}else {
			System.out.println("Editando foto...");
		}
	}
}
