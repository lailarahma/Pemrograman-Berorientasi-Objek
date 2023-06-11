import java.util.Scanner;

class Queue {
    int [] queue;
    int maximumSize,front,rear;
    int jumlahItems;
    public Queue(int maximumSize){
        this.maximumSize = maximumSize;
        this.queue = new int[maximumSize];
        this.front = 0;
        this.rear = -1;
        this.jumlahItems = 0;
    }
    public int getSize(){
        return jumlahItems;
    }
    public int getFront(){
        return front;
    }
    public boolean isEmpty(){
        return (jumlahItems == 0);
    }
    public boolean isFull(){
        return (jumlahItems == maximumSize);
    }
    public void enqueue(int data){
        if(!isFull()){
            if(rear == maximumSize-1){
                rear = -1;
            }
            queue[++rear] = data;
            jumlahItems++;
        }
    }
    public int dequeue(){
        int temp = queue[front++];
        if(front == maximumSize){
            front = 0;
        }
        jumlahItems--;
        return temp;
    }
    public void display(){
        if(!isEmpty()){
            for(int i=0;i<jumlahItems;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
}
