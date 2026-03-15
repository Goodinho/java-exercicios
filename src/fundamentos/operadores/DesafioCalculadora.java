package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro operador: ");
        double num1 = entrada.nextDouble();

        System.out.print("Escolha um dos sinais *, /, -, +, %: ");
        String sinal = entrada.next();

        System.out.print("Segundo numero: ");
        double num2 = entrada.nextDouble();

        double escolha = sinal.equals("*") ? (num1 * num2)
                : sinal.equals("/") ? (num1 / num2)
                : sinal.equals("+") ? (num1 + num2): sinal.equals("%")? (num1 % num2):
                 (num1 - num2);

        System.out.println(escolha);
        entrada.close();
    }
}
