package br.com.fiap.colecoes;

public class Collections_ARRAY {

	public static void main(String[] args) {
		//declarando uma variavel do tipo array
		int[] idades = new int[10] ;
		String[] nomes = new String[10] ;
		String[] sexo = {"mas","fem"};
		
		idades[0] = 45 ;
		idades[2] = 64 ;
		nomes[0]  = "Joao" ;
		nomes[2]  = "Maria" ;
		
		System.out.println("O " + nomes[0] + " possui a idade: " + idades[0]);
		System.out.println("A " + nomes[2] + " possui a idade: " + idades[2]);
		
		System.out.println("");
		
		String url           = "www.will.com.br" ; 
		String urlGrande     = "www.come.rcio.inf.antil.site.com.br" ;
		String[] pedacos     = url.split("\\.");
		String[] pedacosSite = urlGrande.split("\\.");
		int posicaoSite      = pedacosSite.length-3;
		
		System.out.println(">>" + pedacos[0]);
		System.out.println(">>" + pedacos[1]);
		System.out.println(">>" + pedacos[2]);
		
		System.out.println("O sexo eh: " + sexo[1]);
		
		System.out.println("O vetor de idades tem: " + idades.length + " posicoes");
		
		System.out.println("O site eh:" + pedacosSite[posicaoSite]);
	}

}




