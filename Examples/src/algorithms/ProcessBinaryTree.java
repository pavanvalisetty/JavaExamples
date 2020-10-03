package algorithms;

import java.util.LinkedList;
import java.util.Queue;

/* Class containing left and right child of current 
node and key value*/
class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

//A Java program to introduce Binary Tree 
class BinaryTree {
	// Root of Binary Tree
	Node root;

	// Constructors
	BinaryTree(int key) {
		root = new Node(key);
	}

	BinaryTree() {
		root = null;
	}

	static void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	static void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	static void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	// Maximum depth
	static int maxDepth(Node node) {
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	static Node getDeepestLeftLeafNode(Node root) 
	{ 
	    if (root == null) 
	        return null; 
	  
	    // create a queue for level order traversal 
	    Queue<Node> q = new LinkedList<>(); 
	    q.add(root); 
	  
	    Node result = null; 
	  
	    // traverse until the queue is empty 
	    while (!q.isEmpty())  
	    { 
	        Node temp = q.peek(); 
	        q.remove(); 
	  
	        // Since we go level by level, the last  
	        // stored left leaf node is deepest one, 
	        if (temp.left != null)  
	        { 
	            q.add(temp.left); 
	            if (temp.left.left == null && 
	                temp.left.right == null) 
	                result = temp.left; 
	        } 
	          
	        if (temp.right != null) 
	            q.add(temp.right); 
	    } 
	    return result; 
	} 
}

public class ProcessBinaryTree {
	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPostorder(tree.root);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder(tree.root);

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder(tree.root);
		// Maximum depth
		System.out.println(" Maximum depth:" + BinaryTree.maxDepth(tree.root));
		
		Node result = BinaryTree.getDeepestLeftLeafNode(tree.root); 
	    if (result != null) 
	        System.out.println("Deepest Left Leaf Node :: " +  
	                                            result.key); 
	    else
	        System.out.println("No result, " +  
	                   "left leaf not found"); 
	    } 

}