package estrutura_de_dados.b_recursividade;

public class Ex6 {
    public static void main(String[] args) {
    int n = 1001;
        System.out.println(numerosDeDigitos(n,1));

    }

    private static int numerosDeDigitos(int numero, int divisor) {
        if(divisor > numero) {
            return 0;
        } else if  (divisor == numero){
            return 1;
        }
        int soma = numerosDeDigitos(numero, divisor * 10);
        soma = soma + 1;
        ;
        return soma;
    }
}
