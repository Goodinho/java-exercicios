package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe a nota: ");
        double nota = entrada.nextDouble();

     //   String resultado = nota >= 60? "Aprovado": nota >= 45? "Recuperação": "Reprovado";
       // System.out.println(resultado);

        if (nota >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

        if (nota < 7 && nota >= 4.5)
            System.out.println("Recuperação");

            boolean criterioReprovacaoAtingido = nota < 4.5 && nota >= 0;
            if (criterioReprovacaoAtingido){
                System.out.println("Reprovado");
        }
        entrada.close();
    }
}
