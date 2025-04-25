import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal com o método main.
 * Controla o menu de cadastro, listagem, busca e edição de clientes.
 * 
 * @author Gabriel Rodrigues dos Santos
 */
public class CadCli {
    /**
     * Método principal que executa o menu do programa.
     * 
     * @param args argumentos da linha de comando (não utilizados).
     */
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
                    Cliente novoCliente = CadastrarCliente.cadastrarCliente(scanner);
                    clientes.add(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println("Dados do cliente:");
                    novoCliente.descricao(); // Exibir logo após cadastro
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
                        while (!clienteEditar.setNome(scanner.nextLine())) {
                            System.out.print("Digite o nome novamente: ");
                        }

                        System.out.print("Nova idade: ");
                        while (true) {
                            try {
                                int idade = Integer.parseInt(scanner.nextLine());
                                if (clienteEditar.setIdade(idade)) {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Idade inválida! Digite um número.");
                            }
                            System.out.print("Digite a idade novamente: ");
                        }

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
