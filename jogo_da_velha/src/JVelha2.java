import java.util.Random;
import java.util.Scanner;

public class JVelha2 {
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        Scanner teclado = new Scanner(System.in);
        char jogadorAtual = '✘';
        char jogadorIA = '✷';
        //boolean CS1 = false;
        //boolean CS2 = false;
        //boolean CS3 = false;
        //boolean CS4 = false;
        //boolean CS5 = false;
        //boolean CS6 = false;
        //boolean CS7 = false;
        //boolean CS8 = false;
        //boolean CS9 = false;
        //boolean xCS1 = false;
        //boolean xCS2 = false;
        //boolean xCS3 = false;
        //boolean xCS4 = false;
        //boolean xCS5 = false;
        //boolean xCS6 = false;
        //boolean xCS7 = false;
        //boolean xCS8 = false;
        //boolean xCS9 = false;
        while (true) {
            //---------------------------------------------------------------------------------------------------------
            System.out.println("\n");
            System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
            System.out.println("-------------------------\n");
            System.out.print("Turno do [" + jogadorAtual + "] - Escolha uma posição livre (1 a 9): ");
            int jogada = teclado.nextInt();
            if (jogada == 1) {
                if (tabuleiro[0][0] == '1') {
                    tabuleiro[0][0] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS1 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 2) {
                if (tabuleiro[0][1] == '2') {
                    tabuleiro[0][1] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS2 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 3) {
                if (tabuleiro[0][2] == '3') {
                    tabuleiro[0][2] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS3 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 4) {
                if (tabuleiro[1][0] == '4') {
                    tabuleiro[1][0] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS4 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 5) {
                if (tabuleiro[1][1] == '5') {
                    tabuleiro[1][1] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS5 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 6) {
                if (tabuleiro[1][2] == '6') {
                    tabuleiro[1][2] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS6 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 7) {
                if (tabuleiro[2][0] == '7') {
                    tabuleiro[2][0] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS7 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 8) {
                if (tabuleiro[2][1] == '8') {
                    tabuleiro[2][1] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS8 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            else if (jogada == 9) {
                if (tabuleiro[2][2] == '9') {
                    tabuleiro[2][2] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    //CS9 = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
//---------------------------------------------------------------------------------------------------
            java.util.Random gerador = new java.util.Random();
            int jogadaComputador = gerador.nextInt(9) + 1;
            System.out.println("O computador escolheu a posição: " + jogadaComputador);
            if (jogadaComputador == 1) {
                if (tabuleiro[0][0] == '1') {
                    tabuleiro[0][0] = jogadorIA;
                    //xCS1 = true;
                }
            }
            else if (jogadaComputador == 2) {
                if (tabuleiro[0][1] == '2') {
                    tabuleiro[0][1] = jogadorIA;
                    //xCS2 = true;
                }
            }
            else if (jogadaComputador == 3) {
                if (tabuleiro[0][2] == '3') {
                    tabuleiro[0][2] = jogadorIA;
                    //xCS3 = true;
                }
            }
            else if (jogadaComputador == 4) {
                if (tabuleiro[1][0] == '4') {
                    tabuleiro[1][0] = jogadorIA;
                    //xCS4 = true;
                }
            }
            else if (jogadaComputador == 5) {
                if (tabuleiro[1][1] == '5') {
                    tabuleiro[1][1] = jogadorIA;
                    //xCS5 = true;
                }
            }
            else if (jogadaComputador == 6) {
                if (tabuleiro[1][2] == '6') {
                    tabuleiro[1][2] = jogadorIA;
                    //xCS6 = true;
                }
            }
            else if (jogadaComputador == 7) {
                if (tabuleiro[2][0] == '7') {
                    tabuleiro[2][0] = jogadorIA;
                    //xCS7 = true;
                }
            }
            else if (jogadaComputador == 8) {
                if (tabuleiro[2][1] == '8') {
                    tabuleiro[2][1] = jogadorIA;
                    //xCS8 = true;
                }
            }
            else if (jogadaComputador == 9) {
                if (tabuleiro[2][2] == '9') {
                    tabuleiro[2][2] = jogadorIA;
                    //xCS9 = true;
                }

            }
//-------------------------------------------------------------------------------------
            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[0][1] == jogadorAtual && tabuleiro[0][2] == jogadorAtual) {
            //xxx
            //...
            //...
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[1][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[1][2] == jogadorAtual) {
                //...
                //xxx
                //...
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[2][0] == jogadorAtual && tabuleiro[2][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
                //...
                //...
                //xxx
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[1][0] == jogadorAtual && tabuleiro[2][0] == jogadorAtual && tabuleiro[3][0] == jogadorAtual) {
                //x..
                //x..
                //x..
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[0][1] == jogadorAtual && tabuleiro[2][1] == jogadorAtual && tabuleiro[3][1] == jogadorAtual) {
                //.x.
                //.x.
                //.x.
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][2] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
                //..x
                //..x
                //..x
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
                //x..
                //.x.
                //..x
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
                //..x
                //.x.
                //x..
                System.out.println("o Jogador venceu!");
                break;
            }
//-------------------------------------------------------------------------------------
            if (tabuleiro[0][0] == jogadorIA && tabuleiro[0][1] == jogadorIA && tabuleiro[0][2] == jogadorIA) {
                //ooo
                //...
                //...
                System.out.println("a IA venceu!");
                break;
            }
            if (tabuleiro[1][0] == jogadorIA && tabuleiro[1][1] == jogadorIA && tabuleiro[1][2] == jogadorIA) {
                //...
                //ooo
                //...
                System.out.println("a IA venceu!");
                break;
            }
            if (tabuleiro[2][0] == jogadorIA && tabuleiro[2][1] == jogadorIA && tabuleiro[2][2] == jogadorIA) {
                //...
                //...
                //ooo
                System.out.println("a IA venceu!");
                break;
            }
            if (tabuleiro[1][0] == jogadorIA && tabuleiro[2][0] == jogadorIA && tabuleiro[3][0] == jogadorIA) {
                //o..
                //o..
                //o..
                System.out.println("a IA venceu!");
                break;
            }
            if (tabuleiro[0][1] == jogadorIA && tabuleiro[2][1] == jogadorIA && tabuleiro[3][1] == jogadorIA) {
                //.o.
                //.o.
                //.o.
                System.out.println("a IA venceu!");
                break;
            }
            if (tabuleiro[0][2] == jogadorIA && tabuleiro[1][2] == jogadorIA && tabuleiro[2][2] == jogadorIA) {
                //..o
                //..o
                //..o
                System.out.println("a IA venceu!");
                break;
            }
            if (tabuleiro[0][0] == jogadorIA && tabuleiro[1][1] == jogadorIA && tabuleiro[2][2] == jogadorIA) {
                //o..
                //.o.
                //..o
                System.out.println("a IA venceu!");
                break;
            }
            if (tabuleiro[0][2] == jogadorIA && tabuleiro[1][1] == jogadorIA && tabuleiro[2][0] == jogadorIA) {
                //..o
                //.o.
                //o..
                System.out.println("a IA venceu!");
                break;
            }
        }
    }
}


