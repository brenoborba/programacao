import java.util.Scanner;

public class ex007 {
    static void amplitude(float f, float n){

    }

    static float tempmenor(float[] f){
        float min = f[0];
        for(int i = 1; i < f.length; i++){
            if(f[i] < min){
                min = f[i];
            }
        }
        return min;
    }
    static float tempmaxi(float[] f){
        float max = f[0];
        for(int i = 1; i < f.length; i++ ){
            if(f[i] > max){
                max = f[i];
            }
        }
        return max;
    }
    static void tempmedia(float[] f){
        float soma = 0;
        float media;
        int contador = 0;
        for(int i = 0; i < f.length; i++){
            soma += f[i];
            contador++;

        }
        media = soma/contador;

        System.out.printf("Temperatura media anual: %.2f\n", media);
    }
    static void mostratemp(float[] f){
        int n = 1;
        for(int i = 0; i < f.length; i++) {
            System.out.printf("Temperatura media do mes %d: %.2f\n", n, f[i]);
            n++;
        }
    }
    static void temperaturas(float[] f){
        Scanner scan = new Scanner(System.in);
        int n = 1;
        for(int i = 0; i < f.length; i++) {
            System.out.printf("Insira a temperatura do mes %d: ", n);
            f[i] = scan.nextFloat();
            n++;
        }

    }
    static void consulta(float[] f, float n){
        for(int i = 0; i < f.length; i++) {
            if (n == f[i]) {
                System.out.printf("Temperatura encontrada no mes %d: %.2f\n", i + 1, f[i]);
                break;
            }
        }
    }

    public static void main(String[] args){
        float[] temperaturas = new float[12];
        temperaturas(temperaturas);
        consulta(temperaturas, (float)20.8);
        tempmedia(temperaturas);
        System.out.printf("Temperatura maxima do ano: %.2f\n", tempmaxi(temperaturas));
        System.out.printf("Temperatura minima do ano: %.2f\n", tempmenor(temperaturas));
        System.out.printf("Amplitude termica: %.2f\n", (tempmaxi(temperaturas) - tempmenor(temperaturas)));



    }
}
