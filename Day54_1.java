Given a preorder traversal of a tree as an array of integers arr[].
Construct a binary search tree for the above tree.

Note: 
    A binary search tree is a binary tree where for every node, any 
    descendant of Node.left has a value strictly less than Node.val, and 
    any descendant of Node.right has a value strictly greater than Node.val.
     
    A preorder traversal of a binary tree displays the value of the node first, 
    then traverses Node.left, then traverses Node.right.

Your task is to print the level order traversal of binary search tree that
has been constructed using the pre order values of a binary tree.
In the output, all null nodes in the level order traversal are indicated with -1. 

Input Format:
-------------
Line-1: Size of array n
Line-2: Array elements of size n.

Output Format:
--------------
Print the level order traversal


Sample Input-1:
---------------
6
10 6 2 8 12 16

Sample Output-1:
----------------
10 6 12 2 8 -1 16


Sample Input-2:
---------------
3 5

Sample Output-2:
----------------
3 -1 5
import java.util.*;
class Test{
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }
    static class Index{
        int index = 0;
    }
    
    public static Node consTree(int[] arr,int size){
        
        return consTreeutil(arr,inex,0,size-1,size);
    }
    public static Node consTreeutil(int[] arr,int index,int low ,int high,int size){
        if(index >= size || low > high){
            return null;
        }
        Node root = new Node(arr[index]);
        index = index+1;
        int i;
        for(i = 0;i<size;i++){
            if (arr[i] > root.data){
                break;
            }
        }
        root.left = consTreeutil(arr,index,index,i-1,size);
        root.right = consTreeutil(arr,index,i,high,size);
        return root;
    }
    public static void levelOrder(Node root){
        Queue<Node> q1 = new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            int n = q1.size();
            for(int i = 0;i<n;i++){
                Node temp = q1.poll();
                if(temp.left!=null){
                    q1.add(temp.left);
                }
                if(temp.right!=null){
                    q1.add(temp.right);
                }
                System.out.print(temp.data+" ");
                
            }
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0;i< n;i++){
            arr[i]=sc.nextInt();
        }
        Node root = consTree(arr,arr.length);
        System.out.println(root.left.left.data);
       levelOrder(root);
        
    }
}
