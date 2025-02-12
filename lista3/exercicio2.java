package lista3;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário

        // Declaração das variáveis contadoras
        int acima50 = 0;  // Conta quantas pessoas têm mais de 50 anos
        int acima160 = 0; // Conta quantas pessoas têm altura maior que 1.60m
        int abaixo80 = 0; // Conta quantas pessoas pesam menos de 80kg

        // Loop para coletar dados de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":"); // Indica qual pessoa está sendo cadastrada

            // Captura a idade do usuário
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            // Captura a altura do usuário
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            // Captura o peso do usuário
            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            // Verifica as condições para atualizar os contadores
            if (idade > 50) acima50++;      // Se a idade for maior que 50, incrementa o contador acima50
            if (altura > 1.60) acima160++;  // Se a altura for maior que 1.60m, incrementa o contador acima160
            if (peso < 80) abaixo80++;      // Se o peso for menor que 80kg, incrementa o contador abaixo80
        }

        // Exibe os resultados finais
        System.out.println("\nResultados:");
        System.out.println("Pessoas com mais de 50 anos: " + acima50);
        System.out.println("Pessoas com altura acima de 1.60m: " + acima160);
        System.out.println("Pessoas com peso abaixo de 80kg: " + abaixo80);
    }
}
