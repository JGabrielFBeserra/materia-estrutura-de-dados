package estrutura_de_dados.b_recursividade;

// Modifique o exibeRec de forma que ele opere somente com um parâmetro

public class Ex1 {
    public static void main(String[] args) {
        exibeRec(6);

    }

    public static int exibeRec (int n) {
        if(n==0){
            return 1;
        } else {
            System.out.println("dentro do metodo:" + n);
            return exibeRec(n-1);
        }

    }
}
