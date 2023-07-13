package Strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(valid("[(){()}]"));
    }

    private static boolean valid(String s) {
        Stack<Character> st= new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(')');
            }
            else if(ch=='{'){
                st.push('}');
            }
             else if(ch=='['){
                st.push(']');
            }
             else if(st.isEmpty()|| st.pop()!=ch){
                return false;
            }
        }
        return st.isEmpty();
    }
}
