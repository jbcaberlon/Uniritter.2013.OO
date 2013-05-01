package br.edu.uniritter.aula02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {
	private Triangulo t1;
	
	@Before
	public void setUp() {
		t1 = new Triangulo(10, 6, 6);
	}
	
	@Test
	public void testCalculaArea() {
		setUp();
		assertEquals(16.583, t1.calculaArea(), 0.001);
	}
	
	@Test
	public void testCalculaPerimetro() {
		setUp();
		assertEquals(22, t1.calculaPerimetro(), 0.001);
	}
}
