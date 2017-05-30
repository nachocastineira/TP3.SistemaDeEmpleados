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
	
	
	
	
	
	
}

