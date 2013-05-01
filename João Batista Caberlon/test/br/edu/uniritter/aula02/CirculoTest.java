package br.edu.uniritter.aula02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CirculoTest {
	private Circulo c1;
	
	@Before
	public void setUp() {
		c1 = new Circulo(10);
	}
	
	@Test
	public void testCalculaArea() {
		setUp();
		assertEquals(314.15, c1.calculaArea(), 0.001);
	}
	
	@Test
	public void testCalculaPerimetro() {
		setUp();
		assertEquals(62.83, c1.calculaPerimetro(), 0.001);
	}
}
