package fundamentos.operadores;

import java.util.Scanner;

public class CalcularTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor da base :");
        double base = entrada.nextDouble();

        System.out.print("Valor da altura");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área é : " + area);
    }
}
