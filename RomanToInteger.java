import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       map.put('I', 1);
       map.put('V', 5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int number = 0;
       for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
        if(i+1 < s.length()){
            char nextChar = s.charAt(i+1);
           if(map.get(currChar) < map.get(nextChar)){
                number -= map.get(currChar);
           }else{
                number += map.get(currChar);
           }
        }else{
         number += map.get(currChar); 
        }
       }
       return number;
    }
    //main function
    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        String s = "MCMXCIV";
        int result = rti.romanToInt(s);
        System.out.println("Integer: " + result);
    }   
}
