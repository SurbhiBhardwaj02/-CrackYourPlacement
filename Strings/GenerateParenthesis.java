package Strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate_parenthesis(list,0,0,"",n);
        return list;
    }
    public static void generate_parenthesis(List<String> list,int open,int close,String str,int n){
        if(open==n && close==n) list.add(str);
        if(open<n){
            generate_parenthesis(list,open+1,close,str+"(",n);
        }
        if(close<open){
            generate_parenthesis(list,open,close+1,str+")",n);
        }
    }
}
