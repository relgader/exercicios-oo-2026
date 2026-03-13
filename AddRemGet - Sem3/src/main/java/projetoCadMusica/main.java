package projetoCadMusica;
import classes.Musica;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class main {
    public static int imprimeMenu(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-------------------");
        System.out.println("1 - Adicionar nova música");
        System.out.println("2 - Remover música");
        System.out.println("3 - Pesquisar título ");
        System.out.println("4 - Pesquisar autor ");
        System.out.print("0 - Sair");
        System.out.println("-------------------");
        System.out.println("Escolha uma opção");
        
        return ler.nextInt();
    }
    
    public static void main(String[] args){
        List<Musica> listaMusicas;
        listaMusicas = new ArrayList<Musica>();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        
        do{
            if(opcao == 1){
                Musica m1 = new Musica();
                m1.preencher();
                listaMusicas.add(m1);
            }else if(opcao == 2){
                System.out.print("Informe o título: ");
                String title = leitor.nextLine();
                
                for(Musica m : listaMusicas){
                    if(title.equals(m.getTitulo())){
                        System.out.print("Musica encontrada!");
                        listaMusicas.remove(m);
                    }
                }
            }else if(opcao == 3){
                System.out.print("Digite o titulo a ser encontrado: ");
                String title = leitor.nextLine();
                
                for(Musica m : listaMusicas){
                    if(title.equals(m.getTitulo())){
                        System.out.print("Titulo encontrado! ");
                        m.toString();
                    }
                }
            }else if(opcao == 4) {
                System.out.print("Digite o autor a ser encontrado: ");
                String title = leitor.nextLine();
                
                for(Musica m : listaMusicas){
                    if(title.equals(m.getTitulo())){
                        System.out.print("Titulo encontrado! ");
                        m.toString();
                    }
                }
            }
        }while(opcao != 0);
    }
}
