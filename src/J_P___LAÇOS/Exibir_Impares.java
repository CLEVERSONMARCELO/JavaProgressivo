package J_P___LAÇOS;

public class Exibir_Impares {
//Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.   

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if ((i % 2) != 0) {

                System.out.println(i);

            }
        }
    }
}
