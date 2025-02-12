package lista3;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados das pessoas mais pesadas e mais altas
        String nomeMaisPesado = "", nomeMaisAlto = "";
        double pesoMaisPesado = 0, alturaMaisAlta = 0;

        // Loop para coletar dados de 6 pessoas
        for (int i = 1; i <= 6; i++) {
            System.out.println("\nPessoa " + i + ":");

            // Captura o nome do usuário
            System.out.print("Nome: ");
            String nome = scanner.next();

            // Captura a altura do usuário
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();

            // Captura o peso do usuário
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            // Verifica a pessoa mais pesada
            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomeMaisPesado = nome;
            }

            // Verifica a pessoa mais alta
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
        }

        // Exibe os resultados finais
        System.out.println("\nPessoa mais pesada: " + nomeMaisPesado + " com " + pesoMaisPesado + "kg");
        System.out.println("Pessoa mais alta: " + nomeMaisAlto + " com " + alturaMaisAlta + "m");
    }
}
