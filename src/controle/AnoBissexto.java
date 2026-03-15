package controle;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos dias tem o ano: ");
        int ano = entrada.nextInt();

        if (ano == 366){
            System.out.println("É um ano Bissexto");
        } else if (ano == 365) {
            System.out.println("É um ano normal");
        } else
            System.out.println("Em que mundo você vive?");

    }

}
