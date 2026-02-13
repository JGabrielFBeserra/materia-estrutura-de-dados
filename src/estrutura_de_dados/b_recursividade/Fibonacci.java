package estrutura_de_dados.b_recursividade;

public class Fibonacci {
    public static void main(String[] args) {
    int j = 6;

    System.out.println(calcularFibonnaci(j));




    }

    public static int calcularFibonnaci (int n ) {
        if (n == 1) {
            return 0;
        } else if (n == 2)  {
            return 1;
        }
        return calcularFibonnaci(n-1) + calcularFibonnaci(n-2);
    }
}
