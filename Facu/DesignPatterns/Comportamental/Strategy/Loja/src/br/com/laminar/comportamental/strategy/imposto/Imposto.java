package br.com.laminar.comportamental.strategy.imposto;

import java.math.BigDecimal;
import br.com.laminar.comportamental.strategy.Pedido;

public abstract class Imposto {

	protected Imposto outroImposto;
	


	public Imposto(Imposto outroImposto) {
		super();
		this.outroImposto = outroImposto;
	}
	
	abstract BigDecimal calcular(Pedido pedido);
}
