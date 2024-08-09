package Libros;

public class Libro {

	private int isbn;
	private String autor;
	private String titulo;
	private static int contador = 0;

	public Libro(int isbn, String autor, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		contador++;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + "]";
	}
  
}
