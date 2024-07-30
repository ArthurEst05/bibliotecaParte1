import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import ImplementDAO.UsuarioDAO;
import Interface.DAO;
import Obras.Livro;
import Usuarios.Usuarios;
import Usuarios.Funcionario;
import Usuarios.Estudante;
import Usuarios.Professor;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Emprestimos> emprestimos = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        DAO<Usuarios> usuarioDAO = new UsuarioDAO();

        while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Gerenciar usuário");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Realizar devolução");
            System.out.println("5. Listar todos os empréstimos");
            System.out.println("6. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Cadastrar livro");
                    System.out.println("Qual o titulo do livro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Qual o autor do livro: ");
                    String autores = sc.nextLine();
                    System.out.println("Qual a area do livro: ");
                    String area = sc.nextLine();
                    System.out.println("Qual a editora do livro: ");
                    String editora = sc.nextLine();
                    System.out.println("Qual o ano do livro: ");
                    String ano = sc.nextLine();
                    System.out.println("Qual a edição do livro: ");
                    String edicao = sc.nextLine();
                    System.out.println("Quantas folhas o tem livro: ");
                    int numFolhas = sc.nextInt();
                    sc.nextLine();
                    Livro livro = new Livro(titulo, autores, area, editora, ano, edicao, numFolhas, false);
                    livros.add(livro);
                    break;
                case 2:
                    System.out.println("1.Cadastrar Usuário \n2.Excluir Usuário \n3.Atualizar Usuário \n4.Ler Usuário");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Cadastrar usuário");
                            System.out.print("Você deseja cadastrar 1.Funcionario 2.Professor 3.Estudante: ");
                            opcao = sc.nextInt();
                            switch (opcao) {
                                case 1:
                                    System.out.println("Qual o nome do usuário: ");
                                    String nome = sc.nextLine();
                                    System.out.println("Qual a idade do usuário: ");
                                    int idade = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Qual o sexo do usuário: ");
                                    String sexo = sc.nextLine();
                                    System.out.println("Qual o telefone do usuário: ");
                                    String telefone = sc.nextLine();
                                    System.out.println("Qual o cargo do funcionario: ");
                                    String cargo = sc.nextLine();
                                    System.out.println("Qual o salario do funcionario: ");
                                    double salario = sc.nextDouble();
                                    System.out.println("Qual o endereço do funcionario: ");
                                    String endereco = sc.nextLine();
                                    Usuarios usuario = new Funcionario(nome, idade, sexo, telefone, cargo, salario, endereco);
                                    usuarios.add(usuario);
                                    usuarioDAO.gravar(usuario);
                                    break;
                                case 2:
                                    System.out.println("Qual o nome do usuário: ");
                                    nome = sc.nextLine();
                                    System.out.println("Qual a idade do usuário: ");
                                    idade = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Qual o sexo do usuário: ");
                                    sexo = sc.nextLine();
                                    System.out.println("Qual o telefone do usuário: ");
                                    telefone = sc.nextLine();
                                    System.out.println("Qual o grau academico do professor: ");
                                    String grau = sc.nextLine();
                                    System.out.println("Qual a disciplina do professor: ");
                                    String disciplina = sc.nextLine();
                                    usuario = new Professor(nome, idade, sexo, telefone, disciplina, grau);
                                    usuarios.add(usuario);
                                    usuarioDAO.gravar(usuario);
                                    break;
                                case 3:
                                    System.out.println("Qual o nome do usuário: ");
                                    nome = sc.nextLine();
                                    System.out.println("Qual a idade do usuário: ");
                                    idade = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Qual o sexo do usuário: ");
                                    sexo = sc.nextLine();
                                    System.out.println("Qual o telefone do usuário: ");
                                    telefone = sc.nextLine();
                                    System.out.println("Qual a escola do sujeito: ");
                                    String inst = sc.nextLine();
                                    System.out.println("Qual a matricula do sujeito: ");
                                    String matricula = sc.nextLine();
                                    usuario = new Estudante(nome, idade, sexo, telefone, inst, matricula);
                                    usuarios.add(usuario);
                                    usuarioDAO.gravar(usuario);
                                    break;
                                case 2 :
                                    
                            }
                    }
                case 3:
                    System.out.println("Opção 3 selecionada: Realizar empréstimo");
                    System.out.println("Data do emprestimo: ");
                    String dataEmprestimo = sc.nextLine();
                    System.out.println("Hora do emprestimo: ");
                    String horaEmprestimo = sc.nextLine();
                    System.out.println("Nome do livro: ");
                    String tituloLivro = sc.nextLine();
                    Livro livroselecionado = new Livro(null, null, null, null);
                    for (Livro l : livros) {
                        if (tituloLivro.equals(l.getTitulo())) {
                            livroselecionado = l;
                        }
                    }
                    System.out.println("Nome do usuário: ");
                    String nomeUsuario = sc.nextLine();
                    System.out.println("Qual o usuário que deseja fazer a realização do emprestimo : 1.Funcionario 2.Professor 3.Estudante");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            Usuarios usuarioselecionado = new Funcionario();
                            for (Usuarios u : usuarios) {
                                if (nomeUsuario.equals(u.getNome())) {
                                    usuarioselecionado = u;
                                }
                            }
                            Emprestimos emprestimo = new Emprestimos(dataEmprestimo, horaEmprestimo, livroselecionado, usuarioselecionado);
                            emprestimos.add(emprestimo);
                            break;
                        case 2:
                            usuarioselecionado = new Professor();
                            for (Usuarios u : usuarios) {
                                if (nomeUsuario.equals(u.getNome())) {
                                    usuarioselecionado = u;
                                }
                            }
                            emprestimo = new Emprestimos(dataEmprestimo, horaEmprestimo, livroselecionado, usuarioselecionado);
                            emprestimos.add(emprestimo);
                            break;
                        case 3:
                            usuarioselecionado = new Estudante();
                            for (Usuarios u : usuarios) {
                                if (nomeUsuario.equals(u.getNome())) {
                                    usuarioselecionado = u;
                                }
                            }
                            emprestimo = new Emprestimos(dataEmprestimo, horaEmprestimo, livroselecionado, usuarioselecionado);
                            emprestimos.add(emprestimo);
                            break;
                    }
                case 4:
                    System.out.println("Opção 4 selecionada: Realizar devolução");
                    System.out.println("Nome do Livro que queria fazer devolução: ");
                    tituloLivro = sc.nextLine();
                    System.out.println("Nome da pessoa que pegou emprestado: ");
                    nomeUsuario = sc.nextLine();
                    Emprestimos emprestimosselecionado = new Emprestimos(null, null, null, null);
                    Livro livroDevolvido = new Livro(null, null, null, null);
                    for (Emprestimos e : emprestimos) {
                        if (tituloLivro.equals(e.getLivros().getTitulo()) && nomeUsuario.equals(e.getUsuarios().getNome())) {
                            emprestimosselecionado = e;
                            livroDevolvido = e.getLivros();
                        }
                    }
                    emprestimosselecionado.devolverLivro(livroDevolvido);
                    emprestimos.remove(emprestimosselecionado);
                    break;
                case 5:
                    System.out.println("Opção 5 selecionada: Listar todos os empréstimos");
                    for (Emprestimos e : emprestimos) {
                        System.out.println("Livro: " + e.getLivros().getTitulo());
                    }
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
    }
}
