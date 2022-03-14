package br.com.laminar.comportamental.strategy.situacao;

import br.com.laminar.comportamental.strategy.Pedido;

public class Pago extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado aberto para departamento LOGISTICA");
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}

	
}
