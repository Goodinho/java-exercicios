package controle;

import java.util.Scanner;

public class RefatorandoSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        int valor = entrada.nextInt();

        int contador = 0;

        for (int i = 2; i < valor; i++){
            if (valor % i == 0){
                contador++;
            }
        }
        if (valor == 1 || valor == 0) {
            contador = 1;
        }

        switch (contador){
            case 0:
                System.out.println("Numero " + valor + " é primo");
                break;
            default:
                System.out.println("Numero " + valor + " não é primo");
        }
        entrada.close();
    }

}
