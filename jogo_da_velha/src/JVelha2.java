import java.util.Scanner;
public class JVelha2 {
    //-------------------------------------CORZINHA-----------------------------------------------
    public static String cor(char c) {
        String RESET = "\u001B[0m";
        String VERMELHO = "\u001B[31m";
        String AZUL = "\u001B[34m";            //pedi pra ia me ensinar a colorir.
        if (c == '〇') return VERMELHO + c + RESET;
        if (c == '✘') return AZUL + c + RESET;
        return String.valueOf(c);
    }
    //-------------------------------------JOGO-----------------------------------------------
    public static void main(String[] args) {
        char[][] tabu = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        //  0  1  2
        //0 □  □  □
        //1 □  □  □
        //2 □  □  □
        Scanner teclado = new Scanner(System.in);
        char j_Atual = '✘';
        char j_IA = '〇';
        int roberto;
        int pqsim;
        int tentativas = 0;
        String VERMELHO = "\u001B[31m";
        String AZUL = "\u001B[34m";
        while (true) {

            if (tabu[0][0] != 1 && tabu[0][1] != 2 && tabu[0][2] != 3
            || tabu[1][0] != 4 && tabu[1][1] != 5 && tabu[1][2] != 6
            || tabu[2][0] != 7 && tabu[2][1] != 8 && tabu[2][2] != 9
            ) System.out.print("DEU VELHA!");

            // ------------------------------------MINHAS VITÓRIAS-------------------------------------
            if (tabu[0][0] == j_Atual && tabu[0][1] == j_Atual && tabu[0][2] == j_Atual
                    || tabu[1][0] == j_Atual && tabu[1][1] == j_Atual && tabu[1][2] == j_Atual
                    || tabu[2][0] == j_Atual && tabu[2][1] == j_Atual && tabu[2][2] == j_Atual
                    || tabu[0][0] == j_Atual && tabu[1][0] == j_Atual && tabu[2][0] == j_Atual
                    || tabu[0][1] == j_Atual && tabu[1][1] == j_Atual && tabu[2][1] == j_Atual
                    || tabu[0][2] == j_Atual && tabu[1][2] == j_Atual && tabu[2][2] == j_Atual
                    || tabu[0][0] == j_Atual && tabu[1][1] == j_Atual && tabu[2][2] == j_Atual
                    || tabu[0][2] == j_Atual && tabu[1][1] == j_Atual && tabu[2][0] == j_Atual) {
                System.out.println("o Jogador venceu!");
                break;
            }
            //-----------------------------------VITÓRIAS DA IA-------------------------------------
            if (tabu[0][0] == j_IA && tabu[0][1] == j_IA && tabu[0][2] == j_IA
                    || tabu[1][0] == j_IA && tabu[1][1] == j_IA && tabu[1][2] == j_IA
                    || tabu[2][0] == j_IA && tabu[2][1] == j_IA && tabu[2][2] == j_IA
                    || tabu[0][0] == j_IA && tabu[1][0] == j_IA && tabu[2][0] == j_IA
                    || tabu[0][1] == j_IA && tabu[1][1] == j_IA && tabu[2][1] == j_IA
                    || tabu[0][2] == j_IA && tabu[1][2] == j_IA && tabu[2][2] == j_IA
                    || tabu[0][0] == j_IA && tabu[1][1] == j_IA && tabu[2][2] == j_IA
                    || tabu[0][2] == j_IA && tabu[1][1] == j_IA && tabu[2][0] == j_IA) {
                System.out.println("O Roberto venceu!");
                break;
            }
            //-----------------------------MINHA JOGADA----------------------------------------------------------------
            roberto = 1;
            pqsim = 1;
            System.out.println("\n");
            System.out.print(" " + cor(tabu[0][0]) + " | " + cor(tabu[0][1]) + " | " + cor(tabu[0][2]) + "\n");
            System.out.println("-----------");
            System.out.print(" " + cor(tabu[1][0]) + " | " + cor(tabu[1][1]) + " | " + cor(tabu[1][2]) + "\n");
            System.out.println("-----------");
            System.out.print(" " + cor(tabu[2][0]) + " | " + cor(tabu[2][1]) + " | " + cor(tabu[2][2]) + "\n");
            System.out.println("-------------------------\n");
            System.out.print("Turno do [" + j_Atual + "] - Escolha uma posição livre (1 a 9): ");
            int jogada = teclado.nextInt();
            int linha = (jogada - 1) / 3;
            int coluna = (jogada - 1) % 3;
            if (tabu[linha][coluna] != '✘' &&
                    tabu[linha][coluna] != '〇') {

                tabu[linha][coluna] = j_Atual;
            } else {
                System.out.println("Casa ocupada!");
            }
                //-------------------------------------JOGADA DO ROBERTO-----------------------------
                //-------------------------------------ATAQUE E DEFESA-------------------------------
                while (roberto == 1) {
                //-------------------------------------ATAQUE----------------------------------------
                    if (tabu[0][2] == '3') {
                    if (tabu[0][0] == j_IA && tabu[0][1] == j_IA
                            || tabu[2][2] == j_IA && tabu[1][2] == j_IA
                            || tabu[2][0] == j_IA && tabu[1][1] == j_IA) {
                        tabu[0][2] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                    if (tabu[0][0] == '1') {
                    if (tabu[0][1] == j_IA && tabu[0][2] == j_IA
                            || tabu[1][0] == j_IA && tabu[2][0] == j_IA
                            || tabu[2][2] == j_IA && tabu[1][1] == j_IA) {
                        tabu[0][0] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                        if (tabu[2][0] == '7') {
                    if (tabu[0][0] == j_IA && tabu[1][0] == j_IA
                            || tabu[2][1] == j_IA && tabu[2][2] == j_IA
                            || tabu[0][2] == j_IA && tabu[1][1] == j_IA) {
                        tabu[2][0] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                            if (tabu[2][2] == '9') {
                    if (tabu[0][2] == j_IA && tabu[1][2] == j_IA
                            || tabu[2][0] == j_IA && tabu[2][1] == j_IA
                            || tabu[0][0] == j_IA && tabu[1][1] == j_IA) {
                        tabu[2][2] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                if (tabu[1][1] == '5') {
                    if (tabu[0][0] == j_IA && tabu[2][2] == j_IA
                            || tabu[2][0] == j_IA && tabu[0][2] == j_IA
                            || tabu[1][0] == j_IA && tabu[1][2] == j_IA
                            || tabu[0][1] == j_IA && tabu[2][1] == j_IA) {
                        tabu[1][1] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                    if (tabu[0][1] == '2') {
                    if (tabu[0][0] == j_IA && tabu[0][2] == j_IA
                            || tabu[2][1] == j_IA && tabu[1][1] == j_IA) {
                        tabu[0][1] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                        if (tabu[0][2] == '6') {
                    if (tabu[0][2] == j_IA && tabu[2][2] == j_IA
                            || tabu[1][0] == j_IA && tabu[1][1] == j_IA) {
                        tabu[1][2] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                            if (tabu[2][1] == '8') {
                    if (tabu[2][0] == j_IA && tabu[2][2] == j_IA
                            || tabu[0][1] == j_IA && tabu[1][1] == j_IA) {
                        tabu[2][1] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                                if (tabu[1][0] == '4') {
                    if (tabu[0][0] == j_IA && tabu[2][0] == j_IA
                            || tabu[1][1] == j_IA && tabu[1][2] == j_IA) {
                        tabu[1][0] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                    //-------------------------------------DEFESA-----------------------------------------------
                    if (tabu[0][2] == '3') {
                    if (tabu[0][0] == j_Atual && tabu[0][1] == j_Atual
                            || tabu[2][2] == j_Atual && tabu[1][2] == j_Atual
                            || tabu[2][0] == j_Atual && tabu[1][1] == j_Atual) {
                        tabu[0][2] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                        if (tabu[0][0] == '1') {
                    if (tabu[0][1] == j_Atual && tabu[0][2] == j_Atual
                            || tabu[1][0] == j_Atual && tabu[2][0] == j_Atual
                            || tabu[2][2] == j_Atual && tabu[1][1] == j_Atual) {
                        tabu[0][0] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                            if (tabu[2][0] == '7') {
                    if (tabu[0][0] == j_Atual && tabu[1][0] == j_Atual
                            || tabu[2][1] == j_Atual && tabu[2][2] == j_Atual
                            || tabu[0][2] == j_Atual && tabu[1][1] == j_Atual) {
                        tabu[2][0] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                if (tabu[2][2] == '9') {
                    if (tabu[0][2] == j_Atual && tabu[1][2] == j_Atual
                            || tabu[2][0] == j_Atual && tabu[2][1] == j_Atual
                            || tabu[0][0] == j_Atual && tabu[1][1] == j_Atual) {
                        tabu[2][2] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                    if (tabu[1][1] == '5') {
                    if (tabu[0][0] == j_Atual && tabu[2][2] == j_Atual
                            || tabu[2][0] == j_Atual && tabu[0][2] == j_Atual
                            || tabu[1][0] == j_Atual && tabu[1][2] == j_Atual
                            || tabu[0][1] == j_Atual && tabu[2][1] == j_Atual) {
                        tabu[1][1] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                        if (tabu[0][1] == '2') {
                    if (tabu[0][0] == j_Atual && tabu[0][2] == j_Atual
                            || tabu[2][1] == j_Atual && tabu[1][1] == j_Atual) {
                        tabu[0][1] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                            if (tabu[1][2] == '6') {
                    if (tabu[0][2] == j_Atual && tabu[2][2] == j_Atual
                            || tabu[1][0] == j_Atual && tabu[1][1] == j_Atual) {
                        tabu[1][2] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                                if (tabu[2][1] == '8') {
                    if (tabu[2][0] == j_Atual && tabu[2][2] == j_Atual
                            || tabu[0][1] == j_Atual && tabu[1][1] == j_Atual) {
                        tabu[2][1] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                                                    if (tabu[1][0] == '4') {
                    if (tabu[0][0] == j_Atual && tabu[2][0] == j_Atual
                            || tabu[1][1] == j_Atual && tabu[1][2] == j_Atual) {
                        tabu[1][0] = j_IA;
                        roberto = 0;
                        break;
                    }
                    }
                    roberto = 0;
                    //-------------------------------------ALEATÓRIO-----------------------------------------------
                    java.util.Random gerador = new java.util.Random();
                    while (pqsim == 1) {
                        int j_Comp = gerador.nextInt(9) + 1;
                        linha = (j_Comp - 1) / 3;
                        coluna = (j_Comp - 1) % 3;
                        if (tabu[linha][coluna] != '✘' && tabu[linha][coluna] != '〇') {
                            tabu[linha][coluna] = j_IA;
                            pqsim = 0;
                        }
                        tentativas++;
                        if (tentativas > 50) { //mas pq logo 50? pq sim.
                            pqsim = 0;
                        }
                    }
                }
            }
        }
    }
//acabei em casa... trabai do djabo
