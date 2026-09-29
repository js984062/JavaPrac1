package cpx.JuanK.PracticaPOO;

public class Tiket {
	private String nombreApellido;
	private double montoTotal;
	private double montoPorCuota;
	
	public Tiket(String nombreApellido, double montoTotal, double montoPorCuota) {
		this.nombreApellido = nombreApellido;
		this.montoTotal = montoTotal;
		this.montoPorCuota = montoPorCuota;
	}

	@Override
	public String toString() {
		return "Tiket [nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota="
				+ montoPorCuota + "]";
	}
	
	
	
	
	
	
}
