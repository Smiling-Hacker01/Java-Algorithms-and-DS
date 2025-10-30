//code is to solve a valid paranthesis problem with given condition:- (Optimized approach)

//Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
//The following rules define a valid string:
//Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//Any right parenthesis ')' must have a corresponding left parenthesis '('.
//Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

//In this version of sollution “min and max show the least and most opens possible at each step — * stretches that range out wider.”
public class ValidParanthesisStringOptimizedVersion {
    public static boolean isValid(String s){
        int min = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(') {
                min++;
                max++;
            }
            else if (s.charAt(i) == ')') {
                min--;
                max--;
            }
            else{ // the case where we counter (*) here we will choose the best case for both min and max
                 min--;
                 max++;
            }
            if (min < 0) {
                min = 0;  //if min becomes < 0 we will renetialize it with 0.
            }
            if (max < 0) { // max is less than zero i.e we have closed the more brackets then we can open. so we return false
                return false;
            }
        }
        //now we check if min is 0. because if min is zero that means we have closed every opened bracket
        return min == 0? true : false;
    }
    //main function
    public static void main(String[] args) {
        String s = "(*))";
        boolean result = isValid(s);
        System.out.println("Is the given parenthesis are valid? " + result);
    }
}
