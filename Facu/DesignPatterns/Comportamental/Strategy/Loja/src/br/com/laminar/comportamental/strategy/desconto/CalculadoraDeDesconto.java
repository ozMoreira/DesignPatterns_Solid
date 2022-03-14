package br.com.laminar.comportamental.strategy.desconto;

import java.math.BigDecimal;

import br.com.laminar.comportamental.strategy.Pedido;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcula(Pedido pedido) {

		//Criar cadeia de desconto
		
		Desconto cadeiaDeDesconto = 
				new DescontoPorValor(
				new DescontoPorQtd(
				new SemDesconto()
				));
		
		
		return cadeiaDeDesconto.calcular(pedido);
		
	}
}
