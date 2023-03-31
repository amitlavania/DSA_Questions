import java.util.*;

public class printinrange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }
    }
    public static void inorder(Node root)
{
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);

}
public static Node insert(Node root , int val)
{
    if(root == null)
    {
        root=new Node(val);
        return root;
    }
    if(root.data>val)
    {
        root.left=insert(root.left,val);
    }
    else
    {
        root.right=insert(root.right,val);
    }
    return root;
}
    public static void printInrange(Node root,int k1,int k2)
    {
        if(root==null)
        {
            return ;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            printInrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInrange(root.right, k1, k2);
        }
        else if(root.data< k1)
        {
            printInrange(root.left, k1, k2);
        }
        else
        {
            printInrange(root.right, k1, k2);
        }
       
    }
    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0; i<path.size(); i++)
        {
            System.out.print(path.get(i) +"->");
        }
        System.out.println("Null");
    }
    public static void printroot2leaf(Node root, ArrayList<Integer> path)
    {   if(root==null){
        return;

    }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            printPath(path);
        }
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i =0;i<value.length;i++)
        {
            root=insert(root,value[i]);
        }
        inorder(root);
        System.out.println();
        // printInrange(root, 5, 20);
        printroot2leaf(root,new ArrayList<>());
       
    
    }
    
}
