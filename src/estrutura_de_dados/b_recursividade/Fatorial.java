package estrutura_de_dados.b_recursividade;

public class Fatorial {
    public static void main(String[] args) {
        int j = 5;

        System.out.println(calcularFatorial(j));
    }

    public static int calcularFatorial (int n ) {
        if (n ==1) {
            return 1;
        }
        return n * calcularFatorial(n-1);
    }
}
