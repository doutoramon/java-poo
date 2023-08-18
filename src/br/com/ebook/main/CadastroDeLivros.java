package br.com.ebook.main;

import br.com.ebook.modelo.Autor;
import br.com.ebook.modelo.Livro;

public class CadastroDeLivros {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.nome = "Ramon dos Santos Silva";
		autor.email = "ramon@meulivro.com";
		autor.cpf = "123.456.789.00";
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Pratico";
		livro.descricao = "Novos Recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "8002-89-22";
		livro.autor = autor;
		
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.nome = "Maria Elis Cunha Silva";
		outroAutor.email = "mariaelis@meulivro.com";
		outroAutor.cpf = "987.654.321.01";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Logica de Programacao";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 39.90;
		outroLivro.isbn = "0800-777-7000";
		
		outroLivro.autor = outroAutor;
		
		outroLivro.mostrarDetalhes();
		
		
		
	}
}
