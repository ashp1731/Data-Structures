package DataStructures;

// Binary Search tree Example
public class Node {

	private int data;
	private Node leftNode, rightNode;

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		if(data != value) {
			if(value > data) {
				if(rightNode == null) {
				rightNode = new Node(value);
				System.out.println("Right Node " + value + " inserted");
				}
				else {
					rightNode.insert(value);
				}
			}
			
			else if(value < data) {
				if(leftNode == null) {
				leftNode = new Node(value);
				System.out.println("Left Node " + value + " inserted");
				}
				else {
					leftNode.insert(value);
				}
			}
		}
	}
	
	public int search (int value) {
		if(value == data) {
			return this.data;
		}
		else if(value > data && rightNode != null) {
			return rightNode.search(value);
		}
		else if (value < data && leftNode != null) {
			return leftNode.search(value);
		}
		else {
			return 0;
		}
		
	}

	// LRN (Post Order)
	public void toStringPostOrder() {
		if (leftNode != null) {
			leftNode.toStringPostOrder();
		}
		if(rightNode != null) {
			rightNode.toStringPostOrder();
		}
		System.out.println(data);
	}
	
	// LNR (In Order)
	public void toStringInOrder() {
		if (leftNode != null) {
			leftNode.toStringPostOrder();
		}
		System.out.println(data);
		if(rightNode != null) {
			rightNode.toStringPostOrder();
		}
	}
	
	public void clear() {
		if (leftNode != null) {
			leftNode.toStringPostOrder();
		}
		if(rightNode != null) {
			rightNode.toStringPostOrder();
		}
		System.out.println("Deleting : " + data);
		
	}
}
