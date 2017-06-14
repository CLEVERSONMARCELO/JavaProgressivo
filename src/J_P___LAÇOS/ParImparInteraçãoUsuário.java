package J_P___LAÇOS;

import java.util.Scanner;
/*Escreva um aplicativo em Java que recebe inteiro e mostra os números pares 
e ímpares (separados), de 1 até esse inteiro.*/
public class ParImparInteraçãoUsuário {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        boolean continuar = false;

        do {

            System.out.print("QUANTIDADE: ");
            int numero = Integer.parseInt(leitor.nextLine());
            System.out.println(" ");
            if (numero > 1) {

                System.out.println("---PAR---");
                for (int i = 1; i < numero; i++) {

                    if ((i % 2) == 0) {
                        System.out.println(i);
                        
                    }
                }
                System.out.println("---IMPAR---");
                for (int i = 1; i < numero; i++) {

                    if ((i % 2) != 0) {
                        System.out.println(i);
                    }
                }
                break;
            } else {
                System.err.println("-- Número inválido --");
                System.err.println("-- Tente novamente --");
                continuar = true;
            }
        } while (continuar == true);
    }
}
