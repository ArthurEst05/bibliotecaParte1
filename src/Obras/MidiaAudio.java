package Obras;
public class MidiaAudio extends Obra{

    public MidiaAudio(String titulo, String autores, String area, String ano) {
        super(titulo, autores, area, ano);
    }

    public void visualizarObra(MidiaAudio midiaaudio){
        System.out.println("Consumindo MidiaAudio");
    }
}
