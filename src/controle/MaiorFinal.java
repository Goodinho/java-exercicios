package controle;

import java.util.Scanner;

public class MaiorFinal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int aux = 0;

        for (int i = 0; i < 9 ; i++){
            System.out.print("Informe valores: ");
            int valor = entrada.nextInt();
            System.out.println(valor);

           if (valor > aux && valor > maior) {
               maior = valor;
           }
           aux = valor;

        }
        System.out.println("O maior é " + maior);
        entrada.close();
    }
}



