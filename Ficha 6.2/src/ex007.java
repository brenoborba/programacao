import java.util.Scanner;

public class ex007 {
    static char ch(char a) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Insira uma letra: ");
            a = sc.next().charAt(0);

        }while(!(a >= 'A' && a <= 'z'));
        
        return a;
    }

    public static void main(String[] args){
        char caracter = '0';

        System.out.printf("A letras inserida %s", ch(caracter));

    }
}
