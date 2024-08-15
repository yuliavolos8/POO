package enumParaTallas;

public class Ropa {
	public enum Talla {
		XS, S, M, L, XL, XXL
	};

	public enum Tipo {
		Vestido, Pantalon, Falda, Camisa, Camiseta, Chaqueta
	};

	private Tipo prenda;
	private Talla talla;

	public Ropa(Tipo prenda, Talla t) {
		this.prenda = prenda;
		this.talla = t;
	}

	public String getPrenda() {
		return prenda.toString() + " talla " + talla.toString();
	}

	public void setPrenda(Tipo opcion) {
		this.prenda = opcion;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla t) {
		this.talla = t;
	}

	public static void main(String args[]) {
		Ropa ropa = new Ropa(Tipo.Camisa, Talla.S);
		System.out.println(ropa.getPrenda());
		ropa.setTalla(Talla.XL);
		System.out.println(ropa.getPrenda());
		ropa.setPrenda(Tipo.Chaqueta);
		System.out.println(ropa.getPrenda());
	}

}
