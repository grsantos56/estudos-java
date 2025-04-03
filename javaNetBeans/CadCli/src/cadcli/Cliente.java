
package cadcli;

public class Cliente {
    private String cpf;
    private String nome;
    private int idade;

    public Cliente() {
        this.cpf = "";
        this.nome = "";
        this.idade = 0;
    }
    
    public void descricao(){
        System.out.println("cpf: " + this.getCpf());
        System.out.println("nome: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
    }
    
    public String getCpf() {
        return cpf;
    }

   public boolean setCpf(String cpf) {
        if (cpf.length() == 11 && cpf.chars().allMatch(Character::isDigit)) {
            this.cpf = cpf;
            return true;
        }
        System.out.println("CPF inválido! Deve conter 11 dígitos numéricos.");
        return false;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.length() >= 2) {
            this.nome = nome;
            return true;
        }
        System.out.println("Nome inválido! Deve conter pelo menos 2 letras.");
        return false;
    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if (idade >= 0 && idade <= 100) {
            this.idade = idade;
            return true;
        }
        System.out.println("Idade inválida! Deve estar entre 0 e 100 anos.");
        return false;
    }
    
}
