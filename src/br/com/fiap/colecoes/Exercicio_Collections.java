package br.com.fiap.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Exercicio_Collections {
	public static void main(String[] args)
	{
		Map<String, Integer> idades = new HashMap<String, Integer>( ) ; 
		idades.put("Dennis",     21);
		idades.put("Renato",     30);
		idades.put("Tiago",      21);
		idades.put("Alberto",    33);
		idades.put("Leandro",    26);
		idades.put("Marcos",     25);
		idades.put("Everton",    19);
		idades.put("Adonias",    28);
		idades.put("Luis",       45);
		idades.put("Wellington", 27);
		
		Map<String, Integer> celulares = new HashMap<String, Integer>( ) ; 
		celulares.put("oi",     7894-9685);
		celulares.put("vivo",   6894-9685);
		celulares.put("tim",    7894-9685);
		celulares.put("claro",  8894-9685);
		celulares.put("oi",     5894-9685);
		celulares.put("tim",    2894-9685);
		
		Set<String> operadoras = new HashSet<String>( ) ;
		operadoras.add( "tim" );
		operadoras.add( "vivo" );
		operadoras.add( "oi" );
		operadoras.add( "tim" );
		operadoras.add( "claro" );
		operadoras.add( "oi" );
		
		List lista = new ArrayList( ) ;
		lista.add( idades ) ;
		lista.add( celulares ) ;
		lista.add( operadoras ) ;
		System.out.println(lista);
		System.out.println(idades.get("Leandro"));
		
		
		
		
		
	}
}
