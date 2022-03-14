package br.com.laminar.comportamental.strategy.situacao;

import br.com.laminar.comportamental.strategy.Pedido;

public abstract class Situacao {

	public abstract void abrirChamado(Pedido pedido);
	
	public void pagar(Pedido pedido){
		throw new RuntimeException("Não pode transitar para PAGO");
	}
	

	public void entregar(Pedido pedido){
		throw new RuntimeException("Não pode transitar para ENTREGUE");
	}
	

	public void cancelar(Pedido pedido){
		throw new RuntimeException("Não pode transitar para CANCELAR");
	}
	
	public void reabrir(Pedido pedido){
		throw new RuntimeException("Não pode transitar para ABERTO");
	}
}
