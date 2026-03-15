package controle;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número da semana: ");
        byte num = entrada.nextByte();

        if (num == 1) {
            System.out.println("Domingo");
        } else if (num == 2) {
            System.out.println("Segunda-Feira");
        } else if (num == 3) {
            System.out.println("Terça-Feira");
        } else if (num == 4) {
            System.out.println("Quarta-Feira");
        } else if (num == 5) {
            System.out.println("Quinta-Feira");
        } else if (num == 6) {
            System.out.println("Sexta-Feira");
        } else if (num == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Dia ínvalido");
        }
            entrada.close();
    }
}
