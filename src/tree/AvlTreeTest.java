package tree;

public class AvlTreeTest {

	public static void main(String[] args) {
		AvlTree a=new AvlTree();
		a.insert(50);
		a.insert(45);
		a.insert(15);
		a.insert(65);
		a.insert(25);
		a.inorder();
	    a.delete(45);
	    System.out.println();
		a.inorder();
	}

}
