public class ex008 {
    public static void main(String[] args){
        System.out.printf("Chaves possíveis Totoloto: %.2f\n", combinacao(49,6));
        System.out.printf("Chaves possíveis Euromilhões: %.2f\n", combinacao(50,5));

    }
    static double fatorial(int base){
        double fat = 1;

        for(int i = 1; i <= base; i++)
            fat *= i;


    return fat;
    }
    static double combinacao(int n, int p){
        double comb;
        comb = fatorial(n)/((fatorial(n - p)) * fatorial(p));
        return comb;
    }
}
