import java.util.ArrayList;
import java.util.List;

public class binario {
    public static List<Integer> convertBinario(Integer number){
        Integer lenght = 1;
        Integer compare = 1;
        while(compare<Math.abs(number)){
            compare = compare * 2;
            lenght+=1;
        }



        Stack<Integer> stack = new Stack<>(lenght);
        List<Integer> list = new ArrayList<>();
        Integer resto = 0;

        while(number>0) {
            int rest = number % 2;

            // pushing the remainder inside the stack
            stack.push(rest);
            number /= 2;
        }


        stack.exibe();
        while (!(stack.isEmpty() )){
                list.add(stack.pop());
       }



        return list;
    }




    public static void main(String[] args) {

        System.out.println(convertBinario(32));




    }
}
