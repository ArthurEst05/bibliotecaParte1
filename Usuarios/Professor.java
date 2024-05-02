package Usuarios;

public class Professor extends Usuarios{
    private String disciplina;
    private String grauAcademico;

    public Professor(String nome, int idade, String sexo, String telefone) {
        super(nome, idade, sexo, telefone);
    }

    public Professor(String nome, int idade, String sexo, String telefone, String disciplina, String grauAcademico) {
        super(nome, idade, sexo, telefone);
        this.disciplina = disciplina;
        this.grauAcademico = grauAcademico;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getGrauAcademico() {
        return grauAcademico;
    }
    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    
    
}
