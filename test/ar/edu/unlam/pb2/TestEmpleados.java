package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpleados {

	@Test
	public void testQueCreaUnEmpleado() {
		Empleado miEmpleado1 = new Empleado();
		miEmpleado1.setNombre("Juan");
		miEmpleado1.setSalario(200d);
		miEmpleado1.setFechaDeCumple("1 de Enero");
		miEmpleado1.brindarDetalles();
	}
	
	@Test
	public void testQueCreaUnGerente() {
		Gerente miGerente1 = new Gerente();
		miGerente1.setNombre("Pedro");
		miGerente1.setSalario(300d);
		miGerente1.setFechaDeCumple("1 de Marzo");
		miGerente1.setCochera("A5");
		miGerente1.setDepartamentoAsignado("Finanzas");
		miGerente1.brindarDetalles();
	}

}
