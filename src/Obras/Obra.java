package Obras;
<<<<<<< HEAD
public class Obra {
=======

import java.io.Serializable;

public abstract class Obra implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
>>>>>>> a004c8d082749f70ac2cbcfbed27c1cfb5dd62f4
    private String titulo;
    private String autores;
    private String area;
    private String ano;
    
    public Obra(String titulo, String autores, String area, String ano) {
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public void visualizarObra(Obra obra){
        System.out.println("Visualizando obra");
    }
    
}
