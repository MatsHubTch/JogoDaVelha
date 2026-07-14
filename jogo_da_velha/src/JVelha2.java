import java.util.Scanner;

public class JVelha2 {
    public static void main(String[] args) {
        char[][] tabu = {
                {'1', '2', '3'},  //esse tabuleiro eu pedi pra ia fazer.
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        //  0  1  2
        //0 □  □  □
        //1 □  □  □
        //2 □  □  □
        Scanner teclado = new Scanner(System.in);
        char j_Atual = '✘';
        char j_IA = '✷';
        int roberto;
        int pqsim;
        int tentativas = 0;
        while (true) {
            //-----------------------------MINHA JOGADA----------------------------------------------------------------
            roberto = 1;
            pqsim = 1;
            System.out.println("\n");
            System.out.print(" " + tabu[0][0] + " | " + tabu[0][1] + " | " + tabu[0][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabu[1][0] + " | " + tabu[1][1] + " | " + tabu[1][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabu[2][0] + " | " + tabu[2][1] + " | " + tabu[2][2] + "\n");
            System.out.println("-------------------------\n");
            System.out.print("Turno do [" + j_Atual + "] - Escolha uma posição livre (1 a 9): ");
            int jogada = teclado.nextInt();
            int linha = (jogada - 1) / 3;
            int coluna = (jogada - 1) % 3;
            if (tabu[linha][coluna] != '✘' &&
                    tabu[linha][coluna] != '✷') {

                tabu[linha][coluna] = j_Atual;
            } else {
                System.out.println("Casa ocupada!");
            }

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
//-------------------------------------JOGADA DO ROBERTO------------------------------------------------
            //-------------------------------------ATAQUE-----------------------------------------------



            //-------------------------------------DEFENDE-----------------------------------------------
while (roberto == 1) {
                if (tabu[0][0] == j_Atual && tabu[0][1] == j_Atual
                        || tabu[2][2] == j_Atual && tabu[1][2] == j_Atual
                        || tabu[2][0] == j_Atual && tabu[1][1] == j_Atual) {
                    tabu[0][2] = j_IA;
                    roberto = 0;
                    break;
                }


                if (tabu[0][1] == j_Atual && tabu[0][2] == j_Atual
                        || tabu[1][0] == j_Atual && tabu[2][0] == j_Atual
                        || tabu[2][2] == j_Atual && tabu[1][1] == j_Atual) {
                    tabu[0][0] = j_IA;
                    roberto = 0;
                    break;
                }


                if (tabu[0][0] == j_Atual && tabu[1][0] == j_Atual
                        || tabu[2][1] == j_Atual && tabu[2][2] == j_Atual
                        || tabu[0][2] == j_Atual && tabu[1][1] == j_Atual) {
                    tabu[2][0] = j_IA;
                    roberto = 0;
                    break;
                }


                if (tabu[0][2] == j_Atual && tabu[1][2] == j_Atual
                        || tabu[2][0] == j_Atual && tabu[2][1] == j_Atual
                        || tabu[0][0] == j_Atual && tabu[1][1] == j_Atual) {
                    tabu[2][2] = j_IA;
                    roberto = 0;
                    break;
                }


                if (tabu[0][0] == j_Atual && tabu[2][2] == j_Atual
                        || tabu[2][0] == j_Atual && tabu[0][2] == j_Atual
                        || tabu[1][0] == j_Atual && tabu[1][2] == j_Atual
                        || tabu[0][1] == j_Atual && tabu[2][1] == j_Atual) {
                    tabu[1][1] = j_IA;
                    roberto = 0;
                    break;
                }


                if (tabu[0][0] == j_Atual && tabu[0][2] == j_Atual
                        || tabu[2][1] == j_Atual && tabu[1][1] == j_Atual) {
                    tabu[0][1] = j_IA;
                    roberto = 0;
                    break;
                }

                if (tabu[0][2] == j_Atual && tabu[2][2] == j_Atual
                        || tabu[1][0] == j_Atual && tabu[1][1] == j_Atual) {
                    tabu[1][2] = j_IA;
                    roberto = 0;
                    break;
                }


                if (tabu[2][0] == j_Atual && tabu[2][2] == j_Atual
                        || tabu[0][1] == j_Atual && tabu[1][1] == j_Atual) {
                    tabu[2][1] = j_IA;
                    roberto = 0;
                    break;
                }


                if (tabu[0][0] == j_Atual && tabu[2][0] == j_Atual
                        || tabu[1][1] == j_Atual && tabu[1][2] == j_Atual) {
                    tabu[1][0] = j_IA;
                    roberto = 0;
                    break;
                }
    roberto = 0;

        java.util.Random gerador = new java.util.Random();
    while (pqsim == 1) {
        int j_Comp = gerador.nextInt(9) + 1;
        linha = (j_Comp - 1) / 3;
        coluna = (j_Comp - 1) % 3;

        if (tabu[linha][coluna] != '✘' && tabu[linha][coluna] != '✷') {
            tabu[linha][coluna] = j_IA;
            pqsim = 0;
        }

        tentativas++;
        if (tentativas > 50) { //mas pq logo 50? pq sim.
            pqsim = 0;
        }
    }


            }
//------------------------------------INTELIGÊNCIA DA IA-------------------------------------
                //NULL

        }
    }
}
            // 13/07 (11:19) "tá difícil de pensar em como a ia vai parar de ser burra..!"
//            java.util.Random gerador = new java.util.Random();
//int j_Comp = gerador.nextInt(9) + 1;
//            System.out.println("O computador escolheu a posição: " + j_Comp);
//linha = (j_Comp - 1) / 3;
//coluna = (j_Comp - 1) % 3;
//        if (tabu[linha][coluna] != '✘' &&
//tabu[linha][coluna] != '✷') {
//
//tabu[linha][coluna] = j_IA;
//            }
//                    else {
//                    System.out.println("Casa ocupada, IA!");
//            }
