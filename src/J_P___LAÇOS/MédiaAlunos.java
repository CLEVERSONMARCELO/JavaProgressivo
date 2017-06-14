package J_P___LAÇOS;

import java.util.Scanner;

public class MédiaAlunos {

    /*Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço while, 
pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
Por fim, o programa mostra a média, aritmética, da turma.*/
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int alunos = Integer.parseInt(leitor.nextLine());
        System.out.println(" ");
        
        int i = 1;
        double notaAluno, SomaNotas =0, media;
        
        while (i <= alunos) {
            System.out.printf("Digite a nota do %dº aluno: ", i);
            notaAluno = Double.parseDouble(leitor.nextLine());
            SomaNotas += notaAluno;
            
            i++;
        }
        media = SomaNotas /alunos;
        
        System.out.println(" ");
        System.out.printf("A média dos %d alunos da turma é %.2f ",alunos,media);
    }
}
