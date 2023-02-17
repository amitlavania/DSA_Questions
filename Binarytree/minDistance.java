import java.util.*;
public class minDistance{
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }

    public static Node lca2(Node root,int n1,int n2)
    {
        if(root==null || root.data==n1 || root.data==n2)
        {
            return root;
        }

        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);
        //leftLCA =val rightlca=null
        if(rightLca==null)
        {
            return leftLca;

        }
        if(leftLca==null)
        {
            return rightLca;
        }
        return root;
    }
    public static int lcadist(Node root,int n){
        if(root==null)
        {
            return -1;

        }
        if(root.data==n)
        {
            return 0;
        }
        int leftdist=lcadist(root.left,n);
        int rightdist=lcadist(root.right,n);

        if(leftdist==-1 && rightdist==-1)
        {
            return -1;
        }
        else if(leftdist==-1){

            return rightdist+1;
        }
        else{
            return leftdist+1;
        }
    }

    public static int  minimumdist(Node root,int n1,int n2)
    {
        Node lca=lca2(root,n1,n2);
        int dist1=lcadist(root,n1);
        int dist2=lcadist(root,n2);
        return dist1+dist2;
    }

    public static void main(String[] args) {
        
     Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);     
    root.right.right=new Node(7);
    int n1=4 ,n2=6;
    System.out.println(minimumdist(root, n1, n2));
    }

}