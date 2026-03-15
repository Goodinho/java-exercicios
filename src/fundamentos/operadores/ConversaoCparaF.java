package fundamentos.operadores;

import java.util.Scanner;

public class ConversaoCparaF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor a ser convertido: ");
        double c = entrada.nextDouble();

        double formula = (c * 9/5) + 32;

        System.out.println(formula);

        entrada.close();
    }
}
