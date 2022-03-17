package Exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String word = " ";
		String newWord = " ";

		System.out.println("Informe uma frase");
		String frase = entrada.nextLine();
		
		System.out.println("deseja mudar alguma palavra?(Informe utilizando SIM ou NAO)");
		String opcao = entrada.nextLine(); 
		if(opcao.equalsIgnoreCase("SIM")) {
			System.out.println("Informe a palavra que será trocada");
			word = entrada.nextLine();
		    System.out.println("Informe a nova palavra");
		    newWord = entrada.nextLine();
		    
		    AplicacaoPergunta app = new AplicacaoPergunta(frase, word);
		    System.out.println(app.trocarPalavra(word, newWord, frase));
			//System.out.println(app.getFrase() + app.getWord());
		}
			
		
        
	}

}
