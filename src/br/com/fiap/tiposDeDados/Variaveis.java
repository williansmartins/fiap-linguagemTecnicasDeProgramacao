package br.com.fiap.tiposDeDados;

public class Variaveis 
{

	public static void main(String[] args)
	{
		//Não primitiva
		String valorString = "Texto" ;
		
		//Numéricos inteiros
		byte valorByte       = 127 ;
		short valorShort     = 32767 ;
		int valorInteiro     = 2147483647 ;
		long valorLong       = 92233720 ; 
		
		//Numéricos Reais
		double valorDouble   = 1.79669313486231570e+308d ;
		float valorFloat     = 3.40282346638528860e+38f ;
		
		//Caractere
		char valorChar       = 'a';
		
		//Booleano
		boolean valorBoolean = true ;
		
		System.out.println("String="  + valorString);
		System.out.println("Inteiro=" + valorInteiro);
		System.out.println("Short="   + valorShort);
		System.out.println("Byte="    + valorByte);
		System.out.println("Long="    + valorLong);
		System.out.println("Double="  + valorDouble);
		System.out.println("Float="   + valorFloat);
		System.out.println("Char="    + valorChar);
		System.out.println("Boolean=" + valorBoolean);

	}


}
