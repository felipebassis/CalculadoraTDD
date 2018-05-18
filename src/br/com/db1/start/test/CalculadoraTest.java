package br.com.db1.start.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.classe.Calculadora;

public class CalculadoraTest {
	
	private Calculadora calculadora = new Calculadora();
	
	@Before
	public void init(){
		calculadora.setValor1(23d);
		Assert.assertTrue(23 == calculadora.getValor1());
		
		calculadora.setValor2(1d);
		Assert.assertTrue(1 == calculadora.getValor2());
		
	}
	
	@After
	public void fim(){
		System.out.println("fim da execução do teste.");
	}
	
	@Test
	public void somarTest(){
		Assert.assertTrue(24d == calculadora.somar());
	}
	
	@Test
	public void subtrairTest(){
		Assert.assertTrue(22d == calculadora.subtrair());
	}
	
	@Test
	public void multiplicarTest(){
		Assert.assertTrue(23d == calculadora.multiplicar());
	}
	
	@Test
	public void dividirTest(){
		Assert.assertTrue(23d == calculadora.dividir());
	}
	
	@Test
	public void zerarTest(){
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getValor1());
		Assert.assertTrue(0 == calculadora.getValor2());
		
	}
}
