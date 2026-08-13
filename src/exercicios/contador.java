package exercicios;

import java.util.Scanner;
public class contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ate qual numero deseja contar?: ");
        int num = sc.nextInt();

        for (int comeco = 1; comeco <= num; comeco++) {
            System.out.println(comeco);
        }
        sc.close();

    }
}
