package br.com.laminar.comportamental.strategy.situacao;

import br.com.laminar.comportamental.strategy.Pedido;

public class Cancelado extends Situacao {

	@Override
	public void reabrir(Pedido pedido) {
		pedido.setSituacao(new Aberto());
	}

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado aberto para departamento COMERCIAL");

	}

	
}
