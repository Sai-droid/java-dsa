import java.util.*;

class BinaryTreeCountFullNodes {
 
// A binary tree Node has data, pointer to left
// child and a pointer to right child
static class Node
{
    int data;
    Node left, right;
}
 
// Function to get the count of full Nodes in
// a binary tree
static int getfullCount(Node root)
{
    if (root == null)
    return 0;
 
    int res = 0;
    if (root.left != null && root.right != null)
    res++;
 
    res += (getfullCount(root.left) + getfullCount(root.right));
    return res;
}
 
/* Helper function that allocates a new
Node with the given data and NULL left
and right pointers. */
static Node newNode(int data)
{
    Node node = new Node();
    node.data = data;
    node.left = null;
    node.right = null;
    return (node);
}
 
// Driver program
public static void main(String[] args)
{
    /* 2
    / \
    7 5
    \ \
    6 9
    / \ /
    1 11 4
    Let us create Binary Tree as shown
    */
 
    Node root = newNode(2);
    root.left = newNode(7);
    root.right = newNode(5);
    root.left.right = newNode(6);
    root.left.right.left = newNode(1);
    root.left.right.right = newNode(11);
    root.right.right = newNode(9);
    root.right.right.left = newNode(4);
 
    System.out.println(getfullCount(root));
 
}
}