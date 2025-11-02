package listaTresQuestaoQuatro;

import java.util.ArrayList;

public class Main {

	public static String encontrarProdutoMaisCaro(ArrayList<Produto> produtos) {
		if (produtos == null || produtos.isEmpty()) {
			throw new IllegalStateException("A lista de produtos não pode estar vazia.");
		}

		Produto produtoMaisCaro = produtos.get(0);

		for (int i = 1; i < produtos.size(); i++) {
			Produto produtoAtual = produtos.get(i);

			if (produtoAtual.getPreco() > produtoMaisCaro.getPreco()) {
				produtoMaisCaro = produtoAtual;
			}
		}

		return produtoMaisCaro.getNome();
	}

	public static void main(String[] args) {

		ArrayList<Produto> listaDeProdutos = new ArrayList<>();

		listaDeProdutos.add(new Produto("Notebook", 4500.00));
		listaDeProdutos.add(new Produto("Mouse", 150.00));
		listaDeProdutos.add(new Produto("Teclado Mecânico", 550.00));
		listaDeProdutos.add(new Produto("Monitor Ultrawide", 2200.00));
		listaDeProdutos.add(new Produto("Headset", 300.00));

		System.out.println("Lista de produtos: " + listaDeProdutos);

		try {
			String nomeMaisCaro = encontrarProdutoMaisCaro(listaDeProdutos);
			System.out.println("O produto mais caro é: " + nomeMaisCaro);

			System.out.println("\nTestando com lista vazia");
			ArrayList<Produto> listaVazia = new ArrayList<>();
			String nomeMaisCaroVazio = encontrarProdutoMaisCaro(listaVazia);
			System.out.println("O produto mais caro é: " + nomeMaisCaroVazio);

		} catch (IllegalStateException e) {
			System.out.println("Erro capturado: " + e.getMessage());
		}

	}

}
