package br.com.rgk.alura.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.rgk.alura.Produto;

public class ProdutoTest {

	@Test
	public void test() {
		Produto p = new Produto("banana", BigDecimal.TEN);
		
		assertEquals(p.getPreco(), BigDecimal.TEN);
		assertEquals(p.getNome(), "banana");
	}

}

