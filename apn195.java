// Stack Implement using Stack
// In ArrayList
import java.util.*;
public class apn195 {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0 ;
        };

        // push - for add in stack
        public static void push(int data){
            list.add(data);
        }

        // pop - for remove in Stack
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek - for print the stack , return the Top
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        };
        
    }
}
