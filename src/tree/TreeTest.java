package tree;

public class TreeTest {
	public static void main(String[] args) {
		Node root = new Node().init();
		Node.sort(root);
		
		//System.out.println("git test");
		//System.out.println("local test git");
		//System.out.println("local test git");
		//System.out.println("git test");
		//System.out.println("git test");
	}
}

class Node {
	private char value;
	private Node leftNode;
	private Node rightNode;
	
	public Node init() {
		Node D = new Node('D', null, null);
		Node E = new Node('E', null, null);
		Node B = new Node('B', D, E);
		Node F = new Node('F', null, null);
		Node C = new Node('C', F, null);
		Node A = new Node('A', B, C);
		return A;
	}
	public static void sort(Node node) {
		if (node != null) {
//			System.out.println(node.getValue());
			if (node.getLeftNode() != null) {
				sort(node.getLeftNode());
			}
//			System.out.println(node.getValue());
			if (node.getRightNode() != null) {
				sort(node.getRightNode());
			}
			System.out.println(node.getValue());
		}
	}
	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
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
	public Node(char value, Node leftNode, Node rightNode) {
		super();
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	public Node() {
		super();
	}
	
}
