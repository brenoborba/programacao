import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        char a = '2';
        ko(a);

    }
    static char lerLetra(char ch){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.printf("Insira uma letra: ");
            ch = scan.next().charAt(0);

        }while(!(ch >= 'A' && ch <= 'z'));

        System.out.printf("Caractere inserido: %c", ch);

        return ch;
    }
    static char maiúsculo(char ch){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira uma letra: ");
        ch = scan.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z')
            ch = (char) Character.toLowerCase(ch);

        else if(ch >= 'a' && ch <= 'z')
            ch = (char) Character.toUpperCase(ch);

        System.out.printf("%c", ch);

        return ch;

    }
    static void ko(char ch){
        Scanner scan = new Scanner(System.in);

        do{
            System.out.printf("Insira uma letra: ");
            ch = scan.next().charAt(0);

            if(ch >= 'A' && ch <= 'Z') {

                ch = (char) Character.toLowerCase(ch);
                System.out.printf("%c", ch);
                System.out.printf("\n");

            }
            else if(ch >= 'a' && ch <= 'z') {

                ch = (char) Character.toUpperCase(ch);
                System.out.printf("%c", ch);
                System.out.printf("\n");
            }

        }while(ch != 'k' && ch != 'K' && ch != 'O' && ch != 'o');

    }
}