package test2;
import java.util.*;

class Node 
{ 
    String key; 
    Node left, right; 
  
    public Node(String item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
class Test3 
{ 
    Node root; 
    Test3() 
    { 
        root = null; 
    } 
    void printPostorder(Node node) 
    { 
        if (node == null) 
            return; 
        printPostorder(node.left); 
        printPostorder(node.right); 
        System.out.print(node.key + " "); 
    } 
    void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(node.key + " "); 
        printInorder(node.right); 
    } 
    void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
        System.out.print(node.key + " "); 
        printPreorder(node.left); 
        printPreorder(node.right); 
    } 
    void printPostorder()  {     printPostorder(root);  } 
    void printInorder()    {     printInorder(root);   } 
    void printPreorder()   {     printPreorder(root);  } 

    public static void main(String[] args) 
    { 
    	String first = "F";
    	String second = "B";
    	String third = "A";
    	String fourth = "D";
    	String fifth = "E";
    	String sixth = "C";
    	String seventh = "G";
    	String eigth = "I";
    	String ninth = "H";
        Test3 tree = new Test3(); 
        tree.root = new Node(first); 
        tree.root.left = new Node(second); 
        tree.root.right = new Node(seventh);
        tree.root.right.right = new Node(eigth);
        tree.root.right.right.left = new Node(ninth);
        tree.root.left.left = new Node(third); 
        tree.root.left.right = new Node(fourth); 
        tree.root.left.right.left = new Node(sixth);
        tree.root.left.right.right = new Node(fifth);
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
    } 
} 


