package br.com.laminar.comportamental.strategy.situacao;

import br.com.laminar.comportamental.strategy.Pedido;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado aberto para departamento POS VENDA");
	}

	
}
	