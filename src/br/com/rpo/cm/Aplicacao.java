package br.com.rpo.cm;

import br.com.rpo.cm.modelo.Tabuleiro;
import br.com.rpo.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 34);
		
		new TabuleiroConsole(tabuleiro);
		
		
	}

}