import java.util.Scanner;



public class StringInversa {

    public static String stringInvertida(String str){
        char[] fraseChar= str.toCharArray( );
        Stack<Character> stack = new Stack<>(str.length());
        String strRetorno = "";
        for(char character:fraseChar){
                stack.push(character);
        }
        while (!(stack.isEmpty() )){
            strRetorno+=stack.pop();
        }

        return strRetorno;
    }



    public static void main(String[] args) {

        System.out.println(stringInvertida("OlaMundo"));
    }
}
