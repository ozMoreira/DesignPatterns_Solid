package br.com.laminar.comportamental.strategy.imposto;

import java.math.BigDecimal;
import br.com.laminar.comportamental.strategy.Pedido;

public class CalculadoraDeImposto {
	
	private Imposto imposto;

	public BigDecimal calcula(Pedido pedido) {
		return imposto.calcular(pedido);
	}
	
	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
}

