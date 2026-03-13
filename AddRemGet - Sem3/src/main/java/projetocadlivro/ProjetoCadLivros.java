package projetocadlivro;

import java.util.Scanner;
import java.util.List;
import classes.cadLivro;
import java.util.ArrayList;

public class ProjetoCadLivros {

    public static int imprimeMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("1 - Inserir livro");
        System.out.println("2 - Remover livro");
        System.out.println("3 - Pesquisar livro (titulo)");
        System.out.println("4 - Pesquisar livro (autor)");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        List<cadLivro> listaLivros;
        listaLivros = new ArrayList<cadLivro>();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        
        do {
            opcao = imprimeMenu();
            if (opcao == 1) { //insercao
                cadLivro l1 = new cadLivro();
                l1.preencher();
                listaLivros.add(l1);
            } else if (opcao == 2) {//remocao
                System.out.println("Informe o titulo:");
                String title = leitor.nextLine();

                for (int i = 0; i <= listaLivros.size() - 1; i++) {
                    cadLivro li = listaLivros.get(i);
                    if (title.equals(li.getTitulo())) {
                        System.out.println("Livro encontrado");
                        listaLivros.remove(li);
                    }
                }                
            } else if (opcao == 3) {//pesquisa titulo
                System.out.println("Informe o titulo:");
                String title = leitor.nextLine();

                for (int i = 0; i <= listaLivros.size() - 1; i++) {
                    cadLivro li = listaLivros.get(i);
                    if (title.equals(li.getTitulo())) {
                        System.out.println("Livro encontrado");
                        li.imprimir();
                    }
                }                
            } else if (opcao == 4) { //pesquisa autor               
                System.out.println("Informe o autor:");
                String autor = leitor.nextLine();

                for (int i = 0; i <= listaLivros.size() - 1; i++) {
                    cadLivro li = listaLivros.get(i);
                    if (autor.equals(li.getAutor())) {
                        System.out.println("Autor encontrado");
                        li.imprimir();
                    }
                }
            }
        } while (opcao != 0);
    }
}
