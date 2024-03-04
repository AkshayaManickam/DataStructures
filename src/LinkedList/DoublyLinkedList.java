package LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL dl=new DLL();
        dl.insertLast(10);
        dl.insertLast(20);
        dl.insertLast(30);
        dl.insertLast(40);
        dl.insertLast(50);
        dl.insertFirst(60);
        dl.insert(90,3);
        dl.display();
        dl.displayReverse();
        dl.deleteLast();
        dl.display();
        dl.deleteFirst();
        dl.display();
        int t=dl.deleteByElement(40);
        if(t==1){
            dl.display();
        }
        else{
            System.out.println("\nElement Not Found");
        }
        int t1=dl.deleteByIndex(3);
        if(t1==1){
            dl.display();
        }
        else{
            System.out.println("\nElement Not Found");
        }
    }
}
class DLL{
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    void insertLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            node.prev=tail;
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
            head.prev=node;
            head=node;
        }
        size++;
    }
    void insert(int data,int position){
        if(position==0){
            insertFirst(data);
        }
        else if(position==size){
            insertLast(data);
        }
        else{
            Node temp=head;
            for(int i=1;i<position-1;i++){
                temp=temp.next;
            }
            Node node=new Node(data);
            node.next=temp.next;
            node.prev=temp;
            temp.next.prev=node;
            temp.next=node;
            size++;
        }
    }
    void deleteLast(){
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    void deleteFirst(){
        head=head.next;
        size--;
    }
    int deleteByElement(int data){
        Node temp=head;
        Node last=null;
        if(temp!=null && temp.data==data){
            head=head.next;
            head.prev=null;
            return 1;
        }
        while(temp!=null && temp.data!=data){
            last=temp;
            temp=temp.next;
        }
        if(temp==null){
            return 0;
        }
        last.next=temp.next;
        size--;
        return 1;
    }
    int deleteByIndex(int index){
        if(index==0){
            deleteFirst();
            return 1;
        }
        else if(index==size){
            deleteLast();
            return 1;
        }
        else{
            Node temp=head;
            Node last=null;
            for(int i=0;i<index-1;i++){
                last=temp;
                temp=temp.next;
            }
            last.next=temp.next;
            size--;
            return 1;
        }
    }
    void displayReverse(){
        System.out.println();
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
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
