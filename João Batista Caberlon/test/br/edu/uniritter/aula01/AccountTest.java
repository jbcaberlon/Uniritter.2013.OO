package br.edu.uniritter.aula01;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {
	@Test
	public void sacar50DeUmaContaCom100() {
		Account myAccount;

		myAccount = new Account(1, 100);
		myAccount.sacar(50);
		assertEquals(50, myAccount.verificaSaldo(), 0.001);
	}
	
	@Test
	public void sacar100DeUmaContaCom100() {
		Account myAccount;

		myAccount = new Account(1, 50);
		myAccount.sacar(100);
		assertEquals(50, myAccount.verificaSaldo(), 0.001);
	}
}
