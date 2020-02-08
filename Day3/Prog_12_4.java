package Day3;

public class Prog_12_4 {
 
       public static void main(String[] args) {
           /*Case 2:
           int[][] numMat = {
                           {-1,2,7,-22,3,5},
                           {0,-4,12,23,-2,8},
                           {8,32,65,1,-1,-1}
             };*/
           /*Case 2: 
           int[][] numMat = {
                         {Integer.MAX_VALUE,2,7,-22,3,5},
                         {0,-4,12,23,-2,8},
                         {8,32,65,1,-1,-1}
           };
             /*Case 3: */
             int[][] numMat = {
                           {10000,10000,10000,10000,10000,10000},
                           {11000,11100,11200,11300,11400,11500},
                           {12100,12321,12544,12769,12996,13225}
             };

             double  sumNums=0;
 
             //Average of rows
             System.out.println("=====================Average of rows:====================");
             for (int i=0;i < numMat.length;i++) {
            	 sumNums=sum(numMat[i]);
            	 if ( sumNums != Integer.MAX_VALUE)
            		 System.out.printf("The average of row # %d in the matrix is: %.2f \n",i,sumNums/numMat[i].length);
            	 else 
            		 System.out.printf("No data in row %d",i);
             }

       
             //Average of columns
             System.out.println("===================Average of columns:===================");
             for (int i=0;i < numMat[0].length;i++) {
            	 int[] verticalStr=new int[numMat.length];  //Better if is not an square matrix
 
            	 for (int j=0; j < numMat.length;j++) {
                    verticalStr[j]=numMat[j][i];
             }
             sumNums=sum(verticalStr);
             if ( sumNums != Integer.MAX_VALUE)
                 System.out.printf("The average of column # %d in the matrix is: %.2f \n",i,sumNums/numMat.length);
             else 
            	 System.out.printf("No data in col %d",i);
             }
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