package tree;

import tree.Practice2.Node;

public class BinarySearchTree {
	class Node{
	public Node left;
	public int data;
	public Node right;
	public Node(int data) {
		this.data = data;
	}
	}
	Node root;
	public Node insertHelper(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		else if(data<root.data) {
			root.left=insertHelper(root.left,data);
		}
		else {
			root.right=insertHelper(root.right,data);
		}
		return root;
	}
	public void insert(int data) {
		root=insertHelper(root,data);
	}
	public Node searchHelper(Node root,int data) {
		if(root==null||root.data==data) {
			return root;
		}
		else if(data<root.data) {
			return searchHelper(root.left, data);
		}
		return searchHelper(root.right, data);
	}
	public boolean search(int data) {
		return searchHelper( root, data)!=null;
	}
	public void inorder() {
		traversalInorder(root);
	}
	public void traversalInorder(Node root) {
		if(root==null) {
			return;
		}
		traversalInorder(root.left);
		System.out.print(root.data+" ");
		traversalInorder(root.right);
	}
	public void preorder() {
		traversalpreorder( root);
	}
	public void traversalpreorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		traversalInorder(root.left);
		traversalInorder(root.right);
	}
	public void postorder() {
		traversalpostorder(root);
	}
	public void traversalpostorder(Node root) {
		if(root==null) {
			return;
		}
		
		traversalInorder(root.left);
		traversalInorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public void delete(int data) {
		root=deleteHelper(root, data);
	}
	public Node deleteHelper(Node root,int data) {
		if(root==null) {
			return root;
		}
		if(data<root.data)
			root.left= deleteHelper(root.left,data);
		else if(data>root.data)
			root.right= deleteHelper(root.right,data);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=getMaxH(root);
			root.left=deleteHelper(root.left, root.data);
		}
		return root;
	}
	
	//void max() {
//	int maxVal=getMaxH(root);
//	System.out.println(maxVal);
//}
public int getMaxH(Node root) {
	int maxValue=0;
	Node max=root.left;
	while(max!=null) {
		maxValue=max.data;
		max=max.right;
	}
	
	return maxValue;
	
}
}
