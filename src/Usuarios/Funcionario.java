package Usuarios;

import java.io.Serializable;

public class Funcionario extends Usuarios implements Serializable{
    private static final long serialVersionUID = 1L;


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

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", salario=" + salario + ", endereço=" + endereço + ", getId()="
                + getId() + ", getCargo()=" + getCargo() + ", getSalario()=" + getSalario() + ", getNome()=" + getNome()
                + ", getEndereço()=" + getEndereço() + ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo()
                + ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    
}