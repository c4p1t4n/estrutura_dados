import java.text.Normalizer;

public class palindromoString {


    public static String tratarString(String str) {
        str= Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        str = str.replace("-","").replace(" ","");
        return str;
    }
        public static boolean isPalindromo(String str){
            str = tratarString(str);
            char[] list = str.toCharArray();
            Stack stack = new Stack<Integer>(list.length);
            String strCompare = "";

            for(Character i :list){
                stack.push(i);
            }

            for (int i = 0; i < list.length; i++) {
                strCompare+=(Character) stack.pop();;
            }

            System.out.println(list);
            if(strCompare.equalsIgnoreCase(str)){
                return true;
            }
            return false;

        }


        public static void main(String[] args) {
            System.out.println(isPalindromo("subi no ônibus"));
        }
    }

