package br.edu.uniritter.aula02;

public class Texto implements CharSequence{
	private char[] texto;

	public Texto(char[] t) {
		texto = t;
	}

	@Override
	public char charAt(int index) {
		if (index >= 0 && index < texto.length) {
			 return texto[index];
		} else {
			throw new IndexOutOfBoundsException("Índice inválido: " + index);
		}
	}

	@Override
	public int length() {
		return texto.length;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		if (start > end) {
			throw new IllegalArgumentException("O índice final deve ser maior ou igual ao índice inicial!");
		} else if (start < 0) {
			throw new IndexOutOfBoundsException("O índice inicial deve ser maior ou igual a zero!");
		} else if (end > texto.length) {
			throw new IndexOutOfBoundsException("O índice final deve ser menor ou igual ao tamanho do texto!");
		}
		char[] subtexto = new char[end - start + 1];
		int i = 0;
		for (int j = start; j <= end; j++) {
			subtexto[i++] = texto[j];
		}
		return new Texto(subtexto);
	}
	@Override
	public String toString() {
		 return new String(texto);
		 }
}
