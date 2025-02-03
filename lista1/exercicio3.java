package lista1;
//pedindo quantidade de gols de dois times timeA e timeB e depois vai verificar
//quem venceu ou se houve empate

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        // cria o scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // pede para o usuário a quantidade de gols do timeA
        System.out.print("Digite a quantidade de gols do Time A: ");
        int golsTimeA = scanner.nextInt();

        // pede para o usuário a quantidade de gols do timeB
        System.out.print("Digite a quantidade de gols do Time B: ");
        int golsTimeB = scanner.nextInt();

        // ve quem venceu ou se houve empate
        if (golsTimeA > golsTimeB) {
            System.out.println("O Time A venceu!");
        } else if (golsTimeB > golsTimeA) {
            System.out.println("O Time B venceu!");
        } else {
            System.out.println("Houve um empate!");
        }


        scanner.close();
    }
}
