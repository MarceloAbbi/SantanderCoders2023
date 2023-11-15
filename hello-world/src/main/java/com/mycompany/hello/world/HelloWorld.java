/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hello.world;

/**
 *
 * @author marcelo abbi
 */
public class HelloWorld {

    public static void main(String[] args) {
        
        String nome = "Marcelo";
        System.out.println("Olá, " + nome);
        
        int a = 3;
        int b = 2;
        
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;
        
        System.out.println(soma);
        
        System.out.println(subtracao);
        
        System.out.println(multiplicacao);
        
        System.out.println(divisao);
        
        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        
        if(vamosAPraia){
            System.out.println("Vamos à Praia!");
        }else{
            System.out.println("Não vamos à Praia :( ");
        }
        
        //Tabela verdade: só pode ser verdadeiro se todos forem = true
    }
}
