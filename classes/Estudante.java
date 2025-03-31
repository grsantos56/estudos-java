
package herancapt2;

public class Estudante extends Pessoa{
    private int matricula;
    private String curso;
    
    public void pagarMens(){
        System.out.println("pagando mensalidade");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
