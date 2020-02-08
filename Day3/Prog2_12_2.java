package Day3;

public class Prog2_12_2 {

    public static void main(String[] args) {
          double   numResult=Integer.MAX_VALUE;
          int[]    testArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
          //int[] testArray = {};  //Test case # 2
          //int[] testArray = {-1,-2,-3,0};  //Test case # 3
          //int[] testArray = {-1};  //Test case # 3
         
          numResult = sum(testArray);
          if (numResult != Integer.MAX_VALUE)
              System.out.printf("The average of numbers in the array is: %.2f", (numResult/testArray.length));

    }

    static int sum(int[] arrayOfInts) {
          int avgNum=0;
        
          if (arrayOfInts.length < 1) {
                 System.out.println("The String must not be empty");
                 return Integer.MAX_VALUE;
          }

          for (int i=0;i < arrayOfInts.length;i++)
        	  avgNum += arrayOfInts[i];

          return avgNum;

    }
}