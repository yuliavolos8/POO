package EmpleadoHerencia;

public class EmpleadoPorHoras extends Empleado {
	public int horasTrabajadas;
	public static final double precioExtrahora = 15.5;

	public EmpleadoPorHoras(String nomb, double sueldo, int horas) {
		super(nomb, sueldo);
		this.horasTrabajadas = horas;

	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public static double getPrecioExtrahora() {
		return precioExtrahora;
	}

	@Override
	public double calcularSueldoTotal() {

		double sueldoMes = this.getSueldoBase() + this.horasTrabajadas * this.precioExtrahora;
		return sueldoMes;
	}

	@Override
	public String toString() {
		return "EmpleadoPorHoras [  horasTrabajadas = " + getHorasTrabajadas() + ", sueldo total: "
				+ calcularSueldoTotal() + "]";
	}

	public static void main(String args[]) {
// haciendo test
		Empleado empleado1 = new EmpleadoPorHoras("pablo moreno", 1600, 3);
		System.out.println(empleado1.getNombreCompleto());
		System.out.println(empleado1.toString());
		System.out.println(empleado1.getNombreMayusculas());

		System.out.println("----------------------------------------------");
		Empleado empleado2 = new EmpleadoBonificacion("Ana garcia", 1600, 150.0);
		System.out.println(empleado2.getNombreCompleto().toString());
		System.out.println("el sueldo total mas  la bonficacion Es :" + empleado2.calcularSueldoTotal() + " euros");
		System.out.println("__________________________________________________________");

	}
}
