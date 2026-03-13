package projetoCadFilme;
import classes.Filme;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
        
public class main {
   
    public static int imprimeMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("1 - Inserir filme");
        System.out.println("2 - Remover filme");
        System.out.println("3 - Pesquisar titulo");
        System.out.println("4 - Pesquisar autor");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Filme> listaF = new ArrayList<>();
        int opcao = 0;
        
        do{
            if(opcao == 1){
                Filme f1 = new Filme();
                f1.preencher();
                listaF.add(f1);
            }else if(opcao == 2){
                System.out.println("Digite o nome do titulo a ser removido: ");
                String title = ler.next();
                
                for(Filme f : listaF){
                    if(title.equals(f.getTitulo())){
                        System.out.println("Filme encontrado! ");
                        listaF.remove(f);
                    }
                }
            }else if(opcao == 3){
                System.out.println("Digite o titulo a ser encontrado: ");
                String title = ler.next();
                
                for(Filme f : listaF){
                    if(title.equals(f.getTitulo())){
                      System.out.println("Filme encontrado! ");
                      f.toString();
                    }
                }
            }else if(opcao == 4){
            System.out.println("Digite o autor a ser escontrado: ");
            String author = ler.next();
            
            for(Filme f : listaF){
                if(author.equals(f.getAutor())){
                    System.out.println("Autor encontrado! ");
                    f.toString();
            }
        }
     }   
        }while(opcao != 0);
    }
}
