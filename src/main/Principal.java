package main;

import operaciones.ClaseDerivada_Resta;
import operaciones.ClaseDerivada_Suma;
import operaciones.ClaseBase;

public class Principal {
	public static void main(String[] args) {
		ClaseBase hija1 = new ClaseDerivada_Resta();

		hija1.pedirDatos();
		hija1.operciones();
		System.out.print("el resultado de la resta es: ");
		hija1.mostrarResultado();
		System.out.println("-------------------");
		ClaseBase hija2 = new ClaseDerivada_Suma();
		hija2.pedirDatos();
		hija2.operciones();
		System.out.println("el resultado de la resta es: ");
		hija2.mostrarResultado();
	}
}
