package exercicios;

import java.util.Scanner;

public class XaX {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o numero inicial: ");
        int inicial = sc.nextInt();

        System.out.println("Digite o numero final: ");
        int fin = sc.nextInt();

        System.out.println("Qual o intervalo entre os numeros voce deseja?: ");
        int intervalo = sc.nextInt();

        for (; inicial <= fin; inicial+= intervalo) {
            System.out.println(inicial);
        }
        sc.close();

    }

}
