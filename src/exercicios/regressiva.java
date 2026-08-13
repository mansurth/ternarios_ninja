package exercicios;

import java.util.Scanner;

public class regressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero inicial: ");
        int inicialF = sc.nextInt();

        System.out.println("Digite o numero final: ");
        int finalI = sc.nextInt();

        System.out.println("Digite o intervalo: ");
        int intervalo = sc.nextInt();

        for (; finalI <= inicialF; inicialF-= intervalo) {
//1 verifica se o numero final é menor ou igual ao incial
//2 se sim, executa o codigo dentro do for e depois subtrai do numero inicial o intervalo escolhido
//3 em seguida essa condição se repete ate o numero inicial subtrair chegando no numero final
            System.out.println(inicialF);
        }
        sc.close();
    }
}
