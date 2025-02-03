
//de acordo com a compra de mercadoria tem o valor do representante e impostos e vendas
package lista2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        // criação do scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // pede o valor de compra
        System.out.print("Digite o valor de compra da mercadoria: R$ ");
        double valorCompra = scanner.nextDouble();

        // (20% do valor de compra)
        double representante = valorCompra * 0.20;

        //(30% do valor de compra)
        double impostos = valorCompra * 0.30;

        //(valor de compra + representante + impostos)
        double valorVenda = valorCompra + representante + impostos;

        // exibição dos resultados
        System.out.println("\nValor de compra: R$ " + valorCompra);
        System.out.println("Valor do representante (20%): R$ " + representante);
        System.out.println("Valor dos impostos (30%): R$ " + impostos);
        System.out.println("Valor de venda: R$ " + valorVenda);


        scanner.close();
    }
}
