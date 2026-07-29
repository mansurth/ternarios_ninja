package TipoDeDados.Condicoes;

import java.util.Scanner;

public class ternarios {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        /*
        ternarios: maneiras de simplificar o codigo
        variavel = (condição) ? ValorSeVerdadeiro : ValorSeFalso;
         */

        System.out.println("1- Verificar se ninja pode subir de nivel ");
        System.out.println("2- Receber missao aleatoria ");
        System.out.println("3- Escolher missoes ");

        int escolha =  sc.nextInt();

        switch (escolha) {
            case 1:
                /*Verificar se ninja pode subir de nivel*/
                System.out.println("Quantas missoes o ninja tem? ");
                int missoes = sc.nextInt();
                System.out.println("O ninja possue " + missoes + " missoes, mas com quantos anos? ");
                int anos  = sc.nextInt();
                String VerificarNivel = (missoes >= 15 && anos >= 15) ? "O ninja ja pode subir de nivel" : "O ninja ainda nao pode subir de nivel";
                System.out.println(VerificarNivel);
                break;
            case 2:
                /*Receber missao aleatoria*/
                System.out.println("Para receber a sua missão informe a sua idade:  ");
                int idade = sc.nextInt();
                String resultado2 = (idade >= 15) ? "Sua missão é vigiar a aldeia pela noite." : "Sua Missão é entregar cartas pela aldeia";
                System.out.println(resultado2);
                break;
            case 3:
                /*Escolher missoes*/
                System.out.println("Missão 1: Cuidar da academia");
                System.out.println("Missão 2: Limpar academia ");
                System.out.println("Missão 3: Vigiar a aldeia");
                int interacao  = sc.nextInt();

                if (interacao == 1){
                    System.out.println("Sua missão é cuidar da academia. ");
                } else if (interacao == 2){
                    System.out.println("Sua missão é limpar a academia. ");
                } else if (interacao == 3){
                    System.out.println("Sua missão é vigiar a aldeia. ");
            } else {
                    System.out.println("Escolha uma das opções existentes. ");
                }
            default:
                System.out.println("Escolha uma das opções da lista. ");
        }

        sc.close();
    }
}
