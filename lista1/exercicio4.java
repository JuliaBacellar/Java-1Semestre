package lista1;//programa que pergunta ao usuario se ele quer ir para porto de galinhas
//ou se quer macerio tem que escolher se quer incluir almoço ou janta
//dependendo do que colocou no programa ele resulta em um acréscimo


import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        // cria scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // valor base da viagem
        double valorBase = 3000.00;

        // exibe opções de viagen para o usuário
        System.out.println("escolha onde quer passar aS FERIAAS:");
        System.out.println("1 - campinas");
        System.out.println("2 - araçatuba");
        System.out.print("onde voce escolhe opçao 1 ou 2 ");
        int destino = scanner.nextInt();

        // Pergunta se o usuário quer o valor com almoço/janta incluso
        System.out.println("incluir almoço/janta?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("qual a opção desejada: ");
        int opcaoAlmocoJanta = scanner.nextInt();

        // variável para armazenar o valor final da viagem
        double valorFinal = 0;

        // lógica para calcular o valor final da viagem com base nas escolhas do usuário
        if (destino == 1) { // Maceió
            if (opcaoAlmocoJanta == 1) { // Sim
                valorFinal = valorBase + (valorBase * 1.00); // + 100%
            } else if (opcaoAlmocoJanta == 2) { // Não
                valorFinal = valorBase + (valorBase * 0.85); // + 85%
            } else {
                System.out.println("Opção inválida para almoço/janta!");
                return;
            }
        } else if (destino == 2) { // campinas
            if (opcaoAlmocoJanta == 1) { // Sim
                valorFinal = valorBase + (valorBase * 0.60); // + 60%
            } else if (opcaoAlmocoJanta == 2) { // Não
                valorFinal = valorBase + (valorBase * 0.45); // + 45%
            } else {
                System.out.println("Opção inválida para almoço/janta!");
                return;
            }
        } else {
            System.out.println("Destino inválido!");
            return;
        }

        // mostra o valor final da viagem
        System.out.printf("O valor final da viagem é: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
