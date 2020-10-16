package aplicacao;

import entidades.animal;
import entidades.cachorro;
import entidades.cavalo;
import entidades.preguica;


public class SistemaSelvagem {

	public SistemaSelvagem() {
		 
	}

	public static void main(String[] args) {
		
		animal mundoAnimalesco = new animal ("",0);
		animal cavalinho = new cachorro ("Perseu",2);
		animal perseu = new cavalo ("Foguete ",8);
		animal preguicaBicho = new preguica ("Sid",15);

		
		
		System.out.println("********************************CACHORRO******************************");
		
		System.out.println("Nome: " +perseu.getNome()+ " e tem " +perseu.getIdade()+ "  idade ");
		perseu.correr();
		System.out.println("Perseu conversando :");
		perseu.emitirSom();
		
		System.out.println("********************************CAVALO******************************");
		
		System.out.println("Nome: " +cavalinho.getNome()+ " e tem " +cavalinho.getIdade()+ "  idade ");
		cavalinho.correr();
		System.out.println("cavalinho conversando :");
		cavalinho.emitirSom();
		
		
		System.out.println("********************************BICHO PREGUIÇA******************************");
		System.out.println("Nome: " +preguicaBicho.getNome()+ " e tem " +preguicaBicho.getIdade()+ "  idade ");
		preguicaBicho.correr();
		System.out.println("Preguiça conversando :");
		preguicaBicho.emitirSom();

	 
 
	}

}
