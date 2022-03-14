package br.com.laminar.comportamental.strategy.imposto;

import java.math.BigDecimal;
import br.com.laminar.comportamental.strategy.Pedido;

public class Icms extends Imposto{

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		BigDecimal valorImposto = pedido.getValor().multiply(new BigDecimal(0.01));
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) valorDoOutroImposto = outroImposto.calcular(pedido);
		return valorImposto.add(valorDoOutroImposto);
	}

}
