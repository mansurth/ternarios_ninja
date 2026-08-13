package exercicios;

import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiro = input.nextInt();

        System.out.println("Digite o limite: ");
        int limite = input.nextInt();

        for (int i = primeiro; i <= limite; i+= primeiro) {
            System.out.println(i);
        }
        input.close();
    }
}
