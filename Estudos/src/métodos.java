import java.util.Scanner;

public class métodos{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.printf("Insira um caractér: ");
        char ch = scan.next().charAt(0);

        System.out.printf("O caractere inserido é uma vogal? %b\n", vogal(ch));
        System.out.printf("O caractere inserido é uma consoante? %b\n", consoante(ch));
        System.out.printf("O caractere inserido é alfanumérico? %b\n", alfanumerico(ch));
        */
        int n;
        System.out.printf("Insira um número: ");
        n = scan.nextInt();

        System.out.printf("O número inserido é primo? %b\n", primo(n));


    }
    public static boolean vogal(char ch){
        return (ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'i'||ch == 'I'||ch == 'o'||ch == 'O'||ch == 'u'||ch == 'U');
    }
    public static boolean consoante(char ch){
        return !(ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'i'||ch == 'I'||ch == 'o'||ch == 'O'||ch == 'u'||ch == 'U');
    }
    public static  boolean alfanumerico(char ch){
        return ch >= 0 && ch <= 122;
    }
    public static boolean primo(int n){
        int tot = 0;
        for(int i = 1;i <= 2; i++){
            if (n % i == 0) {
                tot += 1;
            }
        }
        return tot == 2;
    }

}