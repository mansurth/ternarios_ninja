package exercicios;

import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o numero inicial: ");
        int inicial = sc.nextInt();

        System.out.println("Digite o numero final: ");
        int fin = sc.nextInt();

        for (; inicial <= fin; inicial++) { //; no começo de tudo pois precisa manter a estrutura de inicio/condicao/alteracao
            System.out.println(inicial);

        }
        sc.close();
    }

}
