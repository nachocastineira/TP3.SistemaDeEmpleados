package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpleados {

	@Test
	public void testQueCreaUnIngeniero() {
		Ingeniero miIngeniero1 = new Ingeniero();  
		ServicioImpuestos impuestoIngeniero = new ServicioImpuestos();
		impuestoIngeniero.setTopeDeSalario(1000d);  //le doy un tope al salario, luego de esto tendra descuento del 15%
		miIngeniero1.setNombre("Juan");
		miIngeniero1.setSalario(1000d);
		miIngeniero1.setFechaDeCumple("1 de Enero");
		miIngeniero1.brindarDetalles();
		assertEquals(impuestoIngeniero.calcularImpuesto(miIngeniero1), 850d, 0.01);  //verifico que se haya descontado sueldo
	}
	
	@Test
	public void testQueCreaUnGerente() {
		Gerente miGerente1 = new Gerente();
		ServicioImpuestos impuestoGerente = new ServicioImpuestos();
		impuestoGerente.setTopeDeSalario(2500d);
		miGerente1.setNombre("Pedro");
		miGerente1.setSalario(2000d);
		miGerente1.setFechaDeCumple("1 de Marzo");
		miGerente1.setCochera("A5");
		miGerente1.setDepartamentoAsignado("Finanzas");
		miGerente1.brindarDetalles();
		assertEquals(impuestoGerente.calcularImpuesto(miGerente1), 2000d, 0);  //como no llega al tope no se le descuenta salario

	}

}
