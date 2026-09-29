package cpx.JuanK.PracticaPOO;

public class PracticaPOO {
	
	public static void main(String[] args) {
		
		Terminal mercadoPago = new Terminal();
		Persona mujer = new Persona("1921QUIM","Monserrat","Diaz","81 8385 4489", "montse@diaz.gmail");
		TarjetaDeCredito likeU = new TarjetaDeCredito ("VISA","2014777",15000,mujer,EntidadFinanciera.BANAMEX);
		
		System.out.println("Tarjeta antes de pagar:");
		System.out.println(likeU);
		System.out.println("");
		
		System.out.println("Tiket del pago");
		Tiket tiket01 = mercadoPago.realizarPago(likeU, 100000, 5);
		System.out.println(tiket01);
		System.out.println("");
		
		System.out.println("Tarjeta despues de pagar:");
		System.out.println(likeU);
		

	}

}
