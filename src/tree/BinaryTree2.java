package tree;

public class BinaryTree2 {
	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(30);
		root.left.left = new Node(70);
		
		root.right = new Node(40);
		root.right.left = new Node(50);
		root.right.right=new Node(60);
		root.right.left.right = new Node(80);
		System.out.println("InOrder");//70 30 20 50 80 40 60
		Node.traverseInOrder(root);
		System.out.println("\nPreOrder");// 20 30 70 40 50 80 60
		Node.traversePreOrder(root);
		System.out.println("\nPostOrder");// 70 30 80 50 60 40 20
		Node.traversePostOrder(root);

	}


}
