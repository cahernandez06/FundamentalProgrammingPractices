package Day4_Ex3;

public class MyStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}
	
	private static final int MAXARRSIZE=2;
	private static String[] strArray;
	private static int size; 
	private static int removed;
	private static int numResizes;
	
	MyStringList(){
		size = 0;
		removed = 0;
		numResizes = 1;
		strArray = new String[MAXARRSIZE];
		
	}
	
	public void add(String s) {
		if (size+removed == MAXARRSIZE*numResizes)  //array is full, resize
			resize();
		
		strArray[size]=s;
		size++;
	}
	
	public String get(int i) {
		if (i < 0 || i >= MAXARRSIZE*numResizes)
			return null;
		return strArray[i];
	}
	
	public boolean find(String s) {
		boolean sFound=false;
		
		for (int i=0; i < size;i++) {
			if (strArray[i].equals(s)) { //first ocurrence of s
				sFound=true;
				strArray[i]=null;
				break;
			}
		}
		return sFound;
	}
	
	public boolean remove(String s)	{
		boolean sFound=false;
		
		if (size < 1)
			return false; //Empty array
		
		for (int i=0; i < size;i++) {
			if (strArray[i].equals(s)) { //first ocurrence of s
				sFound=true;
				strArray[i]=null;
				removed++;
				break;
			}
		}
		return sFound;

	}
	
	public String toString() {
		String strConcat="[";
		
		for (int i=0;i < size;i++)
			if (strArray[i] != null)
				strConcat += strArray[i] + ((i != size-1)?", ":"");
		strConcat += "]";
		return strConcat;
	}
	
	public int size() {  //real number of strings in array, no empty positions
		return size-removed;
	}
	
	private void resize() {
		String[] newStr = new String[MAXARRSIZE*++numResizes];
		
		System.out.println("Resizing...");
		System.arraycopy(strArray, 0, newStr, 0, size);
		strArray = newStr;
	}
	
}
