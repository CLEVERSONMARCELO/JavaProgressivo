package J_P___IF_ELSE;

import java.util.Scanner;

import java.util.Random;

/*Para gerar um número aleatório na variável inteiro 'num_aleatorio', adicione no seu programa:
import java.util.Random;
Para gerar números aleatórios, crie um tipo Random 'randomGenerator':
Random randomGenerator = new Random();
E declare a variável para receber o número aleatório assim:
num_aleatorio = randomGenerator.nextInt(10) + 1;
*/
public class Sorteiro_Adivinha {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner leitor = new Scanner(System.in);

        int numero, NumSorteio, tentativa = 0, i = 1;;
        boolean valido = false;
        
        do{
        
        do{
        
        System.out.print("Número: ");
        numero = Integer.parseInt(leitor.nextLine());

        NumSorteio = random.nextInt(3) + 1;
        
        if (numero == NumSorteio) {
            
            tentativa += 1;
            System.out.println("Tentativa "+ tentativa);
            
            System.out.println("Sorteio: " + NumSorteio);
            System.out.println("Número escolhido: " + numero);
            System.out.println("Você acetou!!!");
            valido = false;
            i = 4;
            break;
            
        }else {
            tentativa += 1;
            System.out.println("Tentativa "+ tentativa);
            
            System.err.println("Sorteio: " + NumSorteio);
            System.err.println("Número escolhido: " + numero);
            System.err.println("Você ERROU!!!  :/");
            System.err.println("TENTE NOVAMENTE");
            valido = true;
            i++;
            
            break;
        }
        }while (valido == true);
        
        }while (i <=3);
    }
}
