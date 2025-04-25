/**
 * Classe que representa um cliente com CPF, nome e idade.
 * 
 * @author Gabriel Rodrigues dos Santos
 */
public class Cliente {
    private String cpf;
    private String nome;
    private int idade;

    /**
     * Construtor padrão. Inicializa os atributos com valores padrão.
     */
    public Cliente() {
        this.cpf = "";
        this.nome = "";
        this.idade = 0;
    }

    /**
     * Exibe os dados do cliente.
     */
    public void descricao() {
        System.out.println("cpf: " + this.getCpf());
        System.out.println("nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
    }

    /**
     * Retorna o CPF do cliente.
     * @return CPF como String.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente, com validação.
     * @param cpf CPF com 11 dígitos.
     * @return true se for válido, false caso contrário.
     */
    public boolean setCpf(String cpf) {
        if (cpf.length() == 11 && cpf.chars().allMatch(Character::isDigit)) {
            this.cpf = cpf;
            return true;
        }
        System.out.println("CPF inválido! Deve conter 11 dígitos numéricos.");
        return false;
    }

    /**
     * Retorna o nome do cliente.
     * @return nome como String.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente, com validação.
     * @param nome nome com no mínimo 2 letras.
     * @return true se for válido, false caso contrário.
     */
    public boolean setNome(String nome) {
        if (nome.length() >= 2) {
            this.nome = nome;
            return true;
        }
        System.out.println("Nome inválido! Deve conter pelo menos 2 letras.");
        return false;
    }

    /**
     * Retorna a idade do cliente.
     * @return idade como inteiro.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do cliente, com validação.
     * @param idade valor entre 0 e 100.
     * @return true se for válido, false caso contrário.
     */
    public boolean setIdade(int idade) {
        if (idade >= 0 && idade <= 100) {
            this.idade = idade;
            return true;
        }
        System.out.println("Idade inválida! Deve estar entre 0 e 100 anos.");
        return false;
    }
}
