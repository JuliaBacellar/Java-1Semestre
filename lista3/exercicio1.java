package lista3; // Define o pacote onde o arquivo está localizado.

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class exercicio1 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.

        // Criar um array para armazenar os 10 números digitados pelo usuário.
        int[] numeros = new int[10];

        // Loop que pede 10 números ao usuário e armazena no array
        for (int i = 0; i < 10; i++) {
            // Exibe uma mensagem para o usuário digitar um número, indicando a posição.
            System.out.print("Digite o número " + (i + 1) + ": ");
            // Armazena o número digitado pelo usuário na posição correspondente do array.
            numeros[i] = scanner.nextInt();
        }

        // Loop infinito para manter o programa rodando até o usuário decidir sair
        while (true) {
            // Exibe o menu de opções para o usuário escolher o que deseja saber
            System.out.println("\nEscolha uma opção:");
            System.out.println("a: Quantos números são pares?");
            System.out.println("b: Quantos números são ímpares?");
            System.out.println("c: Quantos números são negativos?");
            System.out.println("d: Quantos números são positivos?");
            System.out.println("e: Sair do programa");

            // Lê a opção escolhida pelo usuário.
            // - `scanner.next()` lê a próxima entrada digitada pelo usuário.
            // - `toLowerCase()` converte essa entrada para letras minúsculas (para evitar erro se o usuário digitar maiúsculas).
            // - `charAt(0)` pega apenas o primeiro caractere da entrada (se o usuário digitar uma palavra, ele pega só a primeira letra).
            char opcao = scanner.next().toLowerCase().charAt(0);

            // Variáveis para armazenar a contagem de cada categoria de números
            int pares = 0, impares = 0, negativos = 0, positivos = 0;

            // Loop para percorrer o array e contar os números de acordo com as condições
            for (int num : numeros) { // Para cada número presente no array "numeros"
                if (num % 2 == 0) { // Se o número for divisível por 2, é par
                    pares++;
                } else { // Caso contrário, é ímpar
                    impares++;
                }
                if (num < 0) { // Se o número for menor que 0, é negativo
                    negativos++;
                } else if (num > 0) { // Se o número for maior que 0, é positivo
                    positivos++;
                }
            }

            // Estrutura switch para decidir qual informação exibir, de acordo com a opção escolhida pelo usuário
            switch (opcao) {
                case 'a': // Se o usuário escolheu a opção "a"
                    System.out.println("Quantidade de números pares: " + pares);
                    break; // Encerra esse caso do switch
                case 'b': // Se o usuário escolheu a opção "b"
                    System.out.println("Quantidade de números ímpares: " + impares);
                    break; // Encerra esse caso do switch
                case 'c': // Se o usuário escolheu a opção "c"
                    System.out.println("Quantidade de números negativos: " + negativos);
                    break; // Encerra esse caso do switch
                case 'd': // Se o usuário escolheu a opção "d"
                    System.out.println("Quantidade de números positivos: " + positivos);
                    break; // Encerra esse caso do switch
                case 'e': // Se o usuário escolheu a opção "e"
                    System.out.println("Saindo do programa...");
                    System.exit(0); // Encerra o programa imediatamente
                    break; // Esse break é opcional, pois o programa já foi encerrado
                default: // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
