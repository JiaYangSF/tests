package sdsu.ds.sort;

class Node{
	int data; 
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
	}
}

public class BinaryTree {
	public void add(int data, Node node) {
		if(data > node.data) {
			if(node.right == null) {
				node.right = new Node(data);
				return;
			}
			add(data, node.right);
		}
		
		if(data == node.data) {
			return;
		}
		
		if(data < node.data) {
			if(node.left == null) {
				node.left = new Node(data);
				return;
			}
			else add(data, node.left);
		}
	}
}
