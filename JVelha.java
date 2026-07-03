import java.util.Scanner; // Importamos isso para conseguir ler o que o usuário digita

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


        System.out.println("Você escolheu a posição: " + jogada);


        teclado.close();
    }
}
