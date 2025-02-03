//pede ao usuario a quantidade de horas min e seg separado e depois converte
// o horario informado em segundos
package lista2;

import java.util.Scanner;

public class exercicio5 {
        public static void main(String[] args) {
            // criação do scanner para leitura de dados
            Scanner scanner = new Scanner(System.in);

            // solicitação de horas, minutos e segundos
            System.out.print("Digite a quantidade de horas: ");
            int horas = scanner.nextInt();

            System.out.print("Digite a quantidade de minutos: ");
            int minutos = scanner.nextInt();

            System.out.print("Digite a quantidade de segundos: ");
            int segundos = scanner.nextInt();

            // conversão para segundos
            int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

            // exibição do resultado
            System.out.println("O horário informado em segundos é: " + totalSegundos + " segundos.");


            scanner.close();
        }
}
