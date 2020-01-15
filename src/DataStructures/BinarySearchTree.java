package DataStructures;

public class BinarySearchTree {

	private Node root;
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public static void main(String[]args) {
		Node root = null;
		
		if(root == null) {
			root = new Node(50);
			root.insert(40);
			root.insert(60);
			root.insert(45);
			root.insert(35);
			root.insert(20);
			root.insert(42);
			root.insert(90);
			root.insert(110);
			root.insert(100);
		}
		
		// Search Node
		System.out.println(root.search(100));
		System.out.println();
		
		// Post Order traversal
		root.toStringPostOrder();
		System.out.println();
		
		// In Order Traversal
		root.toStringInOrder();
	}
}
	
	

