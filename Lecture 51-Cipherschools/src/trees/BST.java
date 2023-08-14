package trees;

class BSTNode
{
    int data;
    BSTNode left;
    BSTNode right;
    BSTNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST{
    BSTNode root;

    BST()
    {
        root = null;
    }

    BST(int data)
    {
        this.root = new BSTNode(data);
    }
    
    BSTNode search(BSTNode root, int data)
    {
        if(root == null) return null;
        if(root.data == data) return root;
        if(data<root.data)
        {
             return search(root.left, data);
        }
        else
        {
             return search(root.right, data);
        }
    }
    
    boolean searchItr(BSTNode root,int data)
    {
    	if(root == null)return false;
    	while(root!=null)
    	{
    	if(data==root.data)
    		
    		
    	{
    		return true;
    	}
    	else if(data<root.data)
    	{
    		root=root.left;
    	}
    	else
    	{
    		root=root.right;
    	}
    }
    	return false;
    }
    BSTNode insert(BSTNode root, int data)
    {
        if(root == null) 
        	{
        	return new BSTNode(data);
        	}
        
        if(data<root.data)
        {
        	root.left=insert( root.left,data);
        }
        else
        {
             root.right =insert(root.right, data);
        }
        return root;
    }
    int getMin(BSTNode root)
    {
    	if(root==null)return -1;
    	while(root.left!=null)
    	{
    		root=root.left;
    	}
    	return root.data;
    	
    	
    }
    int getMax(BSTNode root)
    {

    	if(root==null)return -1;
    	while(root.right!=null)
    	{
    		root=root.right;
    	}
    	return root.data;
    	
    	
    	
    }


    public static void main(String[] args)
    {
        BST bst = new BST(15);
        bst.root=bst.insert(bst.root,10 );
        bst.root=bst.insert(bst.root,20 );
        bst.root=bst.insert(bst.root,8 );
        bst.root=bst.insert(bst.root,12);
        bst.root=bst.insert(bst.root,17 );
        bst.root=bst.insert(bst.root,25 );
        
  
       // bst.root.left = new BSTNode(10);
       // bst.root.right = new BSTNode(20);
       // bst.root.left.left = new BSTNode(8);
       // bst.root.left.right = new BSTNode(12);
       
       // bst.root.right.left = new BSTNode(17);
       // bst.root.right.right = new BSTNode(25);
        BSTNode res = bst.search(bst.root, 21);
        System.out.println(res);
        System.out.println(bst.searchItr(bst.root, 12));
        System.out.println(bst.searchItr(bst.root, 25));
        System.out.println(bst.searchItr(bst.root, 48));
        System.out.println(bst.getMin(bst.root));
        System.out.println(bst.getMax(bst.root));
    }
}