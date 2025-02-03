package lista2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        // cria o scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cadastro para vaga de emprego na Bosch");

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a sua data de nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite a sua pretensão salarial: ");
        double pretensaoSalarial = scanner.nextDouble();

        // limpeza do buffer do scanner após a leitura do número
        scanner.nextLine();

        System.out.print("Digite o seu grau de instrução (ensino médio, ensino técnico ou ensino superior): ");
        String grauInstrucao = scanner.nextLine();

        System.out.print("Digite o cargo pretendido: ");
        String cargoPretendido = scanner.nextLine();

        System.out.print("Você possui CNH do tipo B? (sim ou não): ");
        String possuiCNH = scanner.nextLine();

        // exibição dos dados cadastrados
        System.out.println("\nCadastro realizado com sucesso! Aqui estão os seus dados:");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Pretensão salarial: R$ " + pretensaoSalarial);
        System.out.println("Grau de instrução: " + grauInstrucao);
        System.out.println("Cargo pretendido: " + cargoPretendido);
        System.out.println("Possui CNH do tipo B: " + possuiCNH);


        scanner.close();
    }
}
