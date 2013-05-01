package br.edu.uniritter.aula02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.aula02.Texto;

public class TextoTest {
	private Texto t1, t2;

	@Before
	public void setUp() throws Exception {
		t1 = new Texto(new char[]{'t', 'e', 's', 't', 'e'});
		t2 = new Texto(new char[]{'s', 'u', 'c', 'e', 's', 's', 'o'});
	}

	@Test
	public void testCharAt() throws Exception {
		setUp();
		assertEquals('s', t1.charAt(2));
		assertEquals('o', t2.charAt(6));
	}

	@Test
	public void testLength() throws Exception {
		setUp();
		assertEquals(5, t1.length());
		assertEquals(7, t2.length());
	}

	@Test
	public void testSubSequence() throws Exception {
		setUp();
		assertEquals("est", t1.subSequence(1, 3).toString());
		assertEquals("cesso", t2.subSequence(2, 6).toString());
	}

	@Test
	public void testToString() throws Exception {
		setUp();
		assertEquals("teste", t1.toString());
		assertEquals("sucesso", t2.toString());
	}
}
