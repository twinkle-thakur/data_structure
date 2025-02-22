package tree;

public class Practice {
Node root;

public void traverseInorder(Node root) {
	if(root==null) {
		return;
	}
	System.out.println(root.data);
	traverseInorder(root.left);
	
	traverseInorder(root.right);
}

class Node{
	int data;
	Node left,right;
	public Node(int data) {
		
		this.data = data;
	}
	
}
public static void main(String[] args) {
	Practice p=new Practice();
	Node root=p.new Node(10);
	root.left=p.new Node(50);
	root.right=p.new Node(60);
	root.left.left=p.new Node(15);
	root.left.right=p.new Node(20);
	p.traverseInorder(root);
	//System.out.println(root);
}
}
