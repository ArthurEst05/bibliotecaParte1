package Obras;
public class Fotografia extends Obra{

    public Fotografia(String titulo, String autores, String area, String ano) {
        super(titulo, autores, area, ano);
    }

    public void visualizarObra(Fotografia fotografia){
        System.out.println("Visualizando Fotografia");
    }
}
