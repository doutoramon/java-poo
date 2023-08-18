package br.com.ebook.modelo;

public class Livro {

	public String nome;
	public String descricao;
	public double valor;
	public String isbn;
	public Autor autor;

	public void mostrarDetalhes() {
		String mensagem = "Mostrando os detalhes do livro: ";
		System.out.println(mensagem);
		System.out.println("Nome: "+nome);
		System.out.println("Descrocao: "+descricao);
		System.out.println("Valor: "+valor);
		System.out.println("Isbn: "+isbn);
		autor.mostrarDetalhes();
		System.out.println("--------------------");
	}
	
	public void aplicaDescontoDe(double porcentagem) {
		valor -= valor * 0.1;
	}
}
