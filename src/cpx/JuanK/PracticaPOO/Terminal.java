package cpx.JuanK.PracticaPOO;

public class Terminal {

	public static final double CUOTA = .03;   //constantes con MAY_GIONB para separar palabras
	public static final double MIN_CUOTA = 1; //final es por que no puede cambiar
	public static final double MAX_CUOTA = 6; //static son de clase
	
	public Tiket realizarPago(TarjetaDeCredito tarjeta, double montoAbonar,int cantCuota) {
		Tiket elTiket = null; //sera null hasta que demuestre lo contrario
		if( datosValidos(tarjeta, montoAbonar,cantCuota) ) {
			double montoFinal = montoAbonar + montoAbonar * recargoCuotas(cantCuota);
			if(tarjeta.tieneSaldo(montoFinal)) {
				tarjeta.descontar(montoFinal);
				String nomApe = tarjeta.nombreCompleto();
				double montoPorCuota = montoFinal/cantCuota;
				elTiket = new Tiket(nomApe, montoFinal, montoPorCuota);
			}
		}
		return elTiket;
	}
	
	private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant) {
		boolean esTargetaValida = tarjeta != null;
		boolean esMontoValido = monto >  0;
		boolean cantCuotasVal =  cant >= MIN_CUOTA && cant <= MAX_CUOTA;
		return esTargetaValida && esMontoValido && cantCuotasVal;
	}
	
	private double recargoCuotas(int cantCuotas) {
		return (cantCuotas - 1) * CUOTA;
	}
}
