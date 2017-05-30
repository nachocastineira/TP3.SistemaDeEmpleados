package ar.edu.unlam.pb2;

public class Gerente extends Empleado { //heredo la clase padre
	
	private String cochera;
	private String departamentoAsignado;
	
	public Gerente ()
	{
		super(); //heredo contructor de la clase padre
	}

	//Getter y Setter
	public String getCochera() {
		return cochera;
	}

	public void setCochera(String cochera) {
		this.cochera = cochera;
	}

	public String getDepartamentoAsignado() {
		return departamentoAsignado;
	}

	public void setDepartamentoAsignado(String departamentoAsignado) {
		this.departamentoAsignado = departamentoAsignado;
	}
	
	@Override  //sobreescribo metodo del padre y agrego nuevos datos
	public void brindarDetalles()
	{
		System.out.println("Nombre del Gerente: "+getNombre());
		System.out.println("Salario del Gerente: $"+getSalario());
		System.out.println("Fecha de cumple del Gerente: "+getFechaDeCumple());
		System.out.println("Cochera asignada: "+getCochera());
		System.out.println("Departamento asignado: "+getDepartamentoAsignado());
	}
	
	
	
	
}
