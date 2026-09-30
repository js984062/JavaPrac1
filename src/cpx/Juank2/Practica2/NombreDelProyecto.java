package cpx.Juank2.Practica2;

public class NombreDelProyecto {

	public static void main(String[] args) {
		
		try {
				Empresa empresa = new Empresa("12345678A",
						"COPAMEX");
	
				Empleado empleado1 = new Empleado("12345678A", 
								      "Angel Garay", 
								      34, 
								      Departamento.INFORMATICA, 
								      true,
									  empresa);
				
				Empleado empleado2 = new Empleado("12345678A", 
								      "Adamary Nicole", 
								      25,  
								      Departamento.DIRECCION, 
								      false,
								      empresa);
				
				System.out.println("Sueldo empleado 1: "+ empleado1.calcularSueldo());
				System.out.println("Sueldo empleado 2: "+ empleado2.calcularSueldo());
				
				Empleado.setSalarioBase(2000);
				System.out.println("");
				
				System.out.println("Sueldo empleado 1: "+ empleado1.calcularSueldo());
				System.out.println("Sueldo empleado 2: "+ empleado2.calcularSueldo());
		
			
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}	

		     
	}

}
