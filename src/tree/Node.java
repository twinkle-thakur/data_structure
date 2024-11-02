package tree;

public class Node {

	public Node left;
	public int data;
	public Node right;

	public Node(int data) {
		this.data = data;
	}

	public static void traverseInOrder(Node root) {
		if (root == null) {
			return;
		}

		traverseInOrder(root.left);
		System.out.print(root.data + " ");
		traverseInOrder(root.right);

	}

	public static void traversePreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traversePreOrder(root.left);
		traversePreOrder(root.right);

	}

	public static void traversePostOrder(Node root) {
		if (root == null || root == null) {
			return;
		}
		traversePostOrder(root.left);
		traversePostOrder(root.right);
		System.out.print(root.data + " ");

	}

}
