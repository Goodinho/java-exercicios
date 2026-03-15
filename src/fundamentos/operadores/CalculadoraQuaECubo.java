package fundamentos.operadores;

import java.util.Scanner;

public class CalculadoraQuaECubo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor ao ser multiplicado:");
        double valor = entrada.nextDouble();

        double quadrado = Math.pow(valor, 2);
        // double quadrado = (valor * valor);

        double cubo = Math.pow(valor, 3);
        // double cubo = (cubo * cubo * cubo);

        System.out.printf(" %.0f ao quadrado é : %.0f", valor, quadrado);
        System.out.printf("\n %.0f ao cubo é : %.0f",valor, cubo);
    }
}
