package br.com.fiap.teste;


import org.junit.Assert;
import org.junit.Test;

import br.com.fiap.util.Calculadora;


public class CalculadoraTeste {

	@Test
	public void Somatest() {
		Calculadora calc = new Calculadora();
		calc.somar(10,10);
		int soma = calc.somar(10,10);
		Assert.assertEquals(soma, 20);
		
	
	}

}
