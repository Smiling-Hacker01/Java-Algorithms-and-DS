//code to add two integers but the thing is we did not use any operator for it 
public class AddTwoIntegers {
    public static int addInteger(int a, int b){
        int carry;
        while (b != 0) {
            carry = a & b ; //bitwise and operator helps in getting the bits where carry occurs
            a = a ^ b; //sum without carry also the a got updated 
            b = carry << 1; //left shifting b until and unless it becomes 0
        }
        return a;
    }
    //main function
    public static void main(String[] args){
     int result =  addInteger(4, 5);
     System.out.println("Addition of two numbers without operator is -> " +  result);
    }
}
