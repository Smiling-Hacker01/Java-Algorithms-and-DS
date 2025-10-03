//in this ques we have given two arrays one of fruits and of its quantity and second of basket of some space we have to place all the fruits in a basket from left to right whenever the suitabe space is found and if any fruits remain unplaced we have to return the number of fruits unplaced 
public class FruitsIntoBasket2nd {
    public static int numOfUnplacedFruits(int[]fruits, int[]baskets){
        int totalfruitsPlaced = 0;
        boolean[] usedBasket = new boolean[baskets.length];
        for(int i = 0; i < fruits.length; i++){
             boolean isPlaced = false;
             int frtQuant = fruits[i];
             for(int j = 0; j < baskets.length; j++){
                  if (usedBasket[j] == false && baskets[j] >= frtQuant) {
                    usedBasket[j] = true;
                    totalfruitsPlaced++;
                    isPlaced = true;
                    break;
                  }
             } 
        }
        return fruits.length - totalfruitsPlaced;
    }
    //main function
    public static void main(String[] args) {
        int[]fruits = {4,2,5};
        int[] basket = {3,5,4};
        int totalUnplacedFruits = numOfUnplacedFruits(fruits, basket);
        System.out.println("Total number of fruits that are unplaced => " + totalUnplacedFruits);
    }
}
