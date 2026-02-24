package estrutura_de_dados.b_recursividade;

public class Ex7 {

    public static void main(String[] args) {

        String entrada = "Manuela";

        retornaStringInvertida2Params(entrada, 0);
        retornaStringInvertida1Param(entrada);




    }

    private static void retornaStringInvertida2Params(String string, int count) {
        if (count >= string.length()-1) {
            System.out.print(string.charAt(count));
          return;
        }

        retornaStringInvertida2Params(string, count+1);
        System.out.print(string.charAt(count));


    }

    private static void retornaStringInvertida1Param(String string) {
string.


    }
}
