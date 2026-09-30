package cpx.Juank2.Practica2;

import java.util.Objects;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Empleado {
	private String DNI;
	private String nombre;
	private int edad;
	private Departamento departamento;
	private boolean homeOffice;
	private Empresa empresa;
	
	private static double salarioBase = 1000; //final para que nunca cambie

	//constructor5
	public Empleado(String dNI, String nombre, int edad, Departamento departamento, boolean homeOffice,
			Empresa empresa) {
		
		try {
			Validador.validaDNI(dNI);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
		
		if(empresa == null) {
			throw new IllegalArgumentException("la Emoresa es obligatoria");
		}
		
		DNI = dNI;
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		this.homeOffice = homeOffice;
		this.empresa = empresa;
	}
	
	//metodos
	public double calcularSueldo() {
		double salario = Empleado.salarioBase;
		if(this.edad > 30) { //+ 30
			salario += 200;
		}
		salario += this.departamento.getPlus();
		//el objeto empleado, con el atributo departamento, obtendra su plus
		if(this.homeOffice) {
			salario += 30;
		}
		return salario;
	}

	//GETTERS Y SETTERES
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public boolean isHomeOffice() {
		return homeOffice;
	}

	public void setHomeOffice(boolean homeOffice) {
		this.homeOffice = homeOffice;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public static double getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(double salarioBase) {
		Empleado.salarioBase = salarioBase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(DNI, other.DNI);
	}

	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento
				+ ", homeOffice=" + homeOffice + ", empresa=" + empresa + "]";
	}
	
	
	
	
	
	
}
