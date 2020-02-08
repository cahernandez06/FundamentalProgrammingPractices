package Day10;

public class MyStringLinkedList {

	Node header;
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	public Node add(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		return n;
	}

	private Node getNode(int pos){
		if (pos >= size()) throw new IndexOutOfBoundsException();		
		Node next = header;
		for(int i = 0; i <= pos; ++i){
			next = next.next;			
		}
		//next is the node we are seeking
		return next;
	}
	
	public String get(int pos){
		Node node = getNode(pos);
		return (node != null) ? node.value : null;
	}

	/** returns the index of the String s, if found; 
	 * -1 otherwise 
	 */
	public int find(String s){
		if(s == null) return -1;
		Node currentNode = header;
		int i = -1;
		while(currentNode.next != null){
			++i;
			currentNode = currentNode.next;
			if(s.equals(currentNode.value)) return i;
		}
		return -1;
	}
	
	
	/** remove object at specified index */
	public boolean remove(int index){
		Node toBeRemoved = getNode(index);
		if(toBeRemoved == null) return false;
		Node previous = toBeRemoved.previous;
		Node current = toBeRemoved.next;
		previous.next = toBeRemoved.next;
		if(current != null){
			current.previous = toBeRemoved.previous;
		}
		toBeRemoved = null;
		return true;
	}
	/** remove by specifying object -- removes
	 *  first occurrence of s
	 */
	public boolean remove(String s){
		int pos = find(s);
		if(pos == -1) return false;
		return remove(pos);
		
	}	
	
	public boolean deleteFirst() {
		if (header.next==null)
			return false; //There are no elements, only header
		Node first = header.next;
		header.next = first.next;
		if (first.next != null) //Exists 2nd element
			first.next.previous = header;
		first = null;

		return true;
		//return remove(0);  //an easier way to do it.
	}
	
	public boolean deleteLast() {
		Node last = header.next;
		
		if (header.next==null)
			return false; //There are no elements, only header
		while(last.next != null)
			last = last.next;
		last.previous.next=null;
		last=null;
		return true;
		/*int pos=size();
		 return remove(pos-1); //an easier way to do it. */
	}

	public int size(){
		int count = 0;
		Node next = header.next;
		while(next != null){
			++count;
			next = next.next;
		}
		return count;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		Node next = header.next;
		while(next != null){
			sb.append(next.value+", ");
			next = next.next;
		}
		String ret = sb.toString();
		ret = ret.substring(0,ret.length()-2);
		return (ret +"]");
	}



	public void insert(String s, int pos) {
		//corrected to throw exception
		if(pos > size()) {
			throw new IndexOutOfBoundsException("pos = "+pos +" but size = "+size());
		}
		Node next = header;
		Node previous = null;
		for(int i = 0; i <= pos; ++i){
			if(i==pos){
				previous = next;
			}
			next = next.next;
		}
		Node insertNode = new Node(next,previous,s);
		if(next != null){
			next.previous = insertNode;
		}
		previous.next =insertNode;
	}

	public void addFirst(String s) {
		Node newNode = new Node(null,null,s);
		
		if (header==null) {
			header=newNode;
			return;
		}

		if (header.next!=null) {  //There is a 2nd node
			newNode.next=header.next;
			header.next.previous=newNode;
		}
		header.next=newNode;
		//insert(s,0);   //another easier way to do it
	}

	private void swap(Node s, Node t){
		String temp = s.value;
		s.value = t.value;
		t.value = temp; 
	}

	public void sort(){		
		int size = size();
		if(size<=1) return;
		Node curr = header;
		while(curr.next != null){
			curr = curr.next;
			Node min = minNode(curr);
			//this places the min val in curr,
			//so we do not need to reset value of curr here
			swap(min,curr);
			
		}
		
	}
	
	//find the Node having min value nested inside theNode
	public Node minNode(Node theNode){
		if(theNode == null || theNode.next == null) return theNode;
		String minVal = theNode.value;
		Node minNode = theNode;
		Node currentNode = theNode;
		while(currentNode.next != null){
			currentNode = currentNode.next;
			if(currentNode.value.compareTo(minVal)<0) {
				minVal = currentNode.value;
				minNode = currentNode;
			}
		}
		return minNode;
	}

	/********* end sorting methods ********/
	
	/******** binary search methods ********/
	
	//search a sorted array
	//Note: because locating the middle value in
	//the list takes linear time each time it's performed,
	//binary search for linked lists is no more efficient
	//than the usual find method
	boolean binSearch(String val) {
		boolean b = recurse(0,size()-1, val);
		return b;
	}


	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(get(mid).equals(val)) return true;
		if(a > b) return false;
		if(val.compareTo(get(mid))>0) 
			return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}

	
	class Node  {
		String value;
		Node next;
		Node previous;
		Node(){}
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
		public String toString(){
			return value;

		}
	}

	public static void main(String[]args){
		MyStringLinkedList l = new MyStringLinkedList();
		
		l.add("Bob");
		l.add("Gerald");
		l.add("Thomas");
		l.add("Jim");
		l.add("Jim");
		l.add("Dave");
		l.add("Jim");
		l.add("Ricardo");
		System.out.println(l);
		System.out.println(l.size());
		
		l.sort();
		
		
		if(l.size()>0){
			System.out.println(l);
		}
		
		else{
			System.out.println("empty");
		}
		
		
		l.insert("Bob",0);
		l.insert("Dave",1);
		l.insert("Jim",2);
		l.add("Ricardo");
		System.out.println(l);

		
		System.out.println(l);
		
		
		System.out.println("Size = "+l.size());
		System.out.println("The list = "+l);
		l.insert("Sally",2);
		l.insert("Billy",0);
		System.out.println("Size = "+l.size());
		//System.out.println("The list = "+l);
		//l.sort();
		System.out.println("The list = "+l);
		System.out.println("Found Bob "+l.find("Bob"));
		System.out.println("Found Bobby "+l.find("Bobby"));
		l.remove("Sally");
		System.out.println(l);
		l.remove(0);
		System.out.println(l);

		l.addFirst("Carlos");
		System.out.println(l);
		l.deleteFirst();
		System.out.println(l);
		l.deleteLast();
		System.out.println(l);
		l.addFirst("Monica");
		System.out.println(l);
		
		l.sort();
		System.out.println("List contains Sally?   //"+l.binSearch("Sally"));
		System.out.println("List contains Bob? //"+l.binSearch("Bob"));
				
	}

}


//  Do addFirst,  deletFirst,  deleteLast  for Homework!!


