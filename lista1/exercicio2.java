package lista1;
//perguntando ao usuario o valor unitario do produto e a quantidade
//que ele vai ter que comprar.E depois mostra o total da compra


import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        // criação do scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // pede  ao usuário o valor unitário do produto
        System.out.print("Digite o valor unitário do produto: R$ ");
        double valorUnitario = scanner.nextDouble();

        // solicita ao usuário a quantidade desejada
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        // calcula o valor total da compra
        double valorTotal;

        if (quantidade <= 12) {
            valorTotal = valorUnitario * quantidade;
        } else {
            // aplica o desconto de 10% se a quantidade for maior que 12
            valorUnitario *= 0.9;  // Desconto de 10%
            valorTotal = valorUnitario * quantidade;
        }

        // mostra o valor total da compra
        System.out.printf("O valor total da compra é: R$ %.2f%n", valorTotal);

        // fecha o scanner
        scanner.close();
    }
}
