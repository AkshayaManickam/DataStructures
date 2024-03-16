package Stack;

public class DynamicStack extends S1{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    public void push(int data){
        int[] temp=new int[this.data.length*2];
        for(int i=0;i<this.data.length;i++){
            temp[i]=this.data[i];
        }
        this.data=temp;
        super.push(data);
    }
}
