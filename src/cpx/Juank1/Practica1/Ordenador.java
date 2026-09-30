package cpx.Juank1.Practica1;

import java.util.Objects;

public class Ordenador {
	private String marca;
	private String modelo;
	private int ram;
	private int ssd;
	private int ssdUsado;
	private boolean onOff;
	
/*
	//constructor 6 
	public Ordenador(String marca, String modelo, int ram, int ssd, int ssdUsado, boolean onOff) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.ssd = ssd;
		this.ssdUsado = ssdUsado;
		this.onOff = onOff;
	}
*/
	
	//constructor 1 int 
	public Ordenador() {
		this ("","",4,50);
	}
	
	//constructor 1 int 
	public Ordenador(int ram) {
		this ("","",ram,50);
	}

	//constructor 2 int 
	public Ordenador(int ram, int ssd) {
		this ("","",ram,ssd);
	}

	//constructor 4 2 String 2 int
	public Ordenador(String marca, String modelo, int ram, int ssd) {
		
		//que es potencia de 2? la ram
		if( !esPotenciaDe2(ram) ) {
			throw new IllegalArgumentException("La RAM no es potencia de 2");
		}
		
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	//1ra validacion
	private boolean esPotenciaDe2(int numero) {//int numero es el num que se usara en la funcion, el parametro es el nombre que sea
		if(numero <= 0) {
			return false;
		}
		double logBase2 = Math.log(numero) /Math.log(2);
		return logBase2 == (int)logBase2;
	}
	
	public void encender() {
		if(this.onOff) {//si esta on avisa
			System.out.println("El ordenar esta Encendido.");
		}else {//si esta off se enciende
			this.onOff = true;
			System.out.println("El ordenar se ha Encendido.");
		}
	}
	
	public void apagar() {
		if(!this.onOff) {//si esta off avisa
			System.out.println("El ordenar esta Apagado.");
		}else {//si esta on se apaga
			this.onOff = false;
			System.out.println("El ordenar se ha Apagado.");
		}
	}
	
	public void tranferir(int gb) {
		if(this.onOff) {
			if(this.ssdUsado + gb <= this.ssd) {
				this.ssdUsado += gb;
				System.out.println("se tranfirieron:" + gb + "GB. espacio actual: " + this.ssdUsado + ".");
			}else {
				System.out.println("Espacio insuficiente.");
			}
		}else {
			System.out.println("El Ordenador esta Apagado.");
			System.out.println("Enciende el Ordenador.");
		}
	}
	
	public void eliminar(int gb) {
		if(this.onOff) {
			if(this.ssdUsado - gb < 0) {
				this.ssdUsado = 0;
			}else {
				this.ssdUsado -=gb;
			}
			System.out.println("se eliminaron:" + gb + "GB. espacio actual: " + this.ssdUsado + ".");
		}else {
			System.out.println("El Ordenador esta Apagado.");
			System.out.println("Enciende el Ordenador.");
		}
	}
	
	
	//ALL GETTERS Y SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if( !esPotenciaDe2(ram) ) {
			throw new IllegalArgumentException("La RAM no es potencia de 2");
		}
		this.ram = ram;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public int getSsdUsado() {
		return ssdUsado;
	}

	public void setSsdUsado(int ssdUsado) {
		this.ssdUsado = ssdUsado;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	//EQUALS
	@Override //Métodos heredados o del sistema
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override //Métodos heredados o del sistema
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordenador other = (Ordenador) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}
	
	//toString
	@Override //Métodos heredados o del sistema
	public String toString() {
		
		String estado = "NO";//def
		
		if(this.onOff) {
			estado = "SI";//used
		}
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", ssd=" + ssd + ", ssdUsado="
				+ ssdUsado + ", onOff=" + estado + "]";
	}	
	
	
}
