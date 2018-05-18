package br.com.db1.start.classe;

public class Calculadora {

	private Double valor1;
	private Double valor2;	
	
	public Calculadora(){
		zerar();
	}
	
	public Double getValor2() {
		return valor2;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
		
	}

	public void setValor2(Double valor2) {
		this.valor2  = valor2;
		
	}

	public Double somar() {
		return valor1 + valor2;
	}

	public Double subtrair() {
		return valor1 - valor2;
	}

	public Double multiplicar() {
		return valor1 * valor2;
	}

	public Double dividir() {
		return valor1 / valor2;
	}

	public void zerar() {
		valor1 = 0d;
		valor2 = 0d;
	}


}
