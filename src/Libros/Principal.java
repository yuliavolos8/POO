package Libros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		ArrayList<Libro> libros = new ArrayList<>();

		libros = addLibros();
		print(libros);
		// Ordenar la lista por autor
		Collections.sort(libros, new Comparator<Libro>() {
			@Override
			public int compare(Libro l1, Libro l2) {
				return l1.getAutor().compareTo(l2.getAutor());
			}
		});
		System.out.println("-------------------------------------------------------");

		try {
			Libro l = new Libro(12311, "Susana Delgado", "Amanecer");
			aniadirLibro(libros, l);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		print(libros);
		System.out.println("cantidad total de libros " + libros.size());

		System.out.println("---------------------------------------------------");
		try {
			Libro libro = new Libro(1332, "Roman Lopez", "Scarlet Ojara");
			eliminarLibro(libros, libro);
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}
		print(libros);
		System.out.println("cantidad total de libros " + libros.size());

		try {
			String titulo = "Amanecer";
			buscarPorTitulo(libros, titulo);
			System.out.println("Libro encontrado se lama :" + titulo);
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}
		System.out.println("____________________________________");

		String titulo = "Entre nosotras";
		int pos = posBuscada(libros, titulo);
		System.out.println("libro se encuentra en la posicon :" + pos);
	}

	public static ArrayList<Libro> addLibros() {
		ArrayList<Libro> libros = new ArrayList<>();
		libros.add(new Libro(1234, "Susana Delgado", "Amanecer"));
		libros.add(new Libro(1229, "Ana Delgado", "Atardecer"));
		libros.add(new Libro(1234, "Margarita Blanco", "Anochecer"));
		libros.add(new Libro(1332, "Roman Lopez", "Scarlet Ojara"));
		libros.add(new Libro(1214, "Olga Gomez", "CNN"));
		libros.add(new Libro(1235, "Olaia Fernandez", "Entre nosotras"));

		return libros;
	}

	Libro l = new Libro(1231, "Maria Delgado", "Amanecer");

	public static void print(ArrayList<Libro> libros) {
		for (Libro l : libros) {
			System.out.println(l);
		}
	}

	public static void aniadirLibro(ArrayList<Libro> libros, Libro l) throws Exception {
		try {
			for (Libro lib : libros) {
				if (lib.getIsbn() == l.getIsbn()) {
					throw new Exception("este libro ya existe");
				}
			}
			libros.add(l);
		} catch (Exception E) {
			throw E;

		}

	}

	public static void eliminarLibro(ArrayList<Libro> libros, Libro libro) throws Exception {
		try {
			for (int pos = libros.size() - 1; pos >= 0; pos--) {
				Libro l = libros.get(pos);
				if (l.getIsbn() == libro.getIsbn()) {
					libros.remove(pos);
					return;
				}
			}
			throw new Exception("libro no encontrado");
		} catch (Exception E) {
			System.out.println(E.getMessage());
			throw E;
		}
	}

	public static Libro buscarPorTitulo(ArrayList<Libro> libros, String titulo) throws Exception {

		try {
			for (int pos = 0; pos < libros.size(); pos++) {
				Libro lib = libros.get(pos);
				if (lib.getTitulo().equalsIgnoreCase(titulo)) {
					return lib;
				}

			}

			throw new Exception("libro con ese titulo no existe");
		} catch (Exception E) {
			E.getMessage();
			throw E;
		}
	}

	public static int posBuscada(ArrayList<Libro> libros, String tit) {
		int posBuscada = -1;
		for (int pos = 0; pos < libros.size(); pos++) {
			String t = libros.get(pos).getTitulo();
			if (tit.equalsIgnoreCase(t)) {
				posBuscada = pos;

			}
		}
		return posBuscada;
	}

	public int compare(Libro l1, Libro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}

}
