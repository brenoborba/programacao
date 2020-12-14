public class ex008 {
    static long fatorial(int n){
        int i;
        long fat = 1;

        for(i = 1; i <= n; i++){
            fat *= i;
        }
        return fat;
    }
    static double combinacoes (int n, int p){

        return fatorial(n)/(fatorial(n-p)*fatorial(p));

    }
    public static void main(String[] args){

        System.out.printf("Combinações possíveis da Totoloto: %.8f", combinacoes(49, 6));
        System.out.printf("Combinações possíveis do Euromilhão: %.8f", combinacoes(50, 5));
    }
}
