import java.util.Scanner;

public class aaaaaaaa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] notas = new int[50];

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Insira uma nota: ");
            notas[i] = scan.nextInt();
            if(notas[i] < 10)
                break;
        }
        int soma = 0;
        int cont = 0;
        float media;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
            cont++;
        }
        media = (float)soma/cont;

        for(int i = 0; i < notas.length; i++)
            if(notas[i] >= media)
                System.out.printf("%d\n", notas[i]);




    }
}
