package br.com.ebook.main;

import br.com.ebook.modelo.Livro;

public class RegrasDeDesconto {
	
	    public static void main(String[] args) {

	        Livro livro = new Livro();	
	        System.out.println("Valor atual: "+livro.retornaValor());

	       if(!livro.aplicaDescontoDe(0.4)) {
	            System.out.println("Desconto nao pode ser maior que 30%");
	        } else {
	           //System.out.println("Valor com desconto: "+livro.valor);
	       }

	}
}
