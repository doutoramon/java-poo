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

		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("-----------------------------------");
	}
	
	public void aplicaDescontoDe(double porcentagem) {
		this.valor -= this.valor * porcentagem;
	}

	boolean temAutor() {
		return this.autor != null;
	}
}
