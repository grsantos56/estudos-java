import java.util.Scanner;

/**
 * Classe utilitária para cadastrar um novo cliente.
 * 
 * @author Gabriel Rodrigues dos Santos
 */
public class CadastrarCliente {

    /**
     * Cria um cliente novo pedindo os dados via terminal.
     * Usa os métodos de validação do Cliente.
     * 
     * @param scanner objeto Scanner para entrada do usuário.
     * @return objeto Cliente criado.
     */
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
