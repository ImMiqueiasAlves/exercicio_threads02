package controller;

public class MatrizThread extends Thread {
	private int linha;
	private int[] vetor;
	
	public MatrizThread(int linha, int[] vetor) {
		this.linha = linha;
		this.vetor = vetor;
	}
	public void run() {
		 int soma = 0;
		 for(int i=0; i < vetor.length; i++) 
			 soma += vetor[i];
		 System.out.println("Linha " + linha + " - Soma: " + soma);
	}
}
