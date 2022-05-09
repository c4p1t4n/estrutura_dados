import java.util.ArrayList;
import java.util.List;

public class palindromo {


    public static boolean isPalindromo(List<Integer> list){

        Stack sp = new Stack<Integer>(list.size());
        List<Integer>  ls = new ArrayList<>();
        for(Integer i :list){
            sp.push(i);
        }
        for (int i = 0; i < list.size(); i++) {
            ls.add((Integer) sp.pop());
        }

        if(ls.equals(list)){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        List<Integer>  ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(30);
        ls.add(1);
        System.out.println(isPalindromo(ls));


    }
}
