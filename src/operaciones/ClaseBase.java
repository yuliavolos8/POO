package operaciones;

import java.util.Scanner;

public abstract class ClaseBase {

	protected int num1;
	protected int num2;
	protected int resultado;
	Scanner sc = new Scanner(System.in);

	public void pedirDatos() {
		System.out.println(" Dame el valor de primer numero ");
		num1 = sc.nextInt();
		System.out.println(" Dame el valor de 2 numero " );
		num2 = sc.nextInt();
	}

	public void mostrarResultado() {
		System.out.println(resultado);
	}
	
	public abstract void operciones();
}

