package br.com.fiap.metodos;

public class For{
	public static void acao(int x){
		for(int i=0 ; i<=x ; i++){
			System.out.print("Valor de X: " + i + "\n");
		}
	}
	static public void main(String[ ] args){
		acao(8);		
	}
}

