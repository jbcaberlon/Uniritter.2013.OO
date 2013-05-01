package br.edu.uniritter.aula02;

public class Triangulo extends FiguraGeometrica {
	protected double lado1, lado2, lado3;
	
	public Triangulo(double i, double j, double k) {
		lado1 = i;
		lado2 = j;
		lado3 = k;
	}

	@Override
	public double calculaArea() {
		double sp = (lado1 + lado2 + lado3)/2;
		return Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
	}
	
	@Override
	public double calculaPerimetro() {
		return lado1 + lado2 + lado3;
	}
}
