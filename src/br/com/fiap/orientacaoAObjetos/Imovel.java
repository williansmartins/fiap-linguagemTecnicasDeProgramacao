package br.com.fiap.orientacaoAObjetos;

import br.com.fiap.enums.TipoDoImovel;

public class Imovel {

	public String titulo;
	public String cidade;
	public int comodos;
    public double tamanho;
	public float preco;
	public TipoDoImovel tipo;

	public String mostrarCarrosel(int id){
		return "";	
    }
	
	public String mostrarQuadrant(int id) {
		return "";
	}

	@Override
	public String toString() {
		return "Imovel [titulo=" + titulo + ", cidade=" + cidade + ", comodos="
				+ comodos + ", tamanho=" + tamanho + ", preco=" + preco
				+ ", tipo=" + tipo + "]";
	}
	
	
}