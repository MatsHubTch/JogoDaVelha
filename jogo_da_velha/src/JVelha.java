import java.util.Scanner;

public class JVelha {
    public static void main(String[] args) {


        char[][] tabuleiro = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };


        System.out.println("\n");
        System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
        System.out.println("-----------");
        System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
        System.out.println("-----------");
        System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
        System.out.println("-------------------------\n");


        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha uma posição livre (1 a 9): ");
        int jogada = teclado.nextInt();

        if (jogada == 1)
            if (tabuleiro[0][0] == '1') {
                tabuleiro[0][0] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 2)
            if (tabuleiro[0][1] == '2') {
                tabuleiro[0][1] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 3)
            if (tabuleiro[0][2] == '3') {
                tabuleiro[0][2] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 4)
            if (tabuleiro[1][0] == '4') {
                tabuleiro[1][0] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 5)
            if (tabuleiro[1][1] == '5') {
                tabuleiro[1][1] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 6)
            if (tabuleiro[1][2] == '6') {
                tabuleiro[1][2] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 7)
            if (tabuleiro[2][0] == '7') {
                tabuleiro[2][0] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 8)
            if (tabuleiro[2][1] == '8') {
                tabuleiro[2][1] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }

        if (jogada == 9)
            if (tabuleiro[2][2] == '9') {
                tabuleiro[2][2] = 'X';
                System.out.println("Você escolheu a posição: " + jogada);

                System.out.println("\n");
                System.out.print(" " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + "\n");
                System.out.println("-----------");
                System.out.print(" " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
                System.out.println("-------------------------\n");

            } else {
                System.out.println("Essa posição já está ocupada! Escolha outra.");
            }



        //System.out.println("Você escolheu a posição: " + jogada);


        teclado.close();
    }
}
