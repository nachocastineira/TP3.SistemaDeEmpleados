package ar.edu.unlam.pb2;

public class Ingeniero extends Empleado {
	
	public Ingeniero ()
	{
		super(); //heredo contructor de la clase padre
	}
	
	@Override
	public void brindarDetalles()
	{
		System.out.println("Nombre del ingeniero: "+getNombre());
		System.out.println("Salario del ingeniero: $"+getSalario());
		System.out.println("Fecha de cumple del ingeniero: "+getFechaDeCumple());
	}

}
