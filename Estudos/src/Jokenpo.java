import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String opcoes_nome[] = {"pedra", "papel", "tesoura"};

        int opcoes[] = {0, 1, 2};
        int computador = 0;


        separacao('*', 20);
        System.out.println("Bem vindo ao Jokenpo!");
        separacao('-', 20);

        randInt(computador);

        System.out.print("Essas são as suas opções:\n[0]Pedra\n[1]Papel\n[2]Tesoura\n");
        int escolha_usuario  = scan.nextInt();

        System.out.printf("O computador jogou %d\n", computador);

        if (computador == 0 && escolha_usuario == 0)
            System.out.printf("EMPATE!");
            else if(computador == 0 && escolha_usuario == 1)
                System.out.printf("VOCÊ VENCEU!");
            else if(computador == 0 && escolha_usuario == 2)
                System.out.printf("COMPUTADOR VENCEU!");

        if(computador == 1 && escolha_usuario == 1)
            System.out.printf("EMPATE");
            else if(computador == 1 && escolha_usuario == 0)
                System.out.printf("COMPUTADOR VENCEU!");
            else if(computador == 1 && escolha_usuario == 2)
                System.out.printf("VOCÊ VENCEU!");

        if(computador == 2 && escolha_usuario == 2)
            System.out.printf("EMPATE");
            else if(computador == 2 && escolha_usuario == 0)
                System.out.printf("VOCÊ VENCEU!");
            else if(computador == 2 && escolha_usuario == 1)
                System.out.printf("COMPUTADOR VENCEU!");


    }
    public static char separacao(char ch, int n){
        for(int i = 1; i <= n; i++)
            System.out.printf("%s", ch);
        System.out.print("\n");
        return ch;

    }
    public static int randInt(int n){
        Random r = new Random();
        int number = r.nextInt(2);

        return number;
    }

}
