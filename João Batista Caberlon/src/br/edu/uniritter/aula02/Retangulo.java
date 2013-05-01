package br.edu.uniritter.aula02;

public class Retangulo extends FiguraGeometrica {
	protected double base, altura;
	
	public Retangulo(double i, double j) {
		base = i;
		altura = j;
	}

	@Override
	public double calculaArea() {
		return base * altura;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * (base + altura);
	}
}
