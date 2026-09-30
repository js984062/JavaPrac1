package cpx.Juank2.Practica2;
/*
 * atributos
 * constructores
 * metodos
 * getters y setters
 * @override
 */
public class Empresa {
	private String CIF;
	private String nombre;
	
	//constructor2 2 String
	public Empresa(String CIF, String nombre) {
		this.CIF = CIF;
		this.nombre = nombre;
	}

	//GETTERS Y SETTERS
	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empresa [CIF=" + CIF + ", nombre=" + nombre + "]";
	}
	
	
	
	

}
