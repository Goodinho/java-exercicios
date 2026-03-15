package fundamentos.operadores;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc =   peso / Math.pow(altura,2);

        System.out.printf("Seu imc é %.2f", imc);
        entrada.close();
    }
}
