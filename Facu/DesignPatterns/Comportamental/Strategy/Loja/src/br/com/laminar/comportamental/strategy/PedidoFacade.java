package br.com.laminar.comportamental.strategy;

public abstract class PedidoFacade {

	public static void criarPedido() {
		// processo de criação do pedido
		System.out.println("Consultar Score SERASA");
		System.out.println("Chamada para API ESTOQUE");
		System.out.println("Verificar se existe cobertura logistica para destino!");
	}

}
