package sdsu.ds.sort;

public class TreeRotation<E> {
	//RightRotation
	private Node rightRotate(Node node){
		Node temp = node.left;
		node.left=temp.right;
		temp.right=node;
		return temp;
	}
	
	private Node leftRotate(Node node) {
		Node temp = node.right;
		node.right = temp.left;
		temp.left=node;
		return temp;
	}
	
	private Node rightLeftRotate(Node node) {
		node.right=rightRotate(node.right);
		return leftRotate(node);
	}
	
	private Node leftRightRotate(Node node) {
		node.left=leftRightRotate(node.left);
		return rightRotate(node);
	} 

}
