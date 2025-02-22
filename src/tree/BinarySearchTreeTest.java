package tree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
//		System.out.println("inorder");
//		tree.inorder();
//		System.out.println("\npostorder");
//		tree.postorder();
//		System.out.println("\npreorder");
//		tree.preorder();
		System.out.println(tree.search(50));
	}

}
