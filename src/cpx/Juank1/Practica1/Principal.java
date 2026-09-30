package cpx.Juank1.Practica1;

public class Principal {

	public static void main(String[] args) {
		Ordenador PC1 = new Ordenador("HP","ProBook",64,50);
		
		System.out.println(PC1);
		System.out.println("");
		
		PC1.encender();
		PC1.encender();
		System.out.println(PC1);
		System.out.println("");
		
		PC1.apagar();
		PC1.encender();
		System.out.println(PC1);
		System.out.println("");
		
		PC1.tranferir(30);
		PC1.tranferir(30);
		System.out.println("");
 		
		PC1.eliminar(20);
		PC1.eliminar(20);
		
		Ordenador PC2 = new Ordenador("HPX","ProBook",64,50);
		
		if(PC1.equals(PC2)) {
			System.out.println("Los Ordenadores son Iguales");
		}else {
			System.out.println("Los Ordenadores NO son Iguales");
		}
	}

}
