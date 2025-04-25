import java.util.ArrayList;
import java.util.Scanner;

public class CadCli {

    public static void main(String[] args) {
    	ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("(c) Cadastrar cliente");
            System.out.println("(l) Listar clientes");
            System.out.println("(b) Buscar cliente por CPF");
            System.out.println("(e) Editar cliente por CPF");
            System.out.println("(s) Sair");
            opcao = scanner.nextLine().toLowerCase();

            switch (opcao) {
                case "c":
                    Cliente novo = new Cliente();
                    System.out.print("Digite o CPF (11 dígitos): ");
                    while (!novo.setCpf(scanner.nextLine()));

                    System.out.print("Digite o nome: ");
                    while (!novo.setNome(scanner.nextLine()));

                    System.out.print("Digite a idade: ");
                    while (!novo.setIdade(Integer.parseInt(scanner.nextLine())));

                    clientes.add(novo);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case "l":
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente c : clientes) {
                            System.out.println("------------------");
                            c.descricao();
                        }
                    }
                    break;

                case "b":
                    System.out.print("Digite o CPF para buscar: ");
                    String cpfBusca = scanner.nextLine();
                    Cliente encontrado = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfBusca)) {
                            encontrado = c;
                            break;
                        }
                    }
                    if (encontrado != null) {
                        encontrado.descricao();
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case "e":
                    System.out.print("Digite o CPF do cliente a editar: ");
                    String cpfEdita = scanner.nextLine();
                    Cliente clienteEditar = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfEdita)) {
                            clienteEditar = c;
                            break;
                        }
                    }

                    if (clienteEditar != null) {
                        System.out.print("Novo nome: ");
                        while (!clienteEditar.setNome(scanner.nextLine()));

                        System.out.print("Nova idade: ");
                        while (!clienteEditar.setIdade(Integer.parseInt(scanner.nextLine())));

                        System.out.println("Dados atualizados com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case "s":
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (!opcao.equals("s"));
        scanner.close();
    }
    
}
