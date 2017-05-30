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
	
	
	
}
