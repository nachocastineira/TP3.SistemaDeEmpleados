package ar.edu.unlam.pb2;

public class Director extends Empleado { //heredo la clase padre
	
	private String cochera;
	private Double salarioExtraParaGastosDeVehiculo;
	
	public Director ()
	{
		super(); //heredo contructor de la clase padre
	}

	// Get y Set//
	public String getCochera() {
		return cochera;
	}
	public void setCochera(String cochera) {
		this.cochera = cochera;
	}
	public Double getSalarioExtraParaGastosDeVehiculo() {
		return salarioExtraParaGastosDeVehiculo;
	}
	public void setSalarioExtraParaGastosDeVehiculo(
			Double salarioExtraParaGastosDeVehiculo) {
		this.salarioExtraParaGastosDeVehiculo = salarioExtraParaGastosDeVehiculo;
	}
	
	@Override            //sobreescribo metodo del padre y agrego nuevos datos
	public void brindarDetalles()
	{
		System.out.println("Nombre del Director: "+getNombre());
		System.out.println("Salario del Director (sin descuento): $"+getSalario());
		System.out.println("Fecha de cumple del Director: "+getFechaDeCumple());
		System.out.println("Cochera asignada: "+getCochera());
		System.out.println("Salario extra para gastos del vehiculo: $"+getSalarioExtraParaGastosDeVehiculo());
	}
	
	
	
	
}

