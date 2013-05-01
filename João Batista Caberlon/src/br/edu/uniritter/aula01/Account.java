package br.edu.uniritter.aula01;

public class Account {
	private int numero;
	private double saldo;

	public Account(int numeroConta, double valorInicial) {
		numero = numeroConta;
		saldo = valorInicial;
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
	}

	public double verificaSaldo() {
		return saldo;
	}

	public boolean mesmaConta(Account clone) {
		return (this.numero == clone.numero);
	}
}
