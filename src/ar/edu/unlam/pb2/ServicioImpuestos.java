package ar.edu.unlam.pb2;

public class ServicioImpuestos {
	
		private Double topeDeSalario;
		
		
		
			// getters y setters para el tope
		public Double getTopeDeSalario() {
			return topeDeSalario;
		}

		public void setTopeDeSalario(Double topeDeSalario) {
			this.topeDeSalario = topeDeSalario;
		}



		public Double calcularImpuesto(Empleado empleado)
		{
			if(empleado.getSalario()>=getTopeDeSalario())
			{
				empleado.setSalario(empleado.getSalario()*0.85);
			}
			return empleado.getSalario();
		}

}
