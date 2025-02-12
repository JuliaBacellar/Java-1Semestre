package lista3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis contadoras
        int otimo = 0, bom = 0, ruim = 0, total = 0;
        double mediaNotas = 0.0; // Variável para armazenar a soma das notas

        while (true) { // Loop infinito até que o usuário deseje parar
            // Exibe o menu de opções para o usuário
            System.out.println("\nAvalie o filme:");
            System.out.println("1 - Ótimo | 2 - Bom | 3 - Ruim");
            int opiniao = scanner.nextInt(); // Lê a opinião do usuário

            // Verifica qual foi a resposta e atualiza os contadores
            if (opiniao == 1) otimo++;
            else if (opiniao == 2) bom++;
            else if (opiniao == 3) ruim++;
            else {
                System.out.println("Opção inválida! Escolha 1, 2 ou 3."); // Caso o usuário digite um número inválido
                continue; // Volta ao início do loop sem contabilizar essa entrada
            }

            total++; // Incrementa o número total de respondentes
            mediaNotas += opiniao; // Soma as notas para calcular a média depois

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja continuar? (S/N): ");
            char continuar = scanner.next().toLowerCase().charAt(0);
            if (continuar == 'n') break; // Se o usuário digitar 'n', o loop é encerrado
        }

        // Cálculo das porcentagens
        double pctOtimo = ((double) otimo / total) * 100;
        double pctBom = ((double) bom / total) * 100;
        double pctRuim = ((double) ruim / total) * 100;
        double media = mediaNotas / total; // Calcula a média das notas

        // Exibe os resultados finais
        System.out.println("\nResultados:");
        System.out.println("Ótimo: " + otimo + " (" + pctOtimo + "%)");
        System.out.println("Bom: " + bom + " (" + pctBom + "%)");
        System.out.println("Ruim: " + ruim + " (" + pctRuim + "%)");
        System.out.println("Total de respondentes: " + total);
        System.out.println("Média das notas: " + media);
    }
}
