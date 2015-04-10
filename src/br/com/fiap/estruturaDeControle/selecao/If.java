package br.com.fiap.estruturaDeControle.selecao;

public class If {
	public static void main(String[] args) {
		
		//meu comentario
		int a = 40;
		int b = 60;
		
		if(a > b){
			System.out.println("A > B");
		}else{
			if( a < b ){
				System.out.println("B > A");
			}else{
				System.out.println("A == B");
			}
		}
	}
}
