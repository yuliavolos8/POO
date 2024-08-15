package enumParaTallas;

public class Ropa {
	public enum Talla {
		XS, S, M, L, XL, XXL
	};

	private String prenda;
	private Talla talla;

	public Ropa(String prenda, Talla t) {
		this.prenda = prenda;
		this.talla = t;
	}

	public String getPrenda() {
		return prenda + " talla " + talla.toString();
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla t) {
		this.talla = t;
	}

	public static void main(String args[]) {
		Ropa ropa = new Ropa("vestido", Talla.S);
		System.out.println(ropa.getPrenda());
		ropa.setTalla(Talla.XL);
		System.out.println(ropa.getPrenda());
	}

}
