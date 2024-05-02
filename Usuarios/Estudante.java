package Usuarios;

public class Estudante extends Usuarios{
    private String instituicaoEducacional;
    private String matricula;

    public Estudante(String nome, int idade, String sexo, String telefone) {
        super(nome, idade, sexo, telefone);
    }

    public Estudante(String nome, int idade, String sexo, String telefone, String instituicaoEducacional,
            String matricula) {
        super(nome, idade, sexo, telefone);
        this.instituicaoEducacional = instituicaoEducacional;
        this.matricula = matricula;
    }
    
    public String getInstituicaoEducacional() {
        return instituicaoEducacional;
    }
    public void setInstituicaoEducacional(String instituicaoEducacional) {
        this.instituicaoEducacional = instituicaoEducacional;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}
