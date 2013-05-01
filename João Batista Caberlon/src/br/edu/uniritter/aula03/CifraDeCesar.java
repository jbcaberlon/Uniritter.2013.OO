package br.edu.uniritter.aula03;

public class CifraDeCesar extends Cifra {
	private String texto;
	private char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public CifraDeCesar(String t) {
		texto = t;
	}
	
	@Override
	public String encriptaTexto(int deslocamento) {
		char[] textoCodificado = new char[texto.length()];
		int indice;
		
		for (int i = 0; i < texto.length(); i++) {
			indice = procuraLetra(texto.charAt(i));
			if (indice == -1) {
				textoCodificado[i] = texto.charAt(i);
			} else {
				textoCodificado[i] = alfabeto[(indice + deslocamento)];
			}
		}
		return new String(textoCodificado);
	}
	
	@Override
	public String desencriptaTexto(int deslocamento) {
		return encriptaTexto(deslocamento * (-1));
	}
	
	private int procuraLetra(char letra) {
		for (int i = 0; i < alfabeto.length; i++) {
			if (alfabeto[i] == letra)
				return i;
		}
		return -1;
	}
}