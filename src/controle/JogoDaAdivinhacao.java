package controle;


import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int aleatorio =  (int) (Math.random() * 101);


        System.out.print("Informe sua tentativa: ");
        int tentativa = entrada.nextInt();

        for (int i = 9; tentativa != aleatorio  ; i--){
            if (i < 0){
                System.out.println("Você esgotou as suas tentativas!");
                System.out.println("Saindo do programa!");
                break;
            }
            if (tentativa > aleatorio){
                System.out.println("Você errou! o valor é menor que " + tentativa + ". Tentativas restantes: " + i);

            } else if (tentativa < aleatorio) {
                System.out.println("Você errou! o valor é maior que " + tentativa + ". Tentativas restantes: " + i);

            }
            System.out.println("Informe outra tentativa");
            tentativa = entrada.nextInt();
            }

        if (tentativa == aleatorio) {
            System.out.println("Você acertou " + tentativa + " é o valor certo!");
        }
    }
}
