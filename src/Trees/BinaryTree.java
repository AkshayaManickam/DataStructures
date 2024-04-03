package Trees;
import java.util.*;
public class BinaryTree {
    public static void main(String[] args) {
        Scanner am=new Scanner(System.in);
        Tree t=new Tree();
        t.populate(am);
        t.display(t.root);
    }
}
class Tree{
    static Node root;
    class Node{
        int data;
        Node left;
        
        Node right;
        Node(int data){
            this.data=data;

        }
    }
    public void populate(Scanner am){
        System.out.println("Enter the root value:");
        int element=am.nextInt();
        root=new Node(element);
        populate(am,root);
    }
    private void populate(Scanner am,Node node){
        System.out.println("Enter true to insert a node to left of "+node.data);
        boolean res=am.nextBoolean();
        if(res){
            System.out.println("Enter the left value of :"+node.data);
            int element=am.nextInt();
            node.left=new Node(element);
            populate(am,node.left);
        }
        System.out.println("Enter true to insert a node to right of "+node.data);
        boolean res1=am.nextBoolean();
        if(res1){
            System.out.println("Enter the right value of :"+node.data);
            int element=am.nextInt();
            node.right=new Node(element);
            populate(am,node.right);
        }
    }
    public void display(){
        display(root);
    }
    public void display(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data+" ");
        display(node.left);
        display(node.right);
    }
}
