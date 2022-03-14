package br.com.laminar.comportamental.strategy;

import java.math.BigDecimal;
import br.com.laminar.comportamental.strategy.situacao.Aberto;
import br.com.laminar.comportamental.strategy.situacao.Situacao;

public class Pedido {

	private BigDecimal valor;
	private Integer totalDeItens;
	private Situacao situacao = new Aberto();
	private EventManager manager = new EventManager();
	
	public void pagar() {
		situacao.pagar(this);
	}

	public void entregar() {
		situacao.entregar(this);
	}

	public void cancelar() {
		situacao.cancelar(this);
	}

	public void reabrir() {
		situacao.reabrir(this);
	}

	public Pedido(BigDecimal valor, int totalDeItens) { 
		this.valor = valor;
		this.totalDeItens = totalDeItens;
		
		PedidoFacade.criarPedido();
	}
	
	public Pedido(BigDecimal valor) { 
		this.valor = valor;
		
		PedidoFacade.criarPedido();
	}
	
	public void abrirChamado() {
		situacao.abrirChamado(this);
	}
	
	public BigDecimal getValor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return valor;
	}
	
	public Integer getTotalDeItens() {
		return totalDeItens;
	}
	
	public void setSituacao(Situacao situacao) {
		getManager().notifyListeners(this);
		this.situacao = situacao;
	}

	public EventManager getManager() {
		return manager;
	}
	
	
	
}
