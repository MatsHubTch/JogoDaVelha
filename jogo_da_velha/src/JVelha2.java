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
        char j_A = '✘';
        char j_IA = '✷';
        while (true) {
            //-----------------------------MINHA JOGADA----------------------------------------------------------------
            System.out.println("\n");
            System.out.print(" " + tabu[0][0] + " | " + tabu[0][1] + " | " + tabu[0][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabu[1][0] + " | " + tabu[1][1] + " | " + tabu[1][2] + "\n");
            System.out.println("-----------");
            System.out.print(" " + tabu[2][0] + " | " + tabu[2][1] + " | " + tabu[2][2] + "\n");
            System.out.println("-------------------------\n");
            System.out.print("Turno do [" + j_A + "] - Escolha uma posição livre (1 a 9): ");
            int jogada = teclado.nextInt();
            int linha = (jogada - 1) / 3;
            int coluna = (jogada - 1) % 3;
            if (tabu[linha][coluna] != '✘' &&
                    tabu[linha][coluna] != '✷') {

                tabu[linha][coluna] = j_A;
            }
            else {
                System.out.println("Casa ocupada!");
            }
//-------------------------------------JOGADA DA IA------------------------------------------------
            java.util.Random gerador = new java.util.Random();
            int j_Comp = gerador.nextInt(9) + 1;
            System.out.println("O computador escolheu a posição: " + j_Comp);
            linha = (j_Comp - 1) / 3;
            coluna = (j_Comp - 1) % 3;
            if (tabu[linha][coluna] != '✘' &&
                    tabu[linha][coluna] != '✷') {

                tabu[linha][coluna] = j_IA;
            }
            else {
                System.out.println("Casa ocupada, IA!");
            }
//------------------------------------INTELIGÊNCIA DA IA-------------------------------------
            //NULL
// ------------------------------------MINHAS VITÓRIAS-------------------------------------
            if (tabu[0][0] == j_A && tabu[0][1] == j_A && tabu[0][2] == j_A
                    || tabu[1][0] == j_A && tabu[1][1] == j_A && tabu[1][2] == j_A
                    || tabu[2][0] == j_A && tabu[2][1] == j_A && tabu[2][2] == j_A
                    || tabu[0][0] == j_A && tabu[1][0] == j_A && tabu[2][0] == j_A
                    || tabu[0][1] == j_A && tabu[1][1] == j_A && tabu[2][1] == j_A
                    || tabu[0][2] == j_A && tabu[1][2] == j_A && tabu[2][2] == j_A
                    || tabu[0][0] == j_A && tabu[1][1] == j_A && tabu[2][2] == j_A
                    || tabu[0][2] == j_A && tabu[1][1] == j_A && tabu[2][0] == j_A) {
                System.out.println("o Jogador venceu!");
                break;
            }
//-----------------------------------VITÓRIAS DA IA-------------------------------------
            if (tabu[0][0] == j_IA && tabu[0][1] == j_IA && tabu[0][2] == j_IA
                    || tabu[1][0] == j_IA && tabu[1][1] == j_IA && tabu[1][2] == j_IA
                    || tabu[2][0] == j_IA && tabu[2][1] == j_IA && tabu[2][2] == j_IA
                    || tabu[1][0] == j_IA && tabu[2][0] == j_IA && tabu[3][0] == j_IA
                    || tabu[0][1] == j_IA && tabu[2][1] == j_IA && tabu[3][1] == j_IA
                    || tabu[0][2] == j_IA && tabu[1][2] == j_IA && tabu[2][2] == j_IA
                    || tabu[0][0] == j_IA && tabu[1][1] == j_IA && tabu[2][2] == j_IA
                    || tabu[0][2] == j_IA && tabu[1][1] == j_IA && tabu[2][0] == j_IA) {
                System.out.println("a IA venceu!");
                break;
            }
            // 13/07 (11:19) "tá difícil de pensar em como a ia vai parar de ser burra..!"