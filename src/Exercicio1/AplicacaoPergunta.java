package Exercicio1;

import java.util.Scanner;

public class AplicacaoPergunta {
	  private String frase = " ";
	  private String word= " ";
	  
	  public AplicacaoPergunta(String frase, String word) {
		  this.setFrase(frase);
		  this.setWord(word);
	  }
	  
	
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public AplicacaoPergunta() {
		  
	  }
	
	public String updatePalavra(String text) {
		
		return text;
		
	}

	public String trocarPalavra(String palavra1, String palavra2, String frase) {
		String novaFrase = frase.replace(palavra1, palavra2);
		
		return novaFrase;
		
	}
}
