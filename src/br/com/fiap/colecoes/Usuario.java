package br.com.fiap.colecoes;

import java.util.ArrayList;
import java.util.Scanner;


public class Usuario {


	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in) ;
		String digitado = "s";
		ArrayList<String> lista = new ArrayList<String>();
		
		while(digitado.equalsIgnoreCase("s")||digitado.equalsIgnoreCase("sim"))
		{
			System.out.println("Digite um valor:") ;
			digitado = leitor.nextLine() ;
			lista.add(digitado) ;
			System.out.println( "Lista atual:" + lista) ;
			System.out.println( "Deseja continuar?") ;
			digitado = leitor.nextLine() ;
			
		}

		
		System.out.println( "Obrigado por participar!!" ) ;
	}

}





