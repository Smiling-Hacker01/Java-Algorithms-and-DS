
import java.util.Stack;

//code is to validate the given paranthese i.e every opeing bracket should have a closing bracket and also in a correct order 
//approach to remember - last opening bracket = first closing bracket 
// i.e we have to follow the LIFO property which is stack
public class ValidParentheses {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            //if the current char is opening bracket
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                st.push(str.charAt(i));
            }
            else{ //if its a closing bracket

                //if theere is too much closing bracket but the stack is already empty
                if (st.size() <= 0) {
                    return false;
                }
                if (
                    st.peek() == '(' && str.charAt(i) == ')' ||
                    st.peek() == '{' && str.charAt(i) == '}' ||
                    st.peek() == '[' && str.charAt(i) == ']'
                ) {
                    st.pop();
                }
                else{
                    return false;  // if opening and closing char doesn't match
                }
 
            }
        }
        return  st.isEmpty();
    }
    
    //main function
    public static void main(String[] args) {
        String str = "([])";
        boolean result = isValid(str);
        System.out.println("IS the given paranthesis are valid ? " + result);
    }
}
