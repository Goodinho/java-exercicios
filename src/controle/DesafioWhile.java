package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double exit = 0;
        int contador = 0;
        double nota;
        double total = 0;
        double media;

        while (exit != -1) {
            System.out.print((contador +1)  + " Nota do aluno: ");
            nota = entrada.nextInt();
            if (nota == -1)break;

            if (nota <= 10 && nota >= 0) {
                contador+= 1;
                total = total + nota;

            } else if (nota != -1)
                System.out.println("Imprima uma nota válida");


            exit = nota;
        }
        media =  total/contador;
        System.out.println("A média da turma é " + media);


        entrada.close();
    }
}
