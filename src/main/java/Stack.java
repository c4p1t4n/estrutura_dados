public class Stack  <T> {
        private int top;
        private T[] stack;

    public Stack( int lenght) {
        this.top = -1;
        this.stack = (T[]) new Object[lenght];
    }

    public boolean isEmpty() {
            return top == -1;
        }

    public boolean  isFull(){
            return stack.length -1 == top ;

    }

    public void  push (T obj){
        if(!isFull()){

            stack[++top] = obj;
        }else{
            System.out.println("Pilha cheia");
        }


    }
    public T  pop (){
        if(!isEmpty()){
            return stack[top--];

        }

        return null;


    }

    public T peek(){
        if (!isEmpty()) {
            return stack[top];

        }
            return null;


    }

    public void exibe() {

        if(!isEmpty()){
            for (int i = 0; i < stack.length  ; i++) {
                System.out.println(stack[i]);
            }
        }
    }





}
