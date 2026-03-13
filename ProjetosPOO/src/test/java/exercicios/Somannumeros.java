package com.mycompany.somannumeros;

import java.util.Scanner;

public class Somannumeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        int soma = 0;
        System.out.print("Digite um número: ");
        n = ler.nextInt();
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                soma += i;
                
            }
        }
        System.out.println("A soma dos impares: " + soma);
    }
}
