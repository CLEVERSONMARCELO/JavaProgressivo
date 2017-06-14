package J_P___IF_ELSE;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int valor;

        System.out.print("Valor: ");
        valor = Integer.parseInt(leitor.nextLine());

        if ((valor % 2) == 0) {

            System.out.println("-- Valor digitado é par --");
        } else if (valor != 0) {
            System.out.println("-- Valor digitado é impar --");
        }
    }
}
