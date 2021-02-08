import java.util.Scanner;

public class ex004 {
    static void inverso(char[] ch){
        int n = ch.length;
        char[] arrayAux = new char[ch.length];

        for(int i = 0; i < arrayAux.length; i++)
            arrayAux[i] = ch[n - 1];

        System.out.printf("Array invertido:\n");
        for(int i = 0; i < arrayAux.length; i++)
            System.out.printf("%s\n", arrayAux[i]);
    }
    static void lerCaracteres(char[] ch){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < ch.length; i++) {
            System.out.printf("Insira um caracter: ");
            ch[i] = scan.next().charAt(0);
            if(ch[i] == '#' || i == 11)
                break;
        }

    }
    public static void main(String[] args){
        char[] ch = new char[10];
        lerCaracteres(ch);
        inverso(ch);
    }
}
