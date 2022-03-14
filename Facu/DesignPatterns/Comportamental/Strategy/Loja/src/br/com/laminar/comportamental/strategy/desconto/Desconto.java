package br.com.laminar.comportamental.strategy.desconto;

import java.math.BigDecimal;

import br.com.laminar.comportamental.strategy.Pedido;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public final BigDecimal calcular(Pedido pedido) {
		if (confereRegraDesconto(pedido))
			return aplicaDesconto(pedido);
		return proximo.calcular(pedido);
	}

	protected abstract BigDecimal aplicaDesconto(Pedido pedido);

	protected abstract boolean confereRegraDesconto(Pedido pedido);
}
