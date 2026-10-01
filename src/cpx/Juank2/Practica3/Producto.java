package cpx.Juank2.Practica3;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	
	//staic por que es de la clase, afecta a todos
	private static int idContador = 1;  
	
	//constructor 0
	public Producto() {
		this("",0.0);//si llega vacio un objeto le ponemos esto por defecto
					 // gracias a constructor mas grande
	}
	
	//CREAR NUM<0
	
	//constructor 2
	public Producto(String nombre, double precio) throws IllegalArgumentException {
		 
		if(precio < 0){ //validacion en el cosntructor
			throw new IllegalArgumentException("El precio no puede ser Negativo.");
		}
		
		this.nombre = nombre;
		this.precio = precio;
		this.id = Producto.idContador++;//valor harcodeado, no viene del param
										//se asigna y luego de incrementa
										//este 1, el siguiente 2; este 2 y el siguiente sera 3 
	}
	
	//metodos
	public double comprar(int cantidad) throws IllegalArgumentException {
		if(cantidad < 0) {
			throw new IllegalArgumentException("la cantidad no puede ser Negativa.");
		}
		return this.precio * cantidad;
	}

	//GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getIdContador() {
		return idContador;
	}

	public static void setIdContador(int idContador) {
		Producto.idContador = idContador;
	}

	@Override
	public String toString() {
																//" " para conectar con los hijos
		return "id=" + id + ", nombre=" + nombre + ", precio=" + precio + " ";
	}
	
	
	
	
	
}
