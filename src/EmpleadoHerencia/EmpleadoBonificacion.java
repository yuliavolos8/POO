package EmpleadoHerencia;

public class EmpleadoBonificacion extends Empleado {

	private double bonificacion;

	public EmpleadoBonificacion(String nombreCompleto, double sueldo, double bonif) {
		super(nombreCompleto, sueldo);
		this.bonificacion = bonif;

	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public double calcularSueldoTotal() {

		double total = this.getSueldoBase() + this.bonificacion;
		return total;
	}

	@Override
	public String toString() {
		return "EmpleadoBonificacion [ sueldo  es : " + this.getSueldoBase() + " bonificacion=" + bonificacion + "]";
	}

}
