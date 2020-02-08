package Day7_Ex1;

public class merge {

	public static void main(String[] args) {
		// merge 2 sorted arrays of ints
        int[] arr1 = {1, 3, 5, 7, 13}; 
        int[] arr2 = {2, 4, 6, 8,9}; 
		int[] arr3 = new int[arr1.length+arr2.length];
        
        myMerge(arr1,0,arr2,0,arr3);
		for (int i=0;i < arr3.length;i++)
			System.out.printf("Array in pos[%d] is: %d \n", i, arr3[i]);
	}
	
	public static void myMerge(int[] arrA, int indexA, int[] arrB, int indexB, int[] arrC){
		
		if (arrA.length == indexA) { //Base case: No more elements in array A
			for (int i=indexB;i < arrB.length;i++)
				arrC[indexA+i] = arrB[i];
			return;
		}
		if (arrB.length == indexB) {//Base case: No more elements in array B
			for (int i=indexA;i < arrA.length;i++)
				arrC[indexB+i] = arrA[i];
			return;
		}
		if (arrA[indexA] < arrB[indexB]) {
			arrC[indexA+indexB] = arrA[indexA];
			indexA++;
			myMerge(arrA,indexA,arrB,indexB,arrC);
		}
		else {
			arrC[indexA+indexB] = arrB[indexB];
			indexB++;
			myMerge(arrA,indexA,arrB,indexB,arrC);
		}
	}
	
	public static int[] myMergeBad(int[] arrA, int[] arrB){
		int[] arrC = new int[arrA.length+arrB.length];
		int[] arrTmp1;
		int[] arrTmp2;
		
		if (arrA.length == 0)
			return arrB;
		if (arrB.length == 0)
			return arrA;
		if (arrA[0] < arrB[0]) {
			arrC[0] = arrA[0];
			arrTmp1 = new int[arrA.length-1];
			for (int i=1;i < arrA.length;i++)
				arrTmp1[i-1] = arrA[i];
			arrTmp2 = myMergeBad(arrTmp1,arrB);
		}
		else {
			arrC[0] = arrB[0];
			arrTmp1 = new int[arrB.length-1];
			for (int i=1;i < arrB.length;i++)
				arrTmp1[i-1] = arrB[i];
			arrTmp2 = myMergeBad(arrA,arrTmp1);
		}
		for (int i=0;i < arrTmp2.length;i++)
			arrC[i+1] = arrTmp2[i];

		return arrC;
		
	}

}
