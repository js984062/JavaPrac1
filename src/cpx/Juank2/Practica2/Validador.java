package cpx.Juank2.Practica2;

public class Validador {
	
	public static void validaDNI(String DNI) throws Exception{
		// ^ de principio a fin, del 0 al 9, que tenga de 7 a 8 caracteres, que tenga algna de estas lestras
		if( !DNI.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X]$") ) {
			throw new Exception("No es el formato Correcto");
		}
	}

}
