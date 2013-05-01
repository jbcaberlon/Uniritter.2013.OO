package br.edu.uniritter.aula02;

public class Circulo extends FiguraGeometrica {
	protected double raio;
	public static final double PI = 3.1415;
	
	public Circulo(double i) {
		raio = i;
	}
	
	@Override
	public double calculaArea() {
		return PI * raio * raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * PI * raio;
	}
}
