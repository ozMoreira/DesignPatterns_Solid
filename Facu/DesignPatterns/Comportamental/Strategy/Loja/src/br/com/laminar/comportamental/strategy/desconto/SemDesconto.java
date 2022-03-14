package br.com.laminar.comportamental.strategy.desconto;

import java.math.BigDecimal;

import br.com.laminar.comportamental.strategy.Pedido;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	protected BigDecimal aplicaDesconto(Pedido pedido) {
	 return BigDecimal.ZERO;
	}

	@Override
	protected boolean confereRegraDesconto(Pedido pedido) {
		return true;
	}
	
}
