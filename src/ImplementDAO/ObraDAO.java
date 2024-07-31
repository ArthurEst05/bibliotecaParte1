package ImplementDAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import Interface.DAO;
import Obras.Obra;


public class ObraDAO implements DAO<Obra>{
    private static final String path = "C:\\temp\\DadosBiblioteca.txt";
    private Map<Integer, Obra> database = new HashMap<>();
    private int currentId = 0;

    public ObraDAO() throws IOException {
        loadFromFile();
    }


    @Override
    public void gravar(Obra obj) {
        obj.setId(currentId++);
        database.put(obj.getId(), obj);
        saveToFile();
        System.out.println("Obra gravada: " + obj.getTitulo());
    }

    @Override
    public void excluir(Obra obj) {
        database.remove(obj.getId());
        saveToFile();
        System.out.println("Obra excluida: " + obj.getTitulo());
    }

    @Override
    public void atualizar(Obra obj) {
        database.put(obj.getId(), obj);
        saveToFile();
        System.out.println("Obra Atualizado " + obj);
    }

    @Override
    public Obra ler(int id) {
        return database.get(id);
    }


      private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(database);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        File file = new File(path);
        if (!file.exists()) {
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            database = (HashMap<Integer, Obra>) ois.readObject();
            currentId = database.size();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    
}
