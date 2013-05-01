package br.edu.uniritter.aula03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CifraDeCesarTest {
	private CifraDeCesar texto1, texto2, texto3, texto4;

	@Before
	public void setUp() {
		texto1 = new CifraDeCesar("joao");
		texto2 = new CifraDeCesar("esta eh uma aula de oo");
		texto3 = new CifraDeCesar("teste oculto");
		texto4 = new CifraDeCesar("xyz");
	}

	@Test
	public void testEncriptaTexto() {
		setUp();
		assertEquals("otft", texto1.encriptaTexto(5));
		assertEquals("hvwd hk xpd dxod gh rr", texto2.encriptaTexto(3));
	}

	@Test
	public void testDesencriptaTexto() {
		setUp();
		assertEquals("rcqrc masjrm", texto3.desencriptaTexto(2));
		assertEquals("wxy", texto4.desencriptaTexto(1));
	}
}
