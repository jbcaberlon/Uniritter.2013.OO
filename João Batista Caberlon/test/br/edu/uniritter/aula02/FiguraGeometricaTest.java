package br.edu.uniritter.aula02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FiguraGeometricaTest {
	FiguraGeometrica[] figuras;
	
	@Before
	public void setUp() {
		figuras = new FiguraGeometrica[3];
		figuras[0] = new Circulo(10);
		figuras[1] = new Retangulo(2,3);
		figuras[2] = new Triangulo(3,4,5);
	}
	
	@Test
	public void testCalculaArea() {
		assertEquals(314.15, figuras[0].calculaArea(), 0.001);
		assertEquals(6, figuras[1].calculaArea(), 0.001);
		assertEquals(6, figuras[2].calculaArea(), 0.001);
	}

	@Test
	public void testCalculaPerimetro() {
		assertEquals(62.83, figuras[0].calculaPerimetro(), 0.001);
		assertEquals(10, figuras[1].calculaPerimetro(), 0.001);
		assertEquals(12, figuras[2].calculaPerimetro(), 0.001);
	}

	public double x() {
		double acumulador = 0;
		for  (FiguraGeometrica figura : figuras) {
			acumulador += figura.calculaArea();
		}
		return acumulador;
	}
}
