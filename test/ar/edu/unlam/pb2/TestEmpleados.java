package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpleados {

	@Test
	public void test() {
		Empleado miEmpleado1 = new Empleado();
		miEmpleado1.setNombre("Juan");
		miEmpleado1.setSalario(200d);
		miEmpleado1.setFechaDeCumple("1 de Enero");
		miEmpleado1.brindarDetalles();
	}

}
