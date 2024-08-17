package EmpleadoHerencia;

public class Empleado implements Calculable {
	protected String nombreCompleto;
	private static double sueldoBase = 1600;

	public Empleado(String nomb, double sueldoBase) {
		this.nombreCompleto = nomb;
		this.sueldoBase = sueldoBase;
	}

	public String getNombreCompleto() {
		String nombreMayusculas = nombreCompleto.toUpperCase();
		return nombreMayusculas;
	}

	public String getNombreMayusculas() {

		char espacio = ' ';
		char caracterEsapcio;
		int posBuscada = -1;
		for (int pos = 0; pos < nombreCompleto.length(); pos++) {

			if (nombreCompleto.charAt(pos) == espacio) {
				posBuscada = pos;
				break;
			}
		}

		String nombre = this.nombreCompleto.substring(0, 1).toUpperCase()
				+ this.nombreCompleto.substring(1, posBuscada).toLowerCase();

		String apellido = this.nombreCompleto.substring(posBuscada + 1, posBuscada + 2).toUpperCase()
				+ this.nombreCompleto.substring(posBuscada + 2).toLowerCase();
		String completo = nombre + " " + apellido;
		return completo;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double calcularSalario() {
		return sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado [nombreCompleto=" + nombreCompleto + ", getNombreCompleto()=" + getNombreCompleto()
				+ ", getSueldoBase()=" + getSueldoBase() + ", calcularSalario()=" + calcularSalario() + "]";
	}

	@Override
	public double calcularSueldoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
