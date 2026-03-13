package classes;
import java.util.Scanner;


public class Filme{
    private String titulo;
    private String autor;
    private double duracao;
    private double preco;
    
    public Filme(){
        this.titulo = "";
        this.autor = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Preencha os dados do filme: ");
        
        System.out.print("Digite o título do filme: ");
        this.titulo = ler.next();
        System.out.print("Digite o nome do autor: ");
        this.autor = ler.next();
        System.out.print("Digite o tempo de duração: ");
        this.duracao = ler.nextDouble();
        System.out.print("Digite o preço do filme: ");
        this.preco = ler.nextDouble();
    
}
    public void copiar(Musica outra){
        this.titulo = outra.getTitulo();
        this.autor = outra.getAutor();
        this.duracao = outra.getDuracao();
        this.preco = outra.getPreco();
    }
    
    @Override
    public String toString(){
        return "Filme (Titulo:  " + this.titulo 
                + ", Autor: " + this.autor 
                + ",  Duração: " + this.duracao 
                + ", Preço: " + this.preco + ")";
    }
            
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public String getTitulo(){
            return this.titulo;
        }
        
        public void setAutor(String autor){
            this.autor = autor;
        }
        public String getAutor(){
            return this.autor;
        }
        
        public void setDuracao(double duracao){
            this.duracao = duracao;
        }
        public double getDuracao(){
            return this.duracao;
        }
        
        public void setPreco(double preco){
            this.preco = preco;
        }
        public double getPreco(){
            return this.preco;
        }
        
}


        



