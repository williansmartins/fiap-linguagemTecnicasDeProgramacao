package br.com.fiap.interacaoComUsuario;

import java.util.Scanner;


public class UsuarioVetores {


	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in) ;
		String digitado = "s";
		String nome;
		
		while(digitado.equals("s"))
		{
			System.out.println("Digite seu nome:");
			nome = leitor.nextLine();
			System.out.println("Bem vindo:" + nome);
			System.out.println("Dseseja continuar?");
			digitado = leitor.nextLine();
			
		}

		
		System.out.println( "Obrigado por participar!!" ) ;
	}

}





