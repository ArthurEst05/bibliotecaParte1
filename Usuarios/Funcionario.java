package Usuarios;

public class Funcionario extends Usuarios{
    private String id;
    private String cargo;
    private double salario;
    private String endereço;
    
    public Funcionario(String nome, int idade, String sexo, String telefone) {
        super(nome, idade, sexo, telefone);
    }

    public Funcionario(String nome, int idade, String sexo, String telefone, String id, String cargo, double salario,
            String endereço) {
        super(nome, idade, sexo, telefone);
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.endereço = endereço;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    
}
