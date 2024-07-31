package ImplementDAO;

import Interface.DAO;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Usuarios.Usuarios;

import java.io.*;

public class UsuarioDAO implements DAO<Usuarios> {
    private static final String path = "C:\\temp\\DadosBiblioteca.txt";
    private Map<Integer, Usuarios> database = new HashMap<>();
    private int currentId = 0;

    public UsuarioDAO() throws IOException {
        loadFromFile();
    }

    @Override
    public void gravar(Usuarios obj) {
        obj.setId(currentId++);
        database.put(obj.getId(), obj);
        saveToFile();
        System.out.println("Usuário gravado: " + obj.getNome());
    }

    @Override
    public void excluir(Usuarios obj) {
        database.remove(obj.getId());
        saveToFile();
        System.out.println("Usuário excluido " + obj);
    }

    @Override
    public void atualizar(Usuarios obj) {
        database.put(obj.getId(), obj);
        saveToFile();
        System.out.println("Usuario Atualizado " + obj);
    }

    @Override
    public Usuarios ler(int id) {
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
            database = (HashMap<Integer, Usuarios>) ois.readObject();
            currentId = database.size();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
