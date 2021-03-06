package Day16_StdExamProb1;


public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() throws IllegalStateException {
		//implement
		String str1;
		//IllegalStateException e = new IllegalStateException(); //Other way to do it
		
		if (this.isEmpty())  //to check if exists one node different to header.
			throw new IllegalStateException();
		if (header.next.next==null) //There is no 1 Node to delete
			throw new IllegalStateException();
		Node one = header.next.next;
		str1 = one.value;
		if (one.next!=null) {         //There is 3rd node.
			one.next.previous = one.previous;
			one.previous.next = one.next;
		}
		else
			one.previous.next=null;  //zero node will be the last node in list
		one = null;
		return str1;
	}
	
	public boolean isEmpty() {
		//Done
		if (header==null)
			return true;
		if (header.next==null)
			return true;
		return false;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Bill");
		list.addLast("Tom");
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		System.out.println(list);

	}
}
