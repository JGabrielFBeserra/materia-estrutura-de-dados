package estrutura_de_dados.b_recursividade;


//Implemente, de forma recursiva, uma função int pot(int x, int n) que,
// dados dois números inteiros x e n, calcula o valor de xn
public class Ex3 {
    public static void main(String[] args) {
        System.out.println(pot(5,2));
    }



    private static int pot(int x, int n) {
        if(n==1){
            return x;
        }
        return x = pot(x * x, n-1);
    }
}
