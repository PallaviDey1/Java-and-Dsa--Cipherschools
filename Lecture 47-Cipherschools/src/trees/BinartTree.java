package trees;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class BinartTree {
	Node root;
	BinartTree(int data)
	{
		this.root=new Node(data);
	}
	int treeSum(Node root)
	{
		if(root==null)return 0;
		return root.data+treeSum(root.left)+treeSum(root.right);
	}
	int leafNodes(Node root)
	{
		if(root==null)return 0;
		if(root.left==null && root.right==null) return 1;
		return leafNodes(root.left)+leafNodes(root.right);
	}
	public static void main(String[]args) {
		BinartTree bt= new BinartTree(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println(bt.treeSum(bt.root));
		System.out.println(bt.leafNodes(bt.root));
		
	}

}