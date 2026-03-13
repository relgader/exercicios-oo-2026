package com.mycompany.pessoa;

class Pessoa{
    private String nome;
    private int idade;
    private char sexo;
    
    public Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.sexo = ' ';
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public  void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    class Main{
        public static void main(String[] args){
            Pessoa p1, p2;
            p1 = new Pessoa();
            p1.nome = "Carlos";
            p1.idade = 18;
            p1.sexo = 'M';
            
            p2 = new Pessoa();
            p2.nome = "Maria";
            p2.idade = 17;
            p2.sexo = 'F';
        }
    }
}