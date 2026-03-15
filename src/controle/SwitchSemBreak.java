package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

    String faixa = "Marrom";

    switch (faixa.toLowerCase()){

        case "preta":
            System.out.println("Sabe o Bassai-Dai...");
        case "marrom":
            System.out.println("Sabe o Tekki Shodan");
        case "roxa":
            System.out.println("Sabe o Heian Godan");
        case "verde":
            System.out.println("Sabe o Heian Yodan");
        case "laranja":
            System.out.println("Sei o Heian Sandan");
        case "vermelha":
            System.out.println("Sei o Heian Nidan");
        case "amarela":
            System.out.println("Sei o Heian Shodan");
            break;
        default:
            System.out.println("Não sei nada");

    }
    }
}
