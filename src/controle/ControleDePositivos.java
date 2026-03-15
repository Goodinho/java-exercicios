package controle;

import java.util.Scanner;

public class ControleDePositivos {
    public static void main(String[] args) {
/*
        Scanner entrada = new Scanner(System.in);


        double valor = 0;
        double somatorio = 0;



        for (int i = 0; valor >= 0; i++){
             System.out.println("Informe o valor: ");
             valor = entrada.nextDouble();

              somatorio +=  valor;

             System.out.println("Valor somado: " + somatorio);
             if (valor < 0){
                 System.out.println("Numero errado! Saindo do programa!");
                 break;
          */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome um valor: ");
        int somatorio = entrada.nextInt();
        int valor = 0;

        while (valor >= 0 ) {
            System.out.print("Some um valor: ");
            valor = entrada.nextInt();
            somatorio += valor;
            System.out.println("Valor atual: " + somatorio);
        }
        entrada.close();
    }
}
