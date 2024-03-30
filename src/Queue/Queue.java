package Queue;

public class Queue {
    public static void main(String[] args) throws Exception {
        Q1 q=new DynamicQueue();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.display();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.display();
    }
}
class Q1{
    public int[] data;
    public static final int DEFAULT_SIZE = 10;
    int end=0;
    Q1(int size){
        this.data=new int[size];
    }
    Q1(){
        this(DEFAULT_SIZE);
    }
    void insert(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else{
            this.data[end]=data;
            end++;
        }
    }
    void delete() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            int removed=this.data[0];
            for(int i=1;i<end;i++){
                this.data[i-1]=this.data[i];
            }
            end--;
            System.out.println(removed);
        }
    }
    void display() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        for(int i=0;i<end;i++){
            System.out.print(this.data[i]+" ");
        }
        System.out.println();
    }
    boolean isFull(){
        return end==this.data.length;
    }
    boolean isEmpty(){
        return end==0;
    }
}
