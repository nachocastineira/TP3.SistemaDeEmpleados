
package ar.edu.unlam.pb2;

public abstract class Empleado {
	
	// Atributos//
	private String nombre;
	private Double salario;
	private String fechaDeCumple; 
	
	  //Constructor
	public Empleado ()
	{	
	}
	
	// Get y Set//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getFechaDeCumple() {
		return fechaDeCumple;
	}
	public void setFechaDeCumple(String fechaDeCumple) {
		this.fechaDeCumple = fechaDeCumple;
	}
	
	//metodo abstracto para dar detalles
	public abstract void brindarDetalles();

	
	
	
	
	
	
	
	
	
}
