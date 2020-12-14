import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        int i;
        linha20Ast(10, '-');

        System.out.printf("Números entre 1 e 5\n");

        linha20Ast(20, '=');

        for(i = 1; i <= 5; i++)
            System.out.printf("%d\n", i);

        linha20Ast(25, '*');
    }
    static void linha20Ast(int n, char ch) {
        int i;
        for (i = 1; i <= n; i++)
            System.out.printf("%c", ch);
        System.out.printf("\n");
    }
}
