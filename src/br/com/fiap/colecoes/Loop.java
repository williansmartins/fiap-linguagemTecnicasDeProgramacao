package br.com.fiap.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Loop {

	
	public static void main(String[] args) 
	{
		int[] idades = new int[10];
		idades[0] = 3 ;
		idades[1] = 20 ;
		idades[2] = 30 ;
		idades[3] = 40 ;
		idades[4] = 50 ;
		idades[5] = 60 ;
		idades[6] = 70 ;
		idades[7] = 80 ;
		idades[8] = 90 ;
		idades[9] = 100 ;
		
		
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		System.out.println(idades[3]);
		System.out.println(idades[4]);
		System.out.println(idades[5]);
		System.out.println(idades[6]);
		System.out.println(idades[7]);
		System.out.println(idades[8]);
		System.out.println(idades[9]);
		
		ArrayList <String> lista= new ArrayList<String>(); 
		lista.add("Jo�o") ;
		lista.add("Maria") ;
		lista.add("Pedro") ;
		lista.add("Carlos") ;
		lista.add("Juquinha") ;
		lista.add("Pedrinho") ;
		lista.add("Dubrovisk") ;
		lista.add("Fernanda") ;
		lista.add("Joana") ;
		lista.add("Dark") ;
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.get(3));
		System.out.println(lista.get(4));
		System.out.println(lista.get(5));
		System.out.println(lista.get(6));
		System.out.println(lista.get(7));
		System.out.println(lista.get(8));
		System.out.println(lista.get(9));

		Map<String, String> pessoa1 =  new HashMap<String, String>() ;
		pessoa1.put("nome", "Jo�o") ;
		pessoa1.put("idade", "25") ;
		pessoa1.put("sexo", "M") ;
		
		
		Map<String, String> pessoa2 =  new HashMap<String, String>() ;
		pessoa2.put("nome", "Maria") ;
		pessoa2.put("idade", "30") ;
		pessoa2.put("sexo", "F") ;
		
		System.out.println(pessoa1.get("idade"));
		
		ArrayList <Map> pessoas = new ArrayList<Map>() ;
		pessoas.add(pessoa1) ;
		pessoas.add(pessoa2) ;
		
		System.out.print(pessoas.get(1).get( "nome" ) );
		System.out.print("-" + pessoas.get(1).get( "idade" ) );
		System.out.println("-" + pessoas.get(1).get( "sexo" ) );
		
		Map joao    = pessoas.get( 0 ) ;
		String nome = joao.get( "nome" ).toString() ; 
		int idade   = Integer.parseInt( joao.get( "idade" ).toString() ) ; 
		String sexo = joao.get( "sexo" ).toString() ; 
		
		System.out.println(nome + " - " + idade + " anos - sexo:" + sexo);
		
		for (int i = 0; i < 5; i++) {
			
			idades[i] = idades[i]/2 ;
			System.out.println("Posi��o:" + i + ":" +idades[i]);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}		
		
		
		
		
		
	}

}









