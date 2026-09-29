package cpx.JuanK.PracticaPOO;

public class TarjetaDeCredito {
	private String entidadBancaria;
	private String numero;
	private double saldo;
	private Persona titular;
	private EntidadFinanciera entidadFinanciera;
	
	
	public TarjetaDeCredito(String entidadBancaria, String numero, double saldo, Persona titular,
			EntidadFinanciera entidadFinanciera) {
		this.entidadBancaria = entidadBancaria;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.entidadFinanciera = entidadFinanciera;
	}
	
	public boolean tieneSaldo(double monto) {
		return saldo <= monto;
	}
	
	public void descontar(double monto) {
		saldo = saldo - monto;
		//saldo-= monto;
	} 
	
	public String nombreCompleto(){
		return titular.nombreCompleto();
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo
				+ ", titular=" + titular + ", entidadFinanciera=" + entidadFinanciera + "]";
	}
	
	

}
