public class EX1_F6 {
    public static void main(String[] args){
        System.out.print(potencia(2,3));
    }
    public static double potencia(double x, int n){
        double pot = 1;
        for(int k = 1; k <= n; k++)
            pot *= x;
        return pot;
    }

}
