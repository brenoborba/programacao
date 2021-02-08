import java.util.Scanner;

public class ex005 {
    static void media(int[] x){
        float media = 0;
        float soma = 0;
        int contador = 0;

        for(int i = 0; i < x.length; i++){
            soma += x[i];
            contador++;
        }
        media = soma/(float) contador;
        System.out.printf("Media das notas inseridas: %.2f\n", media);

        System.out.printf("Notas inseridas acima da media:\n");
        for(int i = 0; i < x.length; i++)
            if(x[i] >= media)
                System.out.printf("%d\n", x[i]);

    }
    static void lerNotas(int[] x){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < x.length; i++) {
            System.out.printf("Insira uma nota: ");
            x[i] = scan.nextInt();
            if(x[i] < 10)
                break;
        }
    }
    static void mostraNotas(int[] x){

    }
    public static void main(String[] args){
        int[] notas = new int[5];
        lerNotas(notas);
        media(notas);

    }

}
