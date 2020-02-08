package Day2;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int     numArgs=args.length;
		boolean isDuplicated=false;
		
		System.out.print("Original list: [");
		for (int i=0; i < numArgs; i++) 
		  System.out.print(args[i] + " ");
        System.out.println("]");
        
        System.out.print("List without duplicates: [");
        for (int i=0; i < numArgs; i++) {
        	isDuplicated=false;
        	for (int j=i+1; j < numArgs; j++) {
        		if (args[i].equals(args[j])) {
        			isDuplicated = true;
        			break;
        	    }
        	}
        	if (isDuplicated==false) {
      		  System.out.print(args[i] + " ");
        	}
        	
        }
        System.out.println("]");
	}
}
