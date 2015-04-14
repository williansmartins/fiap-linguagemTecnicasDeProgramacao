package br.com.fiap.metodos;

public class If{
	public static void verifica(int x, int y){
		if(x>y){
			System.out.print("Valor de X eh maior -> " + x + ">" + y);
		}else if(y>x){
			System.out.print("Valor de Y eh maior -> "+ y + ">" + x);
		}else{
			System.out.print("Os valores sao iguais -> "+ x + "=" + y);		
		}
	}
	public static void main(String[ ] args){
		verifica(14,9);
		System.out.print("fsdfdsfs");
	}
}
