package br.com.laminar.comportamental.strategy.teste;

import java.math.BigDecimal;

import br.com.laminar.comportamental.strategy.Pedido;
import br.com.laminar.comportamental.strategy.desconto.CalculadoraDeDesconto;

public class TestaDesconto {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(new BigDecimal(100), 11);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal calcula = calculadoraDeDesconto.calcula(pedido);
		System.out.println(calcula);
	}

}
