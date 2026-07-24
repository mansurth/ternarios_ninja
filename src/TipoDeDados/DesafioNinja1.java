package TipoDeDados;

public class DesafioNinja1 {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 16;
        String missao = "Vigiar a aldeia";
        char Nivel = 'C';

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel: " + Nivel);

        if (idade >= 15) {
            if (Nivel == 'C' || Nivel == 'D') {
                String statusMissao = "Missão Concluida";
                System.out.println("Status da missão: " + statusMissao);
            } else {
                String statusMissao = "Missão Não Concluida";
                System.out.println("Status da missão: " + statusMissao);
            }
        }   else {
            System.out.println("O Ninja não tem idade o suficiente para concluir a missão");
        }
        /*ninja2*/
        String nomeNinja2 = "Sasuke Uchira";
        int idade2 = 15;
        String missao2 = "Entregar encomendas ao povo";
        char Nivel2 = 'A';

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Nivel: " + Nivel2);

        if (idade2 >= 15) {
            if (Nivel2 == 'C' || Nivel2 == 'D') {
                String statusMissao = "Missão Concluida";
                System.out.println("Status da missão: " + statusMissao);
            } else {
                String statusMissao = "Missão Não Concluida";
                System.out.println("Status da missão: " + statusMissao);
            }
        }   else {
            System.out.println("O Ninja não tem idade o suficiente para concluir a missão");
        }

        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 14;
        String missao3 = "Cuidar da academia";
        char Nivel3 = 'D';

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Nivel: " + Nivel3);

        if (idade3 >= 15) {
            if (Nivel3 == 'C' || Nivel3 == 'D') {
                String statusMissao = "Missão Concluida";
                System.out.println("Status da missão: " + statusMissao);
            } else {
                String statusMissao = "Missão Não Concluida";
                System.out.println("Status da missão: " + statusMissao);
            }
        }   else {
            System.out.println("O Ninja não tem idade o suficiente para concluir a missão");
        }
    }

}
