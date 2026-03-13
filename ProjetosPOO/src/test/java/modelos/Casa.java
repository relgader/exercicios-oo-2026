package modelos;

import java.util.Scanner;

class Casa {

    private String endereco;
    private double area;
    private int num_quartos;
    private double preco;
    
    public Casa(){
        this.endereco = "";
        this.area = 0.0;
        this.num_quartos = 0;
        this.preco = 0.0;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("--------Preencha os dados da casa--------");
        
        System.out.print("Endereço: ");
        this.endereco = ler.next();
        System.out.print("Area: ");
        this.area = ler.nextDouble();
        System.out.print("Numero de quartos: ");
        this.num_quartos = ler.nextInt();
        System.out.print("Preço: ");
        this.preco = ler.nextDouble();
    }
    
    public void copiar(Casa outra){
        this.endereco = outra.getEndereco();
        this.area = outra.getArea();
        this.num_quartos = outra.getNumQuartos();
        this.preco = outra.getPreco();
    }
    
    @Override
    public String toString(){
        return "Casa (Endereço: " + this.endereco + ", Area: "+ this.area + ", Numero de quartos: "+ this.num_quartos +  ", Preço:  "+ this.preco + " )";
    }
    
    public double calcularValorM2(){
        double m2;
        
        m2 = this.getPreco() / this.getArea();
        
        return m2;
    }
    
    public void exibirResumo(){
       
        double valorM2 = calcularValorM2();
        
        System.out.print("Endereço:" +
                this.getEndereco() + "Area: " +
                this.getArea() + "Numero de quartos" +
                this.getNumQuartos() + "Preço: " + this.getPreco() +
                "Valor M: ²" + valorM2  );
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return this.area;
    }
    public void setNumQuartos(int num_quartos){
        this.num_quartos = num_quartos;
    }
    public int getNumQuartos(){
        return this.num_quartos;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
    
}
