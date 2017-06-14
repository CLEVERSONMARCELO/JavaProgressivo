package J_P___IF_ELSE;

import java.util.Scanner;

public class VerficaNumeroMaiorMenor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int valor, maior = 0, menor = 10000;

        for (int i = 1; i <= 3; i++) {

            System.out.print(i + "º Valor: ");
            valor = Integer.parseInt(leitor.nextLine());

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.println("O maior valor digitado é: " + maior);
        System.out.println("O menor valor digitado é: " + menor);
    }
}
