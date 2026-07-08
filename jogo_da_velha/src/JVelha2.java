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
            int linha = (jogada - 1) / 3;
            int coluna = (jogada - 1) % 3;
            if (tabuleiro[linha][coluna] != '✘' &&
                    tabuleiro[linha][coluna] != '✷') {

                tabuleiro[linha][coluna] = jogadorAtual;
            }
            else {
                System.out.println("Casa ocupada!");
            }
//---------------------------------------------------------------------------------------------------
            java.util.Random gerador = new java.util.Random();
            int jogadaComputador = gerador.nextInt(9) + 1;
            System.out.println("O computador escolheu a posição: " + jogadaComputador);
            linha = (jogadaComputador - 1) / 3;
            coluna = (jogadaComputador - 1) % 3;
            if (tabuleiro[linha][coluna] != '✘' &&
                    tabuleiro[linha][coluna] != '✷') {

                tabuleiro[linha][coluna] = jogadorIA;
            }
            else {
                System.out.println("Casa ocupada, IA!");
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
            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][0] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
                //x..
                //x..
                //x..
                System.out.println("o Jogador venceu!");
                break;
            }
            if (tabuleiro[0][1] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][1] == jogadorAtual) {
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


