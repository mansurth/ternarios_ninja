package exercicios;

import java.util.Scanner;

public class multiplos_fixo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite o primeiro valor: ");
        int primeiro = sc.nextInt();

        System.out.println("Quantos numeros deseja mostrar?: ");
        int Vlimit= sc.nextInt();

        for (int resultado = primeiro; contador <= Vlimit; resultado+= primeiro) {
            contador++;
            System.out.println(resultado);
        }


        sc.close();
    }
}
