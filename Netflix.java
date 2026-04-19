
import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Bem vido a Netflix----");
        System.out.println("escolha a opção do pacote: ");
        int plano = sc.nextInt();

        switch (plano) {
            case 1:
                System.out.println(" 1 tela disponível.");
                break;

            case 2:
                System.out.println("2 telas disponiveis ");
                break;

            case 3:
                System.out.println("4 telas disponiveis");
                break;

            default:
                System.out.println("Codigo de palno invalido ");
                break;

        }

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        if (idade < 12) {
            System.out.println("Categoria: Infantil (Desenhos e Animações)");

        } else if (idade <= 17) {
            System.out.println("(Séries Teen e Aventura)");

        } else { 
            System.out.println("(Filmes de Ação e Documentários)");
        }
        System.out.println("Informe a sua nacionalidae: ");
        String nacionalidae = sc.next().toUpperCase();


        System.out.println("Destaque: assista agora produções originais "+ nacionalidae);

        sc.close();
    }
}
