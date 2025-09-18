public class IntegerToRoman {
     public String intToRoman(int num) {
        int[]values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]romans = {"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                 num -= values[i];
                 sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
    //main function
    public static void main(String[] args) {
        IntegerToRoman itr = new IntegerToRoman();
        int num = 1994;
        String result = itr.intToRoman(num);
        System.out.println("Roman Numeral: " + result);
    }
}
