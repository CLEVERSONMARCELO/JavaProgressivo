package J_P___IF_ELSE;

import java.util.Scanner;

public class VerificaNotaAluno {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double nota;

        System.out.print("Nota: ");
        nota = Double.parseDouble(leitor.nextLine());

        if (nota > 7) {
            System.out.println("Passou direto! :) ");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Recuperação! :/ ");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Reprovado direto! :( ");
        } else {
            System.out.println("Nota difitada inválida!!!");
        }
    }
}
