import java.util.Scanner;

public class CadastrarCliente {
    public static Cliente cadastrarCliente(Scanner scanner) {
        Cliente novo = new Cliente();

        System.out.print("Digite o CPF (11 dígitos): ");
        while (!novo.setCpf(scanner.nextLine())) {
            System.out.print("Digite o CPF novamente: ");
        }

        System.out.print("Digite o nome: ");
        while (!novo.setNome(scanner.nextLine())) {
            System.out.print("Digite o nome novamente: ");
        }

        System.out.print("Digite a idade: ");
        while (true) {
            try {
                int idade = Integer.parseInt(scanner.nextLine());
                if (novo.setIdade(idade)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Idade inválida! Digite um número.");
            }
            System.out.print("Digite a idade novamente: ");
        }

        return novo;
    }
}
