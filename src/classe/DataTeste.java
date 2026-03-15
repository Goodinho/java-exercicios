package classe;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual dia: ");
        d1.dia = entrada.nextInt();
        System.out.print("Qual més: ");
        d1.mes = entrada.nextInt();
        System.out.print("Qual ano: ");
        d1.ano = entrada.nextInt();


        System.out.print(d1.obterDataFormatada());


    }
}
