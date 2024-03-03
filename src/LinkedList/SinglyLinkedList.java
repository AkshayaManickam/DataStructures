package LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL sl=new SLL();
        sl.insertLast(10);
        sl.insertLast(20);
        sl.insertLast(30);
        sl.insertLast(40);
        sl.insertLast(50);
        sl.display();
        sl.insertFirst(60);
        sl.insertFirst(70);
        sl.display();
        sl.insert(80,7);
        sl.display();
        sl.deleteFirst();
        sl.display();
        sl.deleteLast();
        sl.display();
        int test=sl.delete(50);
        if(test==1){
            sl.display();
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
class SLL{
    Node head;
    Node tail;
    int size;
    class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    void insertLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    void insertFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head=node;
        }
        size++;
    }
    void insert(int data,int position){
        Node temp=head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        Node node=new Node(data,temp.next);
        temp.next=node;
        size++;
    }
    void deleteFirst(){
        head=head.next;
        size--;
    }
    void deleteLast(){
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    int delete(int data){
        Node temp=head;
        Node prev=null;
        if(temp.data==data && temp!=null){
            head=temp.next;
            return 1;
        }
        while(temp!=null && temp.data!=data){
                prev=temp;
                temp=temp.next;        
        }
        if(temp==null){
            return 0;
        }
        prev.next=temp.next;
        return 1;
    }
    void display(){
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
