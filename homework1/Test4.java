package test2;

public class Test4 { 
		  
	    /* Class containing left and right child of current node and key value*/
	    class Node { 
	        int key; 
	        Node left, right; 
	  
	        public Node(int item) { 
	            key = item; 
	            left = right = null; 
	        } 
	    } 
	  
	    // Root of BST 
	    Node root; 
	  
	    // Constructor 
	    Test4() {  
	        root = null;  
	    } 
	  
	    // This method mainly calls insertRec() 
	    void insert(int key) { 
	       root = insertRec(root, key); 
	    } 
	      
	    /* A recursive function to insert a new key in BST */
	    Node insertRec(Node root, int key) { 
	  
	        /* If the tree is empty, return a new node */
	        if (root == null) { 
	            root = new Node(key); 
	            return root; 
	        } 
	  
	        /* Otherwise, recur down the tree */
	        if (key < root.key) 
	            root.left = insertRec(root.left, key); 
	        else if (key > root.key) 
	            root.right = insertRec(root.right, key); 
	  
	        /* return the (unchanged) node pointer */
	        return root; 
	    } 
	    
	    void deleteKey(int key) 
	    { 
	        root = deleteRec(root, key); 
	    } 
	  
	    /* A recursive function to insert a new key in BST */
	    Node deleteRec(Node root, int key) 
	    { 
	        /* Base Case: If the tree is empty */
	        if (root == null)  return root; 
	  
	        /* Otherwise, recur down the tree */
	        if (key < root.key) 
	            root.left = deleteRec(root.left, key); 
	        else if (key > root.key) 
	            root.right = deleteRec(root.right, key); 
	  
	        // if key is same as root's key, then This is the node 
	        // to be deleted 
	        else
	        { 
	            // node with only one child or no child 
	            if (root.left == null) 
	                return root.right; 
	            else if (root.right == null) 
	                return root.left; 
	  
	            // node with two children: Get the inorder successor (smallest 
	            // in the right subtree) 
	            root.key = minValue(root.right); 
	  
	            // Delete the inorder successor 
	            root.right = deleteRec(root.right, root.key); 
	        } 
	  
	        return root; 
	    } 

	  
	    // This method mainly calls InorderRec() 
	    void inorder()  { 
	       inorderRec(root); 
	    } 
	    void Maxvalue()
	    {
	    	maxValue(root);
	    	System.out.println(maxValue(root));
	    }
	    void Minvalue()
	    {
	    	minValue(root);
	    	System.out.println(minValue(root));
	    }
	    
	    int minValue(Node root) 
	    { 
	        int minv = root.key; 
	        while (root.left != null) 
	        { 
	            minv = root.left.key; 
	            root = root.left; 
	        } 
	        return minv; 
	    } 
	    
	    int maxValue(Node root)
	    {
	    	int maxv = root.key;
	    	while(root.right != null)
	    	{
	    		maxv = root.right.key;
	    		root = root.right;
	    	}
	    	return maxv;
	    }
	    void inorderRec(Node root) { 
	        if (root != null) { 
	            inorderRec(root.left); 
	            System.out.println(root.key); 
	            inorderRec(root.right); 
	        } 
	    } 
	    public static void main(String[] args) { 
	        Test4 tree = new Test4(); 
	  
	        tree.insert(64); 
	        tree.insert(10); 
	        tree.insert(11); 
	        tree.insert(12); 
	        tree.insert(13); 
	        tree.insert(14); 
	        tree.insert(15);
	        tree.insert(30);
	        tree.insert(65);
	        tree.insert(70);
	        tree.insert(80);
	        tree.insert(90);
	  
	        tree.inorder(); 
	        System.out.println("I am now going to delete 30");
	        tree.deleteKey(30);
	        tree.inorder();
	        tree.Minvalue();
	        tree.Maxvalue();
	    } 
	} 


