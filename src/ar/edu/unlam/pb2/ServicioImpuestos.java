package ar.edu.unlam.pb2;

public class ServicioImpuestos {
	
		private Double topeDeSalario = 5000d;
	
		public Double calcularImpuesto(Empleado empleado)
		{
			if(empleado.getSalario()>topeDeSalario)
			{
				empleado.setSalario(empleado.getSalario()*1.10);
			}
			return empleado.getSalario();
		}

}
