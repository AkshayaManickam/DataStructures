package Stack;

public class Stack {
    public static void main(String[] args) throws StackException {
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
        S1 s1=new S1(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
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
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty!!");
        }
        return this.data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty!!");
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