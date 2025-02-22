package tree;

public class AvlTree {
	private Node root;
 class Node{
	 int key,height;
	 Node left,right;
	 Node(int key){
		 this.key=key;
		 height=1;
	 }
 }
int getHeight(Node node) {
	return node==null?0:node.height;
}
int height() {
	return getHeight(root);
}
int getBalanceFactor(Node node) {
	return node==null?0:getHeight(node.left)-getBalanceFactor(node.right);
}
int balanceFactor() {
	return getBalanceFactor(root);
}
Node doRightRotation(Node y) {
	Node x=y.left;
	Node t=x.right;
	//performing rotations 
	x.right=y;
	y.left=t;
//now root will be xx after rotation
//before returning root we have to update height
//update childs height 1st 
	y.height=Math.max(getHeight(y.left),getHeight(y.right))+1;
	x.height=Math.max(getHeight(x.left),getHeight(x.right))+1 ;
	return x;
}
void rightRotaion() {
	root=doRightRotation(root);
}
Node doLeftRotation(Node y) {
	Node x=y.right;
	Node t=x.left;
	x.left=y;
	y.right=t;
	y.height=Math.max(getHeight(y.left),getHeight(y.right))+1;
	x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;
	return x;
}
 Node insert(Node root,int key) {
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
	 //updating height
	 root.height=Math.max(getHeight(root.left), getHeight(root.right))+1;
	 int bf=getBalanceFactor(root);
	//case 1:LL
	 //clock wise(right rotation)
	 if(bf>1&&key<root.left.key) {
		return doRightRotation(root);
	 }
	 //case 2:RR
	 //anti clock wise(left rotation)
	 if(bf<-1&&key>root.right.key) {
		return doLeftRotation(root); 
	 }
	 //case 3:LR
	 //left rotation 1st then right rotation
	 if(bf>1&&key>root.left.key) {
		 root.left=doLeftRotation(root);
		 return doRightRotation(root);
	 }
	 //case 4:RL
	 //right rotation 1st then left rotation
	 if(bf<-1&&key<root.right.key) {
		 root.right=doRightRotation(root);
		 return doLeftRotation(root);
	 }
	 return root;
 }
 void insert(int key) {
	 root=insert(root, key);
 }
 
 //deletion code
 
 public Node dltHelper(Node root,int key) {
	 if(root==null) return root;
	 //0 child
	 if(key<root.key) root.left=dltHelper(root.left, key);
	 else if(key>root.key) root.right=dltHelper(root.right, key);
	 else {
	 //1 child
		 if(root.left==null) return root.right;
		 if(root.right==null) return root.left;
		 
	//2 child
		 root.key=getMax(root);
		 root.left=dltHelper(root.left,root.key);
	 }
	 
	 //updating hegiht
	 
	 root.height=Math.max(getHeight(root.left), getHeight(root.right))+1;
	 
	 //check balance factor
	 int bf=getBalanceFactor(root);
	 
	 //case 1:LL
	 if(bf>1&&key<root.left.key) {
		 return doRightRotation(root);
	 }
	 //case 2:LR
	 if(bf>1&&key>root.left.key) {
		 root.left=doLeftRotation(root);
		 return doRightRotation(root);
	 }
	//case 3:RR
	 if(bf<-1&&key>root.right.key) {
		 return doLeftRotation(root);
	 }
	 //case 4:RL
	 if(bf<-1&&key<root.right.key) {
		 root.right=doRightRotation(root);
		 return doLeftRotation(root);
	 }
	return root;
	 
 }
 
 public void delete(int key) {
	 root=dltHelper(root, key);
 }
 public int getMax(Node root) {
	 int max=root.key;
	 Node maxVal=root.left;
	 while(maxVal!=null) {
		 max=maxVal.key;
		 maxVal=maxVal.right;
	 }
	return max;
	 
 }
  public void inOrderTraversal(Node root) {
	  if(root==null) {
		  return ;
	  }
	  inOrderTraversal(root.left);
	  System.out.print(root.key+" ");
	  inOrderTraversal(root.right);
  }
  void inorder() {
	  inOrderTraversal(root);
  }
}
