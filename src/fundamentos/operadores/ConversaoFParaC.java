package fundamentos.operadores;

import java.util.Scanner;

public class ConversaoFParaC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor em Fahrenheit :");
        double f = entrada.nextDouble();

        double formula = (f - 32) * 5/9;

        System.out.println(formula);

        entrada.close();

    }
}
