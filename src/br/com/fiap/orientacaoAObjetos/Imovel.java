package br.com.fiap.orientacaoAObjetos;

import br.com.fiap.enums.TipoDoImovel;

public class Imovel {

	public String titulo;
	public int comodos;
    public double tamanho;
	public TipoDoImovel tipo;
	public String cidade;
	public float preco;

	public String mostrarCarrosel(int id){
		return "";	
    }
	
}

class Apartamento extends Imovel{
	private boolean sacada;
	public int andar;
	public int bloco;
}

