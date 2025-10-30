//code is to solve a valid paranthesis problem with given condition:- (recursive approach) TC = 3 ^ N which is not good

//Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
//The following rules define a valid string:
//Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//Any right parenthesis ')' must have a corresponding left parenthesis '('.
//Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
public class ValidParanthesisStringRecursiveWay {
    public static boolean isValid(String str, int index, int count){
       if (count < 0) {
          return false;
       }
       if (index == str.length()) {
           if (count == 0) {
              return true;
           }
       }
       if (str.charAt(index) == '(') {
           return  isValid(str, index+1, count += 1);
       }
       else if (str.charAt(index) == ')') {
          return isValid(str, index + 1, count -= 1);
       }
       else{ // if * we have three choices
          if (
            // leaving the space empty
             isValid(str, index + 1, count) ||
             // considering it as a opeing character
             isValid(str, index + 1, count += 1) ||
             //cons]idering it as a closing bracket
             isValid(str, index + 1, count -= 1)
          ) {
            return true;
          }
       }
       return false;
    }
    //main function
    public static void main(String[] args) {
        String str = "(*)))";
        int index = 0;
        int count = 0;
        boolean result = isValid(str, index, count);
        System.out.println("Is the gieven string a valid paranthesis? " + result);
    }
}
