public class ex001 {
    public static void main(String[] args){
        int i;
        linha20Ast();
        System.out.printf("Números entre 1 e 5\n");
        linha20Ast();
        for(i = 1; i <= 5; i++)
            System.out.printf("%d\n", i);
        linha20Ast();
    }
    static void linha20Ast() {
        int i;
        for (i = 1; i <= 20; i++)
            System.out.printf("*");
        System.out.printf("\n");
    }
}
