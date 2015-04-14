package br.com.fiap.metodos;

public class Exercicio2{
	
	public static String nome = "Jonas";
	int idade=22;
	
	public static int soma(int x, int y){
		return  x + y;
	}
	 public static void main(String[] args){
		System.out.print("Iniciando! \n");
		System.out.print("O nome eh:" + nome + "\n");
		Exercicio2 e1 = new Exercicio2();
		System.out.print("O nome eh:" + e1.idade + "\n");
		System.out.print("->" + soma(2,3) + "\n");
		
		
	}
}
