package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double total = 0;

        System.out.print("Quantas notas você quer informar? ");
        int qNota = entrada.nextInt();

        double[] notas = new double[qNota];

        for (int i = 0; i < qNota; i++){
            System.out.print( i+1  +  "° Nota: ");
            notas[i] = entrada.nextDouble();
        }

        for (double nota: notas){
            total += nota;
        }

        System.out.println("A média do aluno é: " + total/notas.length);

        entrada.close();
    }
}
