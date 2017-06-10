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
		assertEquals(impuestoIngeniero.calcularImpuesto(miIngeniero1), 850d, 0.01);  //saldo luego del descuento
		assertEquals(miIngeniero1.getSalario(), 850d, 0d);
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
	
	@Test
	public void testQueCreaUnDirector() {
		Director miDirector1 = new Director();
		ServicioImpuestos impuestoDirector = new ServicioImpuestos();
		impuestoDirector.setTopeDeSalario(5000d);
		miDirector1.setNombre("Mauricio");
		miDirector1.setSalario(10000d);
		miDirector1.setFechaDeCumple("28 de Febrero");
		miDirector1.setCochera("F9");
		miDirector1.setSalarioExtraParaGastosDeVehiculo(50d);
		miDirector1.brindarDetalles();
		assertEquals(impuestoDirector.calcularImpuesto(miDirector1), 8500d, 0);  
	}
	
	@Test
	public void testQueCreaUnaSecretaria() {
		Secretaria miSecretaria1 = new Secretaria();
		ServicioImpuestos impuestoSecretaria = new ServicioImpuestos();
		impuestoSecretaria.setTopeDeSalario(2000d);
		miSecretaria1.setNombre("Maria");
		miSecretaria1.setSalario(2000d);
		miSecretaria1.setFechaDeCumple("1 de Marzo");
		miSecretaria1.brindarDetalles();
		assertEquals(impuestoSecretaria.calcularImpuesto(miSecretaria1), 1700d, 0);  //calculo saldo con descuento
	}

}
