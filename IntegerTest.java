package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import br.com.db1.Soma;

public class IntegerTest {
	
	@Test 
	public void ehSomaTest() { 
		Soma s1 =new Soma(2,2);
		System.out.println(s1.getSoma());
	}
	@Test 
	public void ehDividirTest() { 
		Divisao divisao =new Divisao(6,2);
		System.out.println(divisao.getdividir());
	}
	@Test 
	public void ehMultiplicacaoTest() { 
		Multiplicacao multiplicacao =new Multiplicacao(5,2);
		System.out.println(multiplicacao.getMultiplicacao());
	}
	@Test 
	public void ehSubtrairTest() { 
		Subtrair subtrair =new Subtrair(6,1);
		System.out.println(subtrair.getSubtrair());
	}
	@Test
	public void ehParTest(){
		EhPar ehpar = new EhPar();
		assertTrue(ehpar.ehPar(2));
		assertFalse(ehpar.ehPar(3));
	}
	@Test 
	public void ehMaiorTest() { 
		NumeroMaior maior =new NumeroMaior(5,3);
		System.out.println(maior.getMaior());
	}
}
