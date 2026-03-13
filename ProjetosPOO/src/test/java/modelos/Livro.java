package modelos;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private double preco;
    
    public Livro(){
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
        this.preco = 0.0;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Preencha os Dados do Livro: ");
        
        System.out.print("Nome do livro: ");
        this.titulo = ler.next();
        System.out.print("Nome do autor: ");
        this.autor = ler.next();
        System.out.print("Digite o número de páginas: ");
        this.numPaginas = ler.nextInt();
        System.out.print("Digite o preço do ivro: ");
        this.preco = ler.nextDouble();
    }
    
    public void imprimir(){
        System.out.print("Titulo: " + this.getTitulo() 
               + "Autor: " + this.getAutor()
               + "Páginas: " + this.getPaginas()
               + "Preço: " + this.getPreco());
    }
    
    public void copiar(Livro outro){
        this.titulo = outro.getTitulo();
        this.autor = outro.getAutor();
        this.numPaginas = outro.getPaginas();
        this.preco = outro.getPreco();
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
    public void setPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    public int getPaginas(){
        return this.numPaginas;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
}
