package br.com.laminar.comportamental.strategy.imposto;

import java.math.BigDecimal;
import br.com.laminar.comportamental.strategy.Pedido;

public class Iss extends Imposto{

	public Iss(Imposto outroImposto) {
		super(outroImposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		BigDecimal valorImposto = pedido.getValor().multiply(new BigDecimal(0.05));
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) valorDoOutroImposto = outroImposto.calcular(pedido);
		return valorImposto.add(valorDoOutroImposto);
	}
}
