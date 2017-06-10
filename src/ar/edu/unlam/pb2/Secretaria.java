package ar.edu.unlam.pb2;

public class Secretaria extends Empleado {
	
	public Secretaria ()
	{
		super(); //heredo contructor de la clase padre
	}
	
	@Override
	public void brindarDetalles()
	{
		System.out.println("Nombre de la secretaria: "+getNombre());
		System.out.println("Salario de la secretaria (sin descuento): $"+getSalario());
		System.out.println("Fecha de cumple de la secretaria: "+getFechaDeCumple());
	}

}
