import java.util.Random;
import java.util.Scanner;

public class JVelha {
    public static void main(String[] args) {



        char[][] tabuleiro = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        Scanner teclado = new Scanner(System.in);
        char jogadorAtual = 'X';

        while (true) {
            System.out.println("\n");
            System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
            System.out.println("-------------------------\n");

            System.out.print("Turno do [" + jogadorAtual + "] - Escolha uma posição livre (1 a 9): ");
            int jogada = teclado.nextInt();
            boolean jogadaValida = false;

            if (jogada == 1) {
                if (tabuleiro[0][0] == '1') {
                    tabuleiro[0][0] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 2) {
                if (tabuleiro[0][1] == '2') {
                    tabuleiro[0][1] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 3) {
                if (tabuleiro[0][2] == '3') {
                    tabuleiro[0][2] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 4) {
                if (tabuleiro[1][0] == '4') {
                    tabuleiro[1][0] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 5) {
                if (tabuleiro[1][1] == '5') {
                    tabuleiro[1][1] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 6) {
                if (tabuleiro[1][2] == '6') {
                    tabuleiro[1][2] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 7) {
                if (tabuleiro[2][0] == '7') {
                    tabuleiro[2][0] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 8) {
                if (tabuleiro[2][1] == '8') {
                    tabuleiro[2][1] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }
            if (jogada == 9) {
                if (tabuleiro[2][2] == '9') {
                    tabuleiro[2][2] = jogadorAtual;
                    System.out.println("Você escolheu a posição: " + jogada);
                    jogadaValida = true;
                } else {
                    System.out.println("Ocupado!");
                }
            }

                    java.util.Random gerador = new java.util.Random();
                    int jogadaComputador = gerador.nextInt(9) + 1;
                    System.out.println("O computador escolheu a posição: " + jogadaComputador);
                    if (jogadaComputador == 1) {

                        if (tabuleiro[0][0] == '1') {
                            tabuleiro[0][0] = O;
                            System.out.println("A IA escolheu a posição: " + jogada);
                            jogadaValida = true;
                        } else {
                            System.out.println("Ocupado!");
                        }

                    }

            if (jogadaValida) {
                if (verificarGanhador(tabuleiro)) {
                    System.out.println(" FIM DE JOGO! O JOGADOR [" + jogadorAtual + "] VENCEU!");

                    System.out.print("\n");
                    System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                    System.out.println("-----------");
                    System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                    System.out.println("-----------");
                    System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");

                    break;
                }



            }

            public static boolean verificarGanhador(char[][] tabuleiro) {
                for (int i = 0; i < 3; i++) {
                    if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                        return true;
                    }
                }
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]) {
                        return true;
                    }
                }
                if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
                    return true;
                }
                if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
                    return true;
                }
                return false;
            }

                }
            }


        }
        teclado.close();
    }

}
