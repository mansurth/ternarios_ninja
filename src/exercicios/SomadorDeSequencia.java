package exercicios;

import java.util.Scanner;

public class SomadorDeSequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador =1;
        int soma = 0;

        System.out.println("Digite o numero inicial: ");
        int numeroInicial = sc.nextInt();

        System.out.println("Digite o numero final: ");
        int numeroFinal = sc.nextInt();

        System.out.println("Digite o intervalo: ");
        int intervalo = sc.nextInt();

        for (int result = numeroInicial; result <= numeroFinal; result += intervalo) {
            contador++;
            System.out.println(result);
            soma += result;
        }
        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
