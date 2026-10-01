package cpx.Juank2.Practica3;

public class ProductoCongelado extends Producto{//PC es hijo de P

	private int cajon;

	//constructor 0
	public ProductoCongelado(){
		this(0,"",0.0);;//llama al mas grande 
	}

	//constructor 3
	public ProductoCongelado(int cajon, String nombre, double precio) throws IllegalArgumentException {
		super(nombre, precio);// viene de la clase padre
		this.cajon = cajon;
	}

//no debemos repetirlo, llamamos al mtdo del padre y usamos el objeto hijo
/*	metodos
	public double comprar(int cantidad) throws IllegalArgumentException {
	if(cantidad < 0) {
		throw new IllegalArgumentException("la cantidad no puede ser Negativa.");
	}
	return this.precio * cantidad;
	}
*/
	//GETTERS Y SETTERES
	public int getCajon() {
		return cajon;
	}

	public void setCajon(int cajon) {
		this.cajon = cajon;
	}
	
	@Override
	public String toString() {
		return super.toString()+", cajon=" + cajon + " ";
	}
	
	
}
