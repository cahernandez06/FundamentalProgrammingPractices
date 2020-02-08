package Day12_BST;


public class MyBST {
	   /** The tree root. */
	   private BinaryNode root;

		public MyBST() {
			root = null;
		}
		
		public static void main(String[] args) {
			MyBST Bst1 = new MyBST();
			
			Bst1.printTree(0); //Empty
			
			Bst1.insert(15);
			Bst1.insert(12);
			Bst1.insert(9);
			Bst1.insert(56);
			Bst1.insert(1);
			Bst1.insert(16);
			Bst1.insert(19);
			Bst1.insert(22);
			Bst1.insert(3);
			Bst1.insert(100);
			Bst1.insert(2);
			Bst1.insert(25);
			
			System.out.println("Your BST in Inorder:");
			Bst1.printTree(0); //Inorder
			System.out.println("Your BST in Preorder:");
			Bst1.printTree(1); //Preorder
			System.out.println("Your BST in Postorder:");
			Bst1.printTree(2); //Postorder
			
			System.out.printf("Your BST has %d nodes \n", Bst1.countnodes());
			System.out.printf("Your BST has %d leaves \n", Bst1.countleaves());
		}

		/**
		 * Prints the values in the nodes of the tree
		 * in sorted order.
		 */
	    public void printTree( int order ) {
	        if( root == null )
	            System.out.println( "Empty tree" );
	        else
	        	switch (order) {
	        	case 0: printTreeInorder( root );
	        			break;
	        	case 1: printTreePreorder( root );
	        			break;
	        	case 2: printTreePostorder( root );
	        			break;
	        	default: System.out.println("Invalid option to sort BST: "+order);
	        	}
	        System.out.println();
	            
	    }
		/**
		 * Prints the values in the nodes of the tree
		 * in in-order: Left->Visit->Right
		 */
	    private void printTreeInorder( BinaryNode t ){
	        if( t != null ){
	            printTreeInorder( t.left );
	            System.out.printf("%d ", t.element );
	            printTreeInorder( t.right );
	        } // An INORDER Traversal
	    }

		/**
		 * Prints the values in the nodes of the tree
		 * in pre-order: Visit->Left->Right
		 */
	    private void printTreePreorder( BinaryNode t ){
	        if( t != null ){
	            System.out.printf("%d ", t.element );
	        	printTreePreorder( t.left );
	            printTreePreorder( t.right );
	        } // An PREORDER Traversal
	    }
		/**
		 * Prints the values in the nodes of the tree
		 * in post-order: Left->Right->Visit
		 */
	    private void printTreePostorder( BinaryNode t ){
	        if( t != null ){
	        	printTreePostorder( t.left );
	        	printTreePostorder( t.right );
	            System.out.printf("%d ", t.element );
	        } // An POSTORDER Traversal
	    }
	    
	    public int countnodes() {
	    	return countnodes( root );
	    }
	    
	    public int countnodes( BinaryNode t) {
	    	if (t == null)
	    		return 0;
	    	return countnodes(t.left)+countnodes(t.right)+1;
	    }
	    
	    public int countleaves() {
	    	return countleaves( root );
	    }
	    
	    private int countleaves( BinaryNode t) {
	    	if (t == null)
	    		return 0;
	        if( t.left != null || t.right != null){
	        	return countleaves( t.left )+countleaves( t.right ); 
	        } 
	        if (t.left == null && t.right == null)
	        	return 1;
	        return 0;
	    }
	    

	//Assume the data in the Node is an Integer.	

	 public void insert(Integer x) {
			if (root == null) {
				root = new BinaryNode(x, null, null);
	return;
			}
	 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted){
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
						n.right = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.right;
					}
				}
			}

		}
	 

	   private class BinaryNode {
	    	
	        // Constructors
	    	BinaryNode( Integer theElement ){
	        	this( theElement, null, null );
	    	}	

	    	BinaryNode( Integer element, 
	    				BinaryNode left, 
	    				BinaryNode right ){
	        	this.element = element;
	        	this.left = left;
	        	this.right = right;
	    	}
	    	private Integer element;// The data in the node
	    	private BinaryNode left;      // Left child
	    	private BinaryNode right;     // Right child
		}
	}
