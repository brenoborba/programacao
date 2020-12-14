public class ex002{
    public static void main(String[] Args){
        int linha, coluna;
        for(linha= 1; linha<= 10; linha++ ){
            for(coluna= 1; coluna<= linha; coluna++)
                System.out.printf("%d ", coluna);
            System.out.print("\n");
        }
    }
}
