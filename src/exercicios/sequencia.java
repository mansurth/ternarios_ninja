package exercicios;

import java.util.Scanner;

public class sequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;

        System.out.print("Digite o número inicial: ");
        int numeroInicial = sc.nextInt();

        System.out.println("Digite o intervalo: ");
        int intervalo = sc.nextInt();

        System.out.println("Quantos numeros deseja mostrar?: ");
        int qtdNumeros = sc.nextInt();

        for (int resultado = numeroInicial; contador <= qtdNumeros; resultado+= intervalo) {
                contador++;
            System.out.println(resultado);
        }


        sc.close();
    }
}
