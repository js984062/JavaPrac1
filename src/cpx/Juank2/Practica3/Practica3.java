package cpx.Juank2.Practica3;

import cpx.Juank2.Practica2.Departamento;
import cpx.Juank2.Practica2.Empleado;
import cpx.Juank2.Practica2.Empresa;

//dominio.empresa.proyecto
//clase proyecto tiene la clase principal
public class Practica3 {
	
public static void main(String[] args) {
		
		try {
			Producto p1 = new Producto("Producto 1",10.0);
			ProductoFresco p2 = new ProductoFresco(4,"Producto 2",20.0);
			ProductoCongelado p3 = new ProductoCongelado(1,"Producto 3",30.0);
		
			System.out.println("");
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			
			System.out.println("Compro 10 Unidades de P1 = " + p1.comprar(10));
			System.out.println("Compro 10 Unidades de P1 = " + p2.comprar(10));
			System.out.println("Compro 10 Unidades de P1 = " + p3.comprar(10));
			
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}	

		     
	}

}
