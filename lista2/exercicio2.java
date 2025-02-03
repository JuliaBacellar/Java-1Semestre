///faz a soma subtração multiplicação e divisõa e potencia e mostra o resto da divisão

package lista2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        // cria do scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // solicitação dos números ao usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();


        int soma = num1 + num2;
        System.out.println("Soma: " + soma);


        int subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao);


        int multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);


        if (num2 != 0) {
            double divisao = (double) num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("A divisão não poderá ser realizada.");
        }

        // potenciação (Desafio 2: Pesquisar potenciação em Java)
        double potencia = Math.pow(num1, num2);  //exponenciação
        System.out.println("Potência: " + potencia);

        // resto da divisão
        int resto = num1 % num2;
        System.out.println("Resto da divisão: " + resto);


        scanner.close();
    }
}

