package br.com.fiap.estruturaDeControle.selecao;

public class If {
	public static void main(String[] args) {
		
		int a = 20;
		int b = 20;
		
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
