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
		if (data != value) {
			if (value > data) {
				if (rightNode == null) {
					rightNode = new Node(value);
					System.out.println("Right Node " + value + " inserted");
				} else {
					rightNode.insert(value);
				}
			}

			else if (value < data) {
				if (leftNode == null) {
					leftNode = new Node(value);
					System.out.println("Left Node " + value + " inserted");
				} else {
					leftNode.insert(value);
				}
			}
		}
	}

	public boolean search(int value) {
		if (value == data) {
			return true;
		} else if (value > data && rightNode != null) {
			return rightNode.search(value);
		} else if (value < data && leftNode != null) {
			return leftNode.search(value);
		} else {
			return false;
		}

	}

	// LRN (Post Order)
	public void toStringPostOrder() {
		if (leftNode != null) {
			leftNode.toStringPostOrder();
		}
		if (rightNode != null) {
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
		if (rightNode != null) {
			rightNode.toStringPostOrder();
		}
	}

	public void clear(Node node) {
		
		if (leftNode != null) {
			System.out.println("Deleting Node : " + leftNode.getData() );
			clear(leftNode);
			
		}
		else {
			System.out.println("Deleting Node : " + node.getData() );
			node = null;
		}
		
		if(rightNode != null) {
			System.out.println("Deleting Node : " + rightNode.getData() );
			clear(rightNode);
			
		}else {
			System.out.println("Deleting Node : " + node.getData() );
			node = null;
		}
	}
	
		
		
	

	public int getHeight() {
		if (data == 0) {
			return 0;
		} else {

			int lHeight = 0;
			int rHeight = 0;

			if (leftNode != null) {
				lHeight = leftNode.getHeight();
			}

			if (rightNode != null) {
				rHeight = rightNode.getHeight();
			}

			return Math.max(lHeight, rHeight) + 1;
		}
	}

	public int getSize() {
		if (data == 0) {
			return 0;
		} else {
			int lSize = 0;
			int rSize = 0;

			if (leftNode != null) {
				lSize = leftNode.getSize();
			}

			if (rightNode != null) {
				rSize = rightNode.getSize();
			}
			return lSize + rSize + 1;
		}
	}
	
	public boolean isEmpty() {
		if(data == 0) {
			return true;
		}
		else {
			if (leftNode == null && rightNode == null) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
