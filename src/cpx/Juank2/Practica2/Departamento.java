package cpx.Juank2.Practica2;

public enum Departamento {
	CONTABILIDAD(50),
	INFORMATICA(80),
	DIRECCION(100);
	//siempre mayuscula los enum
	 
	private double plus;

	private Departamento(double plus) {
		this.plus = plus;
	}
	
	public double getPlus() {
		return plus;
	}
}
