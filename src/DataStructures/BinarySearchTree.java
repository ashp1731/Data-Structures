package DataStructures;

public class BinarySearchTree {

	private Node root;
	
	public void insert(int data) {
		if (root == null)
			root = new Node (data);
		else
			root.insert(data);
	}
	
	public void clear () {
		if (root != null) {
			root.clear(root);
			root = null;
		}
	}
	
	public boolean isEmpty () {
		if (root == null) {
			return true;
		}
		return root.isEmpty();
	}
	
	
	public static void main(String[]args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(50);
		tree.insert(40);
		tree.insert(60);
		tree.insert(45);
		tree.insert(35);
		tree.insert(20);
		tree.insert(42);
		tree.insert(90);
		tree.insert(110);
		tree.insert(100);
		tree.insert(92);
		
		// Search Node
		System.out.println(tree.search(100));
		System.out.println();
		
		System.out.println("Post Order");
		// Post Order traversal
		tree.toStringPostOrder();
		System.out.println();
		
		System.out.println("In Order");
		// In Order Traversal
		tree.toStringInOrder();
		
		// Depth of Binary Tree
		int depth = tree.getHeight();
		System.out.println("Depth of Tree : " + depth);
		
		// Size of Binary Tree
		System.out.println("Size of Tree : " + tree.getSize());
		
//		// Clear the Tree
//		root.clearStatic(root.searchNode(100));
		tree.clear();
		System.out.println("******************************************");
		// In Order Traversal
		tree.toStringInOrder();
		
		// Size of Binary Tree
		System.out.println("Size of Tree : " + tree.getSize());
		
//		 Check if the tree is empty
		System.out.println( "\nNode " + tree.getData() + " is Empty? " + tree.isEmpty());
	}

	private int getData() {
		if (root == null)
			return -1;
		return root.getData();
	}

	private Node searchNode(int i) {
		if (root == null)
			return null;
		return root.searchNode(i);
	}

	private int getSize() {
		if (root == null)
			return 0;
		return root.getSize();
	}

	private int getHeight() {
		if (root == null)
			return 0;
		return root.getHeight();
	}

	private void toStringInOrder() {
		if (root != null)
			root.toStringInOrder();
	}

	private void toStringPostOrder() {
		if (root != null)
			root.toStringPostOrder();
		
	}

	private boolean search(int i) {
		if (root == null)
			return false;
		// TODO Auto-generated method stub
		return root.search(i);
	}
}
	
	

