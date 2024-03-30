package Queue;

public class DynamicQueue extends Q1{
    DynamicQueue(int size){
        super(size);
    }
    DynamicQueue(){
        super();
    }
    public void insert(int data){
        int[] temp=new int[this.data.length*2];
        for(int i=0;i<this.data.length;i++){
            temp[i]=this.data[i];
        }
        this.data=temp;
        super.insert(data);
    }
}
