package br.edu.uniritter.aula02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RetanguloTest {
	private Retangulo r1;
	
	@Before
	public void setUp() {
		r1 = new Retangulo(10, 20);
	}
	
	@Test
	public void testCalculaArea() {
		setUp();
		assertEquals(200, r1.calculaArea(), 0.001);
	}
	
	@Test
	public void testCalculaPerimetro() {
		setUp();
		assertEquals(60, r1.calculaPerimetro(), 0.001);
	}
}
