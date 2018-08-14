package br.com.db1;

public class NumeroMaior {
	
	private int valor;
	public NumeroMaior(int valor1, int valor2) {
		if (valor1 > valor2) {
			System.out.printf("È maior", valor1);
		}
	}
		// TODO Auto-generated constructor stub
	public int getMaior() {
		return this.valor;
	}
}