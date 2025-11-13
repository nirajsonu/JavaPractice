package programs.leetcode.stack;

import java.util.Stack;

public class ValidParentsis {
    public static void main(String a[]){
        String c="{}";
        Stack<Character> stack=new Stack<>();
        for(char c1:c.toCharArray()){
            if(c1=='(' ||c1=='[' ||c1=='{'){
                stack.add(c1);
            }
            else {
                if(stack.isEmpty()) return;
                if(c1==']' && stack.peek()!='[') return;
                if(c1==')' && stack.peek()!='(') return;
                if(c1=='}' && stack.peek()!='{') return;
                stack.pop();
            }
        }
        stack.isEmpty();
    }
}
