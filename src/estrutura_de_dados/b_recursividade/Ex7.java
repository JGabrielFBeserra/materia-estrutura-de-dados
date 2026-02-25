package estrutura_de_dados.b_recursividade;

public class Ex7 {

    public static void main(String[] args) {

        String entrada = "Manuela";

        retornaStringInvertida2Params(entrada, 0);

        System.out.println("");

        retornaStringInvertida1Param(entrada);

        System.out.println("");

        System.out.println(retornaStringInvertida1ParamBetter(entrada));




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
        if(string.length() == 0) {return;}
        System.out.print(string.substring(string.length()-1));
        retornaStringInvertida1Param(string.substring(0, string.length() - 1));
    }

    private static String retornaStringInvertida1ParamBetter(String string) {
        if(string.length() == 1 || string == null) {
            return string;
        }
        return retornaStringInvertida1ParamBetter(string.substring(1)) + string.charAt(0);
    }
}
