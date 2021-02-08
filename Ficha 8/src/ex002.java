import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um texto qualquer: ");
        String texto = scan.nextLine();

        int n = texto.length();
        int cont = 0;

        for(int i = 0; i < n; i++)
            if(texto.charAt(i) == 'a' || texto.charAt(i) == 'A')
                cont++;

        System.out.printf("Letras 'a' encontradas no texto inserido: %d", cont);
    }
}
