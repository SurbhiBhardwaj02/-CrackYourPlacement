package Strings;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
    public static String simplifyPath(String path) {
        Stack<String> st= new Stack<>();
        String res="";
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            String temp="";
            while(i<path.length() && path.charAt(i)!='/'){
                temp+=path.charAt(i);
                ++i;
            }


            if(temp.equals(".")) continue;
            else if(temp.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(temp);
            }
        }

        while(!st.isEmpty()){
            res='/' + st.pop() +res;
        }
        if(res.length()==0){
            return "/";
        }
        return res;
    }
}
