package Day3;

public class Prog2_12_1 {

    public static void main(String[] args) {
          int   numResult=Integer.MAX_VALUE;
          int[] testArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
          //int[] testArray = {};  //Test case # 2
          //int[] testArray = {-1,-2,-3,0};  //Test case # 3
          //int[] testArray = {-1};  //Test case # 3

          numResult = min(testArray);
          if (numResult != Integer.MAX_VALUE)
              System.out.println("The minimum number of the array is: " + numResult);
    }

    static int min(int[] arrayOfInts) {
          int minNum=Integer.MAX_VALUE;

          if (arrayOfInts.length < 1) {
                 System.out.println("The String must not be empty");
          }

          for (int i=0;i < arrayOfInts.length;i++) {
                 if (arrayOfInts[i] < minNum)
             minNum = arrayOfInts[i];
          }
          return minNum;
    }
}