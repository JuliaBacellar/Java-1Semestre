package lista1;//fará duas perguntas com três alternativas, e o usuário poderá escolher
// qual pergunta deseja responder. O código também foi feito para aceitar as respostas
// "a", "A", "b", "B", "c", "C"
// e minimizar a resposta do usuário para compará-la corretamente.

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        // criação do scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // mensagem inicial para o usuário escolher qual pergunta responder
        System.out.println("Escolha uma pergunta para responder:");
        System.out.println("1 - Pergunta 1");
        System.out.println("2 - Pergunta 2");
        System.out.print("Digite o número da pergunta escolhida: ");
        int perguntaEscolhida = scanner.nextInt();
        scanner.nextLine();

        // variavel para armazenar a resposta correta
        String respostaCorreta = "";

        // perguntas e alternativas
        if (perguntaEscolhida == 1) {
            System.out.println("Pergunta 1: Qual é a capital do Brasil?");
            System.out.println("a) São Paulo");
            System.out.println("b) Rio de Janeiro");
            System.out.println("c) Brasília");
            System.out.print("Digite a alternativa correta: ");
            respostaCorreta = "c";
        } else if (perguntaEscolhida == 2) {
            System.out.println("Pergunta 2: Quem escreveu 'Dom Casmurro'?");
            System.out.println("a) Machado de Assis");
            System.out.println("b) José de Alencar");
            System.out.println("c) Clarice Lispector");
            System.out.print("Digite a alternativa correta: ");
            respostaCorreta = "a";
        } else {
            System.out.println("Opção inválida de pergunta. Tente novamente.");
            scanner.close();
            return;
        }

        // tem a resposta do usuário e a converte para minúscula
        String respostaUsuario = scanner.nextLine().toLowerCase();

        // verifica se a resposta do usuário está correta
        if (respostaUsuario.equals(respostaCorreta)) {
            System.out.println("Você acertou, pode retirar seu bônus.");
        } else {
            System.out.println("Você não acertou, mas tente novamente numa próxima.");
        }


        scanner.close();
    }
}
