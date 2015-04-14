package br.com.fiap.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Collections 
{
	public static void main(String[] args) 
	{
		//TRABALHANDO COM ARRAYLIST
		ArrayList lista =  new ArrayList();
		ArrayList lista2 =  new ArrayList();
		
		lista2.add( "Pedro" ) ;
		
		lista.add( "Joao" ) ;
		lista.add( "1234" ) ;
		lista.addAll( lista2 ) ;
		
		
		System.out.println( "Tamanho: " + lista.size( ) );
		System.out.println( "Valor1: " + lista.get( 0 ) ) ;
		System.out.println( "Valor3: " + lista.get( 2 ) ) ;
		
		System.out.println( lista ) ; 
		java.util.Collections.sort( lista ) ; 
		System.out.println( lista ) ; 
		
		
		//TRABALHANDO COM SET
		Set conjunto = new HashSet( );
		conjunto.add( "item 5" ) ;
		conjunto.add( 123 ) ;
		conjunto.add( "item 1" ) ;
		conjunto.add( "item 2" ) ;
		conjunto.add( "item 3" ) ;
		conjunto.add( "item 3" ) ;
		
		System.out.println("Conjunto:" + conjunto) ;
		Iterator o = conjunto.iterator();  
		while (o.hasNext()) {  
	       String  valor = (String)o.next();  
	       System.out.println( valor );  
		} 
		
		//TRABALHANDO COM MAP
		Map<String, Double> mapa = new HashMap<String, Double>( ) ;
		mapa.put("oi", 77d );
		mapa.put("Gerente", 5000d );
		mapa.put("Coordenador", 2500.25 );
		
		//System.out.println("O maior salario eh: " + mapa.value;
		
	}
}
