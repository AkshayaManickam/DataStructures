package Stack;

public class Stack {
    public static void main(String[] args) {
        S1 s=new DynamicStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }

}
class S1{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    S1(){
        this(DEFAULT_SIZE);
    }
    S1(int size){
        this.data=new int[size];
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        ptr++;
        this.data[ptr]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Can't pop from a empty stack");
        }
        return this.data[ptr--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Can't pop from a empty stack");
        }
        return this.data[ptr];
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public boolean isFull(){
        return ptr==this.data.length-1;
    }
}