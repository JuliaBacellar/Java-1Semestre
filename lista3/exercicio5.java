package lista3;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número limite
        System.out.print("Digite um número limite: ");
        int numero = scanner.nextInt();

        // Solicita ao usuário um valor de incremento
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        // Exibe a sequência de números com o incremento definido
        System.out.println("Saída do programa:");
        for (int i = 0; i <= numero; i += incremento) {
            System.out.print(i + " "); // Exibe os números na mesma linha
        }
    }
}
