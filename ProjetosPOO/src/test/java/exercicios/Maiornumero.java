package com.mycompany.maiornumero;

import java.util.Scanner;

public class Maiornumero {
//exercicio 1
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextInt();
        
        if(n1 > n2){
            System.out.println("O primeiro numero é maior.");
        }else if(n2 > n1){
            System.out.println("O segundo número é maior.");
        }else{
            System.out.println("Os números são iguais.");
        }
    }
}
