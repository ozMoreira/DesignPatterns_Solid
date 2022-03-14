package br.com.laminar.comportamental.strategy.teste;

import br.com.laminar.comportamental.strategy.Pedido;
import br.com.laminar.comportamental.strategy.SituacaoListener;

public class LogListener implements SituacaoListener{

	@Override
	public void update(Pedido pedido) {
		System.err.println("LOG: MUDOU A SITUACAO!"
				+ "Valor do Pedido R$ " + pedido.getValor());
		
	}

}