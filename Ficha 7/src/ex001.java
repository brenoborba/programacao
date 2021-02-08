import java.util.Date;
import java.util.Scanner;

public class ex001 {
    static void numMinusculas(char[] ch){
        int n = ch.length;
        int l = 0;

        for(int i = 0; i < n; i++)
            if(ch[i] >= 'a' && ch[i] <= 'z')
                l++;
        System.out.printf("Foram inseridas %d letras minusuculas\n", l);



    }

    static void numLetras(char[] ch) {
        int n = ch.length;
        int l = 0;
        for (int i = 0; i < n; i++)
            if (ch[i] >= 65 && ch[i] <= 90)
                l++;
        System.out.printf("Foram inseridas %d letras maiusculas\n", l);
    }

    static void mostraVetor(char[] ch){
        int tamanho = ch.length;
        char[] arrayAux = new char[tamanho];

        for(int i = 0; i < arrayAux.length; i++){
            tamanho--;
            arrayAux[i] = ch[tamanho];
            System.out.printf("%s\n", arrayAux[i]);
        }
    }

    static void lerChar(char[] ch){
        Scanner scan = new Scanner(System.in);
        int n = ch.length;

        for(int i = 0; i < n; i++) {
            System.out.printf("Insira um caractere: ");
            ch[i] = scan.next().charAt(0);

            if (i == 9 || ch[i] == '#')
                break;
            }
        }

    public static void main(String[] args) {
        char ch[] = new char[11];
        lerChar(ch);
        numLetras(ch);
        numMinusculas(ch);

    }
}
