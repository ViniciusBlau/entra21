package Classe04;

public class Produtos {

	/*
	 * A partir das representações abaixo dos objetos de uma classe Produto. Escreva
	 * o código necessário para suportar tais objetos. Ou seja, o código necessário
	 * para criar a classe e instanciar os objetos de modo que fiquem com o estado
	 * apresentado.
	 * 
	 * produto1: Produto nome = “Caderno” descricao = “Caderno em espiral tamanho
	 * médio” precoUnitario = 4,50 desconto = 15
	 * 
	 * 
	 * produto2: Produto nome = “Caneta ESF” descricao = “Caneta esferográfica 5mm”
	 * precoUnitario = 1,20 desconto = 2
	 * 
	 * 
	 * produto3: Produto nome = “Esquadro” descricao = “Esquadro de acrílico 20 cm”
	 * precoUnitario = 2,35 desconto = 10
	 * 
	 */
	
	String nomeProduto;
	String descricao;
	double precoUnitario;
	double desconto;
	
	
	
	public Produtos(String nomeProduto, String descricao, double precoUnitario, double desconto) {
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.desconto = desconto;
	}



	public String imprimirInformacoes() {
		return "Produto: " + nomeProduto + " - Descrição: " + descricao + " - Preço unitário: " +
				precoUnitario + " - Desconto: " + desconto;
	}
	
}
