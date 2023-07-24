package Strings;

import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        System.out.println(calculate("32-3+4/2*2"));
    }

    private static int calculate(String s) {
        if(s==null || s.length()==0) return 0;
        Stack<Integer> st= new Stack<>();
        int curr=0;
        char op='+';

        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            if(Character.isDigit(ch)){
                curr= curr*10 + ch-'0';
            }
            if(!Character.isDigit(ch) && ch!=' ' || i == s.length()-1){
                if(op=='+') st.push(curr);
                else if(op=='-') st.push(-curr);
                else if(op=='*') st.push(st.pop()*curr);
                else if(op=='/') st.push(st.pop()/curr);
                // Initializing to the default value again.
                op = s.charAt(i);
                curr = 0;
            }
        } int sum = 0;
        while(!st.isEmpty())
            sum += st.pop();
        return sum;
    }
}
