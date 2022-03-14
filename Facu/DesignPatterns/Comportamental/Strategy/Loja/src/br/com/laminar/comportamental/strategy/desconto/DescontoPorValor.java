package br.com.laminar.comportamental.strategy.desconto;

import java.math.BigDecimal;

import br.com.laminar.comportamental.strategy.Pedido;

public class DescontoPorValor extends Desconto{

	public DescontoPorValor(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected BigDecimal aplicaDesconto(Pedido pedido) {

		return pedido.getValor().multiply(new BigDecimal(0.1));
	}

	@Override
	protected boolean confereRegraDesconto(Pedido pedido) {

		return pedido.getValor().compareTo(new BigDecimal(500)) > 0;
	}
	
	

}
