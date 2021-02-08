import java.util.Locale;
import java.util.Scanner;

public class ex005 {
    static int consoantes(String str){
        int cont = 0;

        for(int i = 0; i < str.length(); i++)
            if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') && str.charAt(i) != ' ')
                cont++;

        return cont;

    }
    static int vogais(String str){
        int cont = 0;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                cont++;

        return cont;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase;


        do{

            System.out.printf("Insira uma frase: ");
            frase = scan.nextLine();
            frase = frase.toLowerCase(Locale.ROOT);
            System.out.printf("Numero de consoantes na frase inserida: %d\n", consoantes(frase));
            System.out.printf("Numero de vogais na frase inserida: %d\n", vogais(frase));

        }while(!frase.equals("sair"));

    }
    //vogais = 8
    //consoantes = 8
}
