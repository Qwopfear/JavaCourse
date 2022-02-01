package interviewPreparation;

public class Task3 {
    public static void main(String[] args) {
       int [] sol =  twoSum(new int[]{2,2,3},4);
        for (int i:sol) {
            System.out.print(i + " ");
        }
    }

  //  Write a function that takes an array of numbers (integers for the tests) and a target number.
    //  It should find two different items in the array that, when added together, give the target value.
    //  The indices of these items should then be returned in a tuple like so: (index1, index2).
    //For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
    //The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
    // target will always be the sum of two different items from that array).

    public static int[] twoSum(int[] numbers, int target)
    {
        int [] sol = new int [2];
        for(int i = 0;i < numbers.length; i++){
            for(int j = 0;j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    sol[0] = i;
                    sol[1] = j;
                    break;
                }
            }
        }
        return sol;
    }
}
