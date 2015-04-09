package br.com.fiap.execucao;

import javax.swing.JOptionPane;

import br.com.fiap.entidade.Imovel;

public class Executadora {

	
	public static void main(String[] args) {
		Imovel casa = new Imovel();
		
		String d_titulo = JOptionPane.showInputDialog("digite o titulo");
		String d_cidade = JOptionPane.showInputDialog("digite a cidade");
		String d_comodos = JOptionPane.showInputDialog("digite a quantidade de comodos");
		String d_tamanho = JOptionPane.showInputDialog("digite o tamanho");
		String d_preco = JOptionPane.showInputDialog("digite o preco");
		
		casa.titulo = d_titulo;
		casa.cidade = d_cidade;
		casa.comodos = Integer.parseInt(d_comodos);
		casa.tamanho = Double.parseDouble(d_tamanho);
		casa.preco = Float.parseFloat(d_preco);
		
		System.out.println(casa.toString());
	}
}
