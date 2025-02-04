package lista1;//

import java.util.Scanner;

//pedir ao usuario a idade e vai falar se ele é criança adolescente ou adullto jovem ou adulto
public class exercicio1 {
    public static void main(String[] args) {
        //cria scanner para pegar o que o usuario colocar
        Scanner scanner = new Scanner(System.in);
          
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // faixa etária a pessoa se encaixa
        if (idade >= 0 && idade <= 14) {
            System.out.println("voce é Criança");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("voce é Adolescente");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("voce é Adulto jovem");
        } else {
            System.out.println("voce é Adulto");
        }

        
        scanner.close();
    }




}
