package OtherPck9;

	public class FinallyTest{

	    public static void test(boolean throwIt) throws Exception {
	        try {
	            //return;                  // 1
	            // System.exit(0);          // 2
	            if (throwIt) throw new Exception("first");   // 3
	        }
	        catch (Exception x){
				System.out.println(x.getMessage());
	            throw new Exception("second");   // 4
	        }
	        finally {
	            System.out.println("finally!");
	        }
	        System.out.println("last statement");
	    }
	 public static void main(String[] args){
	        try{
	            test(true);
	        }
	        catch(Exception x){
	        		System.out.println(x.getMessage());
		  	  }
	    }
	}
	//0: as is: 
	//finally!
	//last statement
	
	//1: enabling return
	//finally!
	
	//2: enabling exit(0)
	//no output
	
	//3: enabling throw line
	//first
	//finally!
	//last statement
	
	//4: enabling throw line and enabling 4
	//first
	//finally!
	//second