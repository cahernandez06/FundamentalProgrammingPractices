package Day13_HashTabl;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashtable {
	private static final int INITIAL_SIZE;
	static {
		INITIAL_SIZE=19;
	}
	private int tableSize;
	private LinkedList[] table; 
	
	public MyHashtable(){
		this(INITIAL_SIZE);
	}
	
	public MyHashtable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
	}      // an array of LinkedList objects.
	
	public static void main(String[] args) {
		MyHashtable HashT1 = new MyHashtable();  //Use the default constructor with 19
		LinkedList myTempLL = new LinkedList();
		
		HashT1.put("John Smith", "641-472-1111");
		HashT1.put("Julie Woods","641-472-2222");
		HashT1.put("Carlos Hernandez","57 300 4633523");
		HashT1.put("Tomas Hernandez","57 300 4633524");
		HashT1.put("Monica Diez","57 300 4633525");
		HashT1.put("Soledad Ospina","57 300 4633526");
		HashT1.put("Gustavo Hernandez","57 300 4633527");
		HashT1.put("Nestor Hernandez","57 300 4633528");
		HashT1.put("Cesar Rendon","57 300 4633529");
		HashT1.put("Natalia Hernandez","57 300 4633531");
		
		System.out.println("Your Hash Table (HT looks like: ");
		System.out.println(HashT1.printHT());
		System.out.println("HT # of elements: " + HashT1.countElements());
		System.out.println("Longest chain in HT has : " + HashT1.longestChain()+" elements");
		System.out.println("Empty cells in HT: " + HashT1.emptyCells()+" elements");

		HashT1.put("Natalia Hernandez","57 300 0000000");

	}
	
	public void put(Object key, Object value){
		//disallow null keys
		if(key==null) return;

		//get the "big" integer corresponding to the object
		//assumes key is not null
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM( hashcode);
		
		//put the value and the key into an Entry object
		//which will be placed in the table in the
		//slot ( namely, hash)

		//allows a null value
		Entry e = new Entry(key,value);
		
		// now place it in the table
		if(table[hash] == null){
			table[hash] = new LinkedList();
		}
		else {
			System.out.println("Entry: "+key+" already exists! \n");
			//return;   //enabling this line, produces different lab results, so I let it commented 
		}
		//this allows duplicate keys
		table[hash].add(e);
	}
 
	public Object get(Object key){
		//null key not allowed
		if(key==null) return null;
		//get the "big" integer corresponding to the object
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		
		//now look for the desired Entry
		Entry e = null;


    //First we should make sure that table[hash]
    //is Not null.  If it is null, then the 
    //Entry is Not there.      (JL 11-2009).

		Iterator it = table[hash].iterator();
		while(it.hasNext()){
			e = (Entry)it.next();
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null; // Not found. 
		 
	}
	
 
	public String printHT(){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the LinkedList at table[i]
				Entry next = null;
				while(it.hasNext()){
					next = (Entry)it.next();
					sb.append("table["+i+"] : "+ next + "\n");
				}
			}
		}
		return sb.toString();
	}
	
	public int countElements(){
		int howMany=0;
		
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the LinkedList at table[i]
				Entry next = null;
				while(it.hasNext()){
					next = (Entry)it.next();
					howMany++;
				}
			}
		}
		return howMany;
	}
	
	public int emptyCells(){
		int howMany=0;
		
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the LinkedList at table[i]
				Entry next = null;
				if (!it.hasNext())
					howMany++;
			}
			else howMany++;  //The position is null
		}
		return howMany;
	}
	
	public int longestChain(){
		int howManyxPos=0;
		int longest=0;
		
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the LinkedList at table[i]
				Entry next = null;
				howManyxPos=0;
				while(it.hasNext()){
					next = (Entry)it.next();
					howManyxPos++;
				}
				if (howManyxPos > longest)
					longest=howManyxPos;
			}
		}
		return longest;
	}
	
	public String toString(){
		String n = System.getProperty("line.separator");//a new line
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the
                           //LinkedList at table[i]

				Entry next = null;
				while(it.hasNext()){
					next = (Entry)it.next();
					sb.append(next+n);
				}
			}
		}
		return sb.toString();
	}


//In the java file this method might be called hash
	private int hashM(int bigNum) {
		if (bigNum < 0)
			return (bigNum*-1) % tableSize;
		else
			return bigNum % tableSize;
	}
	
 
private class Entry{
		private Object key;
		private Object value;
		Entry(Object key, Object value){
			this.key = key;
			this.value = value;
		}
		public String toString(){
			return key.toString()+"->"+value.toString();
		}
		
	}
}

 
