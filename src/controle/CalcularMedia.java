package controle;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.printf("%d° nota: ", i);
            double nota = entrada.nextDouble();

            soma += nota;
            media = soma / 2;

        }
        System.out.println("A media é: " + media);


    }

}
