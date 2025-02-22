package tree;

public class Practice2 {
	
Node root;

int getHeight(Node node) {
	return node==null?0:node.height;
}

int getBalanceFactor(Node node) {
	return node==null?0:getHeight(node.left)-getHeight(node.right);
}

public Node doRightRotation(Node x) {
 Node y=x.left;
 y.right=x;
 x.left=null;
 x.height=Math.max(getHeight(x.left), getHeight(x.right))+1;
 y.height=Math.max(getHeight(y.left), getHeight(y.right))+1;
 return y;
}

public Node doLeftRotation(Node x) {
	 Node y=x.right;
	 y.left=x;
	 x.right=null;
	 x.height=Math.max(getHeight(x.left), getHeight(x.right))+1;
	 y.height=Math.max(getHeight(y.left), getHeight(y.right))+1;
	 return y;
	}

public Node insert(Node root,int key) {
	if(root==null) {
		return new Node(key);
	}
	if(key<root.key) {
		root.left=insert(root.left, key);
	}
	else if(key>root.key) {
		root.right=insert(root.right, key);
	}
	else {
		return root;
	}
	//update height
	root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
	int bf=getBalanceFactor(root);
	//check for rotations
	
	return root;
}

class Node{
	int key,height;
	Node left,right;
	Node(int key){
		this.key=key;
		height=1;
	}
}


}
