package Array;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunos = new double[4];
        notasAlunos[0] = 7.9;
        notasAlunos[1] = 89;
        notasAlunos[2] = 9.9;
        notasAlunos[3] = 1.0;

        System.out.println(Arrays.toString(notasAlunos));
        System.out.println(notasAlunos[notasAlunos.length - 1]); // pegar o ultimo indice do array

        double total = 0;
        for (int i = 0 ; i < notasAlunos.length; i++) {
            total += notasAlunos[i];

            System.out.println(total / notasAlunos.length);
        }
        double notaArmazenada = 5;
        double[] notasAlunosB = {3, notaArmazenada, 6, 7, 5};
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunosB.length; i++){
                totalAlunoB += notasAlunosB[i];
        }
            System.out.println(totalAlunoB / notasAlunosB.length);
    }
}
