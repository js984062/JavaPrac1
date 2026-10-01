 package cpx.Juank2.Practica3;
 //clase hija
public class ProductoFresco extends Producto{ //heredado de la clase Producto

	private int diasCad;

	//constructor 0
	public ProductoFresco() {
		this(0,"",0.0); //llama  al const mas grande
	}

	//constructor 3
	public ProductoFresco(int diasCad, String nombre, double precio) throws IllegalArgumentException {
		super(nombre, precio); //padre
		this.diasCad = diasCad;
	}
//POLIMORFISMO
	//metodos
	@Override
	public double comprar(int cantidad) throws IllegalArgumentException {
							//llamar al padrde con super, llamar al metodo comprar
		double precioFinal = super.comprar(cantidad);
		
		if(this.diasCad <= 3 && this.diasCad <= 5) { //si estan entre 3 y 5 dias
			precioFinal *= .6; //40% desc
		}else if(this.diasCad < 3) { //-d3
			precioFinal *= .3; //70% desc
		}
		return precioFinal;
	}
	
	//GETTERS Y SETTERES
	public int getDiasCad() {
		return diasCad;
	}

	public void setDiasCad(int diasCad) {
		this.diasCad = diasCad;
	}

	@Override
	public String toString() {
		//llama al padre y le conectamos el resto		
		return super.toString()+", diasCad=" + diasCad + " ";
	}
	
	
	
	
}
