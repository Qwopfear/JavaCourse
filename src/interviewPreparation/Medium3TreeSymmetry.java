package interviewPreparation;

public class Medium3TreeSymmetry  {
    public static void main(String[] args) {
        int [] ints = {1,2,2,3,4,4,3,5,6,-1,-1,-1,-1,6,5};
        try {
            System.out.println(treeSym(ints));
        } catch (EmptyTreeException e) {
            e.printStackTrace();
        }
    }
    public static boolean isPalindrome(int[] ints,int start,int length){
        boolean isPalindrome = true;
        System.out.println("is pal called");
        for (int i = 0; i <= length/2 - 1; i++) {
            System.out.println(ints[i + start] + " vs " + ints[length - 1 - i]);
            if (ints[i + start] != ints[length - 1 - i]){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static boolean treeSym(int[] tree) throws EmptyTreeException {
       int start = 1;
       int length = 3;
       boolean isSymmetric = true;
        while (start < tree.length){
            isSymmetric = isPalindrome(tree,start,length);
            if (!isSymmetric){
                break;
            }
            start = length;
            length = length * 2 + 1;
        }
        return  isSymmetric;
    }

}


class EmptyTreeException extends Exception{
    public EmptyTreeException(){
        System.out.println("Tree can`t be empty");
    }
}