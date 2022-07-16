package pacoteExecucao;
import java.util.Scanner;
import entities.Product;


public class Exercicio01 {
	
	public static void main (String[] args) {

		
		System.out.println("Vamos iniciar uma lógica de acesso à Classes");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um nome para dar ao Produto: ");
		String nomeProduto = sc.nextLine();
			
		System.out.println("Digite o valor que deseja para o Produto: ");
		double valorProduto = sc.nextDouble();
		
		System.out.println("Digite a quantidade do Produto desejado: ");
		int quantProduto = sc.nextInt();
			
		Product produto = new Product();
		
		produto.setName(nomeProduto);
		produto.setValor(valorProduto);
		
		double produtoMultiplicado = calcular(quantProduto, valorProduto);
		
		System.out.println("O nome do produto é: " + produto.getName());
		
		System.out.printf("O valor do produto é: %.2f", produto.getValor());
		
		System.out.println();
		
		System.out.printf("O valor do produto multiplicado pela quantidade é: %.2f", produtoMultiplicado);
		
		System.out.println();
		
		double desconto = ((valorProduto * 0.1));
		
		System.out.println("O desconto será de 10%, equivalendo a R$" + desconto);
		
		double valorTotal = (produtoMultiplicado - desconto);
		
		System.out.println("Valor total de R$ " + valorTotal);
		
		sc.close();
		
		}
		
		public static double calcular (double a, double b) {
			double calc = a * b;
			return calc;
		}
	}