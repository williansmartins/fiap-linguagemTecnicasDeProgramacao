package br.com.fiap.hello;

public class HelloWorld {
	
	int idade;
	static Cachorro c1;
	static Cachorro c2 = new Cachorro();
	
	public static void main(String[] args) {
		System.out.println(c1);
		System.out.println(c2);
	}

}

class Cachorro{
	Cachorro cachorrinho1;
	Cachorro cachorrinho2;
	Cachorro cachorrinho3;
}