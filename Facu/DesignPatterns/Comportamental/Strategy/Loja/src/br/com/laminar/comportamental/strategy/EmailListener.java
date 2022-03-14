package br.com.laminar.comportamental.strategy;

public class EmailListener implements SituacaoListener{

	@Override
	public void update(Pedido pedido) {
		System.out.println("Enviar email para o pedido "+ pedido + " !"
				+ "\n Valor do Pedido: R$ " + pedido.getValor());
		
	}

}
