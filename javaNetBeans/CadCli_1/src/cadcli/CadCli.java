package cadcli;

public class CadCli {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setCpf("12345678900");
        c1.setNome("jose silva");
        c1.setIdade(55);
        c1.descricao();
    }
    
}
