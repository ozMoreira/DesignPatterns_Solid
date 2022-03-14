package br.com.laminar.comportamental.strategy.teste;

import java.math.BigDecimal;
import br.com.laminar.comportamental.strategy.EmailListener;
import br.com.laminar.comportamental.strategy.Pedido;


public class TestaSituacao {
	
	public static void main (String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(100), 1);
		pedido.getManager().subscribe(new EmailListener());
		pedido.getManager().subscribe(new LogListener());
		
		pedido.abrirChamado();
		
		pedido.pagar();
		pedido.abrirChamado();
		

		
		
	}

}
