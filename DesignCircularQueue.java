class MyCircularQueue {

    static int front;
    static int arr[];
    static int rear;
    static int k;

    public MyCircularQueue(int k) {
        

        this.k = k;
        arr = new int[k];
        front = -1;
        rear = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }

        // first element
        if(isEmpty()){
            front = 0;
        }

        rear = (rear + 1) % k;
        arr[rear] = value;
return true;

        
    }
    
    public boolean deQueue() {

        if(isEmpty()){
            return false;
        }

        

        // single element

        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front + 1) % k;
        }

        return true;
        
    }
    
    public int Front() {

        if(isEmpty()){
            return -1;
        }

        return arr[front];
        
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }

       return arr[rear];


        
    }
    
    public boolean isEmpty() {

        return front==-1;
        
    }
    
    public boolean isFull() {

        return (rear+1) % k == front;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
