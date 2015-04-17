package br.com.fiap.orientacaoAObjetos;

public class ExecucaoCachorro {
	public static void main(String[] args) {
		Dono d = new Dono();
		d.nome = "willians";
		d.salario = 1000;
		d.idade = 32;
		
		Cachorro c = new Cachorro();
		c.nome = "Pluto";
		c.raca = "Beagle";
		
		d.c1 = c;
	}
}
