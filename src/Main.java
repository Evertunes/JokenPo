import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int v1,v2;

        System.out.println("Escolha entre 0, 1 e 2, sendo: ");
        System.out.println("Pedra = 0 ");
        System.out.println("Papel = 1 ");
        System.out.println("Tesoura = 2 ");

        System.out.println("Jogador 1: ");
        v1 = sc.nextInt();

        Random aleatorio = new Random();
        v2 = aleatorio.nextInt(2);
        System.out.println("Jogador 2: " + v2);

        switch (v1){
            case 0:
                switch (v2){
                    case 0:
                        System.out.println("Empate");
                        break;
                    case 1:
                        System.out.println("Jogador 2 ganhou");
                        break;
                    case 2:
                        System.out.println("Jogador 1 ganhou");
                        break;
                    default:
                        System.out.println ("Entrada inválida!");
                } break;
            case 1:
                switch(v2) {
                    case 0:
                        System.out.println("Jogador 1 ganhou");
                        break;
                    case 1:
                        System.out.println(" Empatou");
                        break;
                    case 2:
                        System.out.println("Jogador 2 ganhou");
                        break;
                    default:
                        System.out.println ("Entrada inválida!");
                } break;
            case 2:
                switch(v2) {
                    case 0:
                        System.out.println("Jogador 2 ganhou");
                        break;
                    case 1:
                        System.out.println("Jogador 1 ganhou");
                        break;
                    case 2:
                        System.out.println("Empate");
                        break;
                    default:
                        System.out.println ("Entrada inválida!");
                } break;
            default:
                System.out.println ("Entrada inválida!");
        }
    }


    }