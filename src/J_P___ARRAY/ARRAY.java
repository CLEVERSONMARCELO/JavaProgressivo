package J_P___ARRAY;

public class ARRAY {

    public static void main(String[] args) {

        int[] gaveta;//tipo de variável/informa que a variável será um array/nome da variável

        gaveta = new int[10];//instância um novo objeto/informa o tipo de objeto/informa a quant de posições do array

        for (int i = 0; i < 10; i++) {

            gaveta[i] += i;
        }

        System.out.println(gaveta[5]);//imprime o valor guardado na posição "6"

        int[] armario = {0, 0, 0};

        for (int i = 0; i < 3; i++) {

            armario[i] += i;

            System.out.println(armario[i]); //imprime os valores armazenados em armário
        }
        System.out.println(armario[2]); //imprime o valor guardado na posição "3"
    }
}
