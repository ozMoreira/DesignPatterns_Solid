package br.com.laminar.comportamental.strategy.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import br.com.laminar.comportamental.strategy.Pedido;
import br.com.laminar.comportamental.strategy.desconto.CalculadoraDeDesconto;

class DescontoTest {
	CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
	
	Pedido pedido1 = new Pedido(new BigDecimal(600), 20);
	Pedido pedido2 = new Pedido(new BigDecimal(100), 20);
	Pedido pedido3 = new Pedido(new BigDecimal(100), 1);
	BigDecimal resultado = calculadoraDeDesconto.calcula(pedido1);
	BigDecimal resultado2 = calculadoraDeDesconto.calcula(pedido2);
	BigDecimal resultado3 = calculadoraDeDesconto.calcula(pedido3);
	
	@Test
	void deveRetornarUmDescontoParaPedidosCaros() {
		assertEquals(new BigDecimal("60.00"),resultado.setScale(2, RoundingMode.DOWN) );
	}
	
	@Test
	void deveRetornarUmDescontoParaPedidosGrandes() {
		assertEquals(new BigDecimal("5.00"),resultado2.setScale(2, RoundingMode.DOWN) );
	}
	
	@Test
	void deveRetornarZeroSeNaoAplicarOutrosDescontos() {
		assertEquals(BigDecimal.ZERO,resultado3);
	}

}
