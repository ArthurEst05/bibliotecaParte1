package Usuarios;

public class Funcionario extends Usuarios{

    private String cargo;
    private double salario;
    private String endereço;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, String sexo, String telefone, String cargo, double salario, String endereço) {
        super(nome, idade, sexo, telefone);
        this.cargo = cargo;
        this.salario = salario;
        this.endereço = endereço;
    }

    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    
}
