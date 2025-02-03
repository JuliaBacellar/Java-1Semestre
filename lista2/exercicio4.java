//pede um numero inteiro ao usuario e exibe o numero seu antecessor e sucessor
package lista2;
import java.util.Scanner;

public class exercicio4 {
        public static void main(String[] args) {
            // criação do scanner para leitura de dados
            Scanner scanner = new Scanner(System.in);

            // solicitação do número inteiro ao usuário
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // cálculo do antecessor e sucessor
            int antecessor = numero - 1;
            int sucessor = numero + 1;

            // exibição dos resultados
            System.out.println("O número informado foi " + numero + ", o antecessor é " + antecessor + " e o sucessor é " + sucessor + ".");

            scanner.close();
        }

}
