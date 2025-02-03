package lista1;
//gera um numero da sorte aleatório e ve se o usuario acertou ou n
import java.util.Random;
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        // cria o scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // criação de um objeto Random para gerar o número aleatório
        Random random = new Random();

        // gera um número aleatório entre 1 e 100 (inclusive)
        int numeroSorte = random.nextInt(100) + 1;

        // solicita que o usuário tente adivinhar o número
        System.out.print("Tente adivinhar o número da sorte (entre 1 e 100): ");
        int palpite = scanner.nextInt();

        // verifica se o palpite do usuário está correto
        if (palpite == numeroSorte) {
            System.out.println("Você acertou! O número da sorte era: " + numeroSorte);
        } else {
            System.out.println("Você errou! O número da sorte era: " + numeroSorte);
        }


        scanner.close();
    }

}
