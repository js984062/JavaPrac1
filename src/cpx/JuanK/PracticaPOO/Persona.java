package cpx.JuanK.PracticaPOO;

public class Persona {
	private String dNI;
	private String nombre;
	private String apellido;
	private String telefono;
	private String mail;
	
	
	public Persona(String dNI, String nombre, String apellido, String telefono, String mail) {
		this.dNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.mail = mail;
	}
	
	public String nombreCompleto() {
		return nombre + " " + apellido;
 	}

	@Override
	public String toString() {
		return "Persona [dNI=" + dNI + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", mail=" + mail + "]";
	}
	
}
