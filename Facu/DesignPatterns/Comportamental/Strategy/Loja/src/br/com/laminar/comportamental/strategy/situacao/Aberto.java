package br.com.laminar.comportamental.strategy.situacao;

import br.com.laminar.comportamental.strategy.Pedido;

public class Aberto extends Situacao{

	@Override
	public void pagar(Pedido pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado aberto para departamento FINANCEIRO");
	}

	
}
