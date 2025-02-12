package lista3;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número para gerar a tabuada
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada do número de 0 a 10
        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i)); // Multiplica e imprime o resultado
        }
    }
}

