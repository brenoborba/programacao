public class ex009 {
    public static void main(String[] args){
        int x = 2000;
        int n = 1;
        int t = 2;

        System.out.printf("%.2f", val(n,t,x));
    }
    static double potencia(int base, int exp){
        double pot = 1;
        for(int i = 1; i <= exp; i++)
            pot *= base;
        return pot;
    }
    static double val(int n, int t, int x){
        double valor;

        valor = (x/potencia(1 + t, n));
        return valor;
    }
}
