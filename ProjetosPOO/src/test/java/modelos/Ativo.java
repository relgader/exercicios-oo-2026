package modelos;

import java.util.Scanner;

class Ativo {
    private String nome_empresa;
    private double precoAcao;
    private double qtdAcoes;
    private double varDiaria;
    
    
    public Ativo(){
        this.nome_empresa = "";
        this.precoAcao = 0.0;
        this.qtdAcoes = 0.0;
        this.varDiaria = 0.0;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in); 
    
        System.out.println("Preencha os Dados:");
        System.out.print("Digite o nome da empresa: ");
        this.nome_empresa = ler.next();
        System.out.print("Digite o preço da ação: ");
        this.precoAcao = ler.nextDouble();
        System.out.print("Digite a quantidade de ações: " );
        this.qtdAcoes = ler.nextDouble();
        System.out.print("Digite a  da variação diaria: ");
        this.varDiaria = ler.nextDouble();
}
    
    public void copiar(Ativo outra){
        this.nome_empresa = outra.getNomeEmpresa();
        this.precoAcao = outra.getPreco();
        this.qtdAcoes = outra.getQtdAcoes();
        this.varDiaria = outra.getVarDia();
    }
    
    public void imprimir(){
        
        System.out.print("Nome da empresa: " + this.nome_empresa);
        System.out.print("Preço da ação: " + this.precoAcao);
        System.out.print("Quantidade de ações: "+ this.qtdAcoes);
        System.out.print("Variação diária: " + this.varDiaria);
    }
    
    public double calcPosAtivo(){
        double calc;
        
        calc = this.getPreco() * this.getQtdAcoes();
        
        return calc;
    }
    
    public void exibirResumo(){
        double func = calcPosAtivo();
        
        System.out.print("Nome da empresa: " + this.getNomeEmpresa());
        System.out.print("Preço da ação: " + this.getPreco());
        System.out.print("Quantidade de ações: "+ this.getQtdAcoes());
        System.out.print("Variação diária: " + this.getVarDia());
        System.out.print("Posição do ativo: " + func);
    }
        public void setNomeEmpresa(String nome_empresa){
            this.nome_empresa = nome_empresa; 
        }
        public String getNomeEmpresa(){
            return this.nome_empresa;
        }
        public void setPreco(double precoAcao){
            this.precoAcao = precoAcao;
        }
        public double getPreco(){
            return this.precoAcao;
        }
        public void setQtdAcoes(double qtdAcoes){
            this.qtdAcoes = qtdAcoes;
        }
        public double getQtdAcoes(){
            return this.qtdAcoes;
        }
        public void setVarDia(double varDiaria){
            this.varDiaria = varDiaria;
        }
        public double getVarDia(){
            return this.varDiaria;
        }
}
