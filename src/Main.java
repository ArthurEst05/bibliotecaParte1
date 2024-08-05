import java.util.ArrayList;
import java.util.Scanner;

<<<<<<< HEAD
import Obras.Livro;
=======
import Emprest.Emprestimos;
import ImplementDAO.ObraDAO;
import ImplementDAO.UsuarioDAO;
import Interface.DAO;
import Obras.Livro;
import Obras.Obra;
import Usuarios.Estudante;
import Usuarios.Funcionario;
import Usuarios.Professor;
>>>>>>> a004c8d082749f70ac2cbcfbed27c1cfb5dd62f4
import Usuarios.Usuarios;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        ArrayList<Emprestimos> emprestimos = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuarios> usuarios = new ArrayList<>();
=======
        ArrayList<Emprestimos> emprestimos = loadFromFile(EMPRESTIMOS_FILE, new TypeToken<ArrayList<Emprestimos>>(){}.getType());
        ArrayList<Livro> livros = loadFromFile(LIVROS_FILE, new TypeToken<ArrayList<Livro>>(){}.getType());
        ArrayList<Usuarios> usuarios = loadFromFile(USUARIOS_FILE, new TypeToken<ArrayList<Usuarios>>(){}.getType());
        DAO<Usuarios> usuarioDAO = new UsuarioDAO();
        DAO<Obra> obraDao = new ObraDAO();
>>>>>>> a004c8d082749f70ac2cbcfbed27c1cfb5dd62f4

         while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
<<<<<<< HEAD
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Cadastrar usuário");
=======
            System.out.println("1. Gerenciar livro");
            System.out.println("2. Gerenciar usuário");
>>>>>>> a004c8d082749f70ac2cbcfbed27c1cfb5dd62f4
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Realizar devolução");
            System.out.println("5. Listar todos os empréstimos");
            System.out.println("6. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
<<<<<<< HEAD
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
                    System.out.println("Opção 2 selecionada: Cadastrar usuário");
                    System.out.println("Qual o nome do usuário: ");
                    String nome = sc.nextLine();
                    System.out.println("Qual a idade do usuário: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Qual o sexo do usuário: ");
                    String sexo = sc.nextLine();
                    System.out.println("Qual o telefone do usuário: ");
                    String telefone = sc.nextLine();
                    Usuarios usuario = new Usuarios(nome, idade, sexo, telefone);
                    usuarios.add(usuario);
=======
                    System.out.println("1. Cadastrar Livro");
                    System.out.println("2. Excluir Livro");
                    System.out.println("3. Ler Livro");
                    int subOpcao = sc.nextInt();
                    sc.nextLine();

                    switch (subOpcao) {
                        case 1:
                            System.out.println("Opção 1 selecionada: Cadastrar livro");
                            System.out.println("Qual o título do livro: ");
                            String titulo = sc.nextLine();
                            System.out.println("Qual o autor do livro: ");
                            String autores = sc.nextLine();
                            System.out.println("Qual a área do livro: ");
                            String area = sc.nextLine();
                            System.out.println("Qual a editora do livro: ");
                            String editora = sc.nextLine();
                            System.out.println("Qual o ano do livro: ");
                            String ano = sc.nextLine();
                            System.out.println("Qual a edição do livro: ");
                            String edicao = sc.nextLine();
                            System.out.println("Quantas folhas tem o livro: ");
                            int numFolhas = sc.nextInt();
                            sc.nextLine();
                            Livro livro = new Livro(titulo, autores, area, editora, ano, edicao, numFolhas, false);
                            livros.add(livro);
                            saveToFile(LIVROS_FILE, livros);
                            break;
                        case 2:
                            System.out.println("Excluir livro");
                            System.out.println("Informe o ID do livro a ser excluído: ");
                            int idExcluir = sc.nextInt();
                            sc.nextLine();
                            Livro livroExcluir = (Livro) obraDao.ler(idExcluir);
                            if (livroExcluir != null) {
                                obraDao.excluir(livroExcluir);
                                livros.remove(livroExcluir);
                                saveToFile(LIVROS_FILE, livros);
                                System.out.println("Livro excluído com sucesso.");
                            } else {
                                System.out.println("Livro não encontrado.");
                            }
                            break;
                        case 3:
                            System.out.println("Ler livro");
                            System.out.println("Informe o ID do livro a ser lido: ");
                            int idLer = sc.nextInt();
                            sc.nextLine();
                            Livro obraLer = (Livro) obraDao.ler(idLer);
                            if (obraLer != null) {
                                System.out.println("Dados do livro:");
                                System.out.println("Título: " + obraLer.getTitulo());
                                System.out.println("Autores: " + obraLer.getAutores());
                                System.out.println("Área: " + obraLer.getArea());
                                System.out.println("Editora: " + obraLer.getEditora());
                                System.out.println("Ano de lançamento: " + obraLer.getAno());
                                System.out.println("Edição: " + obraLer.getEdicao());
                                System.out.println("Número de folhas: " + obraLer.getNumFolhas());
                            } else {
                                System.out.println("Livro não encontrado.");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1. Cadastrar Usuário");
                    System.out.println("2. Excluir Usuário");
                    System.out.println("3. Atualizar Usuário");
                    System.out.println("4. Ler Usuário");
                    int subOpcao1 = sc.nextInt();
                    sc.nextLine();

                    switch (subOpcao1) {
                        case 1:
                            System.out.println("Cadastrar usuário");
                            System.out.print("Você deseja cadastrar 1. Funcionário 2. Professor 3. Estudante: ");
                            int tipoUsuario = sc.nextInt();
                            sc.nextLine();
                            
                            System.out.println("Qual o nome do usuário: ");
                            String nome = sc.nextLine();
                            System.out.println("Qual a idade do usuário: ");
                            int idade = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Qual o sexo do usuário: ");
                            String sexo = sc.nextLine();
                            System.out.println("Qual o telefone do usuário: ");
                            String telefone = sc.nextLine();

                            Usuarios usuario = null;
                            switch (tipoUsuario) {
                                case 1:
                                    System.out.println("Qual o cargo do funcionário: ");
                                    String cargo = sc.nextLine();
                                    System.out.println("Qual o salário do funcionário: ");
                                    double salario = sc.nextDouble();
                                    sc.nextLine(); // consumir a nova linha
                                    System.out.println("Qual o endereço do funcionário: ");
                                    String endereco = sc.nextLine();
                                    usuario = new Funcionario(nome, idade, sexo, telefone, cargo, salario, endereco);
                                    break;
                                case 2:
                                    System.out.println("Qual o grau acadêmico do professor: ");
                                    String grau = sc.nextLine();
                                    System.out.println("Qual a disciplina do professor: ");
                                    String disciplina = sc.nextLine();
                                    usuario = new Professor(nome, idade, sexo, telefone, disciplina, grau);
                                    break;
                                case 3:
                                    System.out.println("Qual a escola do estudante: ");
                                    String inst = sc.nextLine();
                                    System.out.println("Qual a matrícula do estudante: ");
                                    String matricula = sc.nextLine();
                                    usuario = new Estudante(nome, idade, sexo, telefone, inst, matricula);
                                    break;
                                default:
                                    System.out.println("Tipo de usuário inválido.");
                                    break;
                            }

                            if (usuario != null) {
                                usuarios.add(usuario);
                                usuarioDAO.gravar(usuario);
                                saveToFile(USUARIOS_FILE, usuarios);
                            }
                            break;
                        case 2:
                            System.out.println("Excluir usuário");
                            System.out.println("Informe o ID do usuário a ser excluído: ");
                            int idExcluir = sc.nextInt();
                            sc.nextLine();
                            Usuarios usuarioExcluir = usuarioDAO.ler(idExcluir);
                            if (usuarioExcluir != null) {
                                usuarioDAO.excluir(usuarioExcluir);
                                usuarios.remove(usuarioExcluir);
                                saveToFile(USUARIOS_FILE, usuarios);
                                System.out.println("Usuário excluído com sucesso.");
                            } else {
                                System.out.println("Usuário não encontrado.");
                            }
                            break;
                        case 3:
                            System.out.println("Atualizar usuário");
                            System.out.println("Informe o ID do usuário a ser atualizado: ");
                            int idAtualizar = sc.nextInt();
                            sc.nextLine();
                            Usuarios usuarioAtualizar = usuarioDAO.ler(idAtualizar);
                            if (usuarioAtualizar != null) {
                                System.out.println("Informe os novos dados do usuário.");
                                System.out.println("Nome: ");
                                usuarioAtualizar.setNome(sc.nextLine());
                                System.out.println("Idade: ");
                                usuarioAtualizar.setIdade(sc.nextInt());
                                sc.nextLine();
                                System.out.println("Sexo: ");
                                usuarioAtualizar.setSexo(sc.nextLine());
                                System.out.println("Telefone: ");
                                usuarioAtualizar.setTelefone(sc.nextLine());
                                usuarioDAO.atualizar(usuarioAtualizar);
                                saveToFile(USUARIOS_FILE, usuarios);
                                System.out.println("Usuário atualizado com sucesso.");
                            } else {
                                System.out.println("Usuário não encontrado.");
                            }
                            break;
                        case 4:
                            System.out.println("Ler usuário");
                            System.out.println("Informe o ID do usuário a ser lido: ");
                            int idLer = sc.nextInt();
                            sc.nextLine();
                            Usuarios usuarioLer = usuarioDAO.ler(idLer);
                            if (usuarioLer != null) {
                                System.out.println("Dados do usuário:");
                                System.out.println("Nome: " + usuarioLer.getNome());
                                System.out.println("Idade: " + usuarioLer.getIdade());
                                System.out.println("Sexo: " + usuarioLer.getSexo());
                                System.out.println("Telefone: " + usuarioLer.getTelefone());
                            } else {
                                System.out.println("Usuário não encontrado.");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
>>>>>>> a004c8d082749f70ac2cbcfbed27c1cfb5dd62f4
                    break;

                case 3:
                    System.out.println("Opção 3 selecionada: Realizar empréstimo");
                    System.out.println("Data do emprestimo: ");
                    String dataEmprestimo = sc.nextLine();
                    System.out.println("Hora do emprestimo: ");
                    String horaEmprestimo = sc.nextLine();
                    System.out.println("Nome do livro: ");
                    String tituloLivro = sc.nextLine();
                    Livro livroselecionado = new Livro(null,null,null,null);
                    for (Livro l : livros){
                        if (tituloLivro.equals(l.getTitulo())){
                            livroselecionado = l;
                        }
                    }
                    System.out.println("Nome do usuário: ");
                    String nomeUsuario = sc.nextLine();
<<<<<<< HEAD
                    Usuarios usuarioselecionado = new Usuarios();
                    for (Usuarios u : usuarios){
                        if(nomeUsuario.equals(u.getNome())){
                            usuarioselecionado = u;
=======
                    Usuarios usuarioSelecionado = null;
                    for (Usuarios u : usuarios) {
                        if (nomeUsuario.equals(u.getNome())) {
                            usuarioSelecionado = u;
                            break;
>>>>>>> a004c8d082749f70ac2cbcfbed27c1cfb5dd62f4
                        }
                    }
                    Emprestimos emprestimo = new Emprestimos(dataEmprestimo, horaEmprestimo, livroselecionado, usuarioselecionado);
                    emprestimos.add(emprestimo);
                    
                    break;

                case 4:
                    System.out.println("Opção 4 selecionada: Realizar devolução");
                    System.out.println("Nome do Livro que queria fazer devolução: ");
                    tituloLivro = sc.nextLine();
                    System.out.println("Nome da pessoa que pegou emprestado: ");
                    nomeUsuario = sc.nextLine();
                    Emprestimos emprestimosselecionado = new Emprestimos(null, null, null, null);
                    Livro livroDevolvido = new Livro(null, null, null, null);
                    for(Emprestimos e : emprestimos){
                        if (tituloLivro.equals(e.getLivros().getTitulo()) && nomeUsuario.equals(e.getUsuarios().getNome())){
                            emprestimosselecionado = e;
                            livroDevolvido = e.getLivros();
                        }
                    }
                    emprestimosselecionado.devolverLivro(livroDevolvido);
                    emprestimos.remove(emprestimosselecionado);
                    break;

                case 5:
                    System.out.println("Opção 5 selecionada: Listar todos os empréstimos");
                    for(Emprestimos e : emprestimos){
                        System.out.println("Livro: " + e.getLivros().getTitulo());
                    }
                    break;

                case 6:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
    }
}
