package lista1;//

import java.util.Scanner;

//pedir ao usuario a idade e vai falar se ele é criança adolescente ou adullto jovem ou adulto
public class exercicio1 {
    public static void main(String[] args) {
        // Criação do scanner para pegar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a idade
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Verifica em qual faixa etária a pessoa se encaixa
        if (idade >= 0 && idade <= 14) {
            System.out.println("Classificação: Criança");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Classificação: Adulto jovem");
        } else {
            System.out.println("Classificação: Adulto");
        }

        // Fecha o scanner
        scanner.close();
    }




}