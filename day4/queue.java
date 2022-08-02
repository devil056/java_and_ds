//arrays and linked list both
//enque => push , dequeu
class Queue{

    private int front, rear, capacity;
    private int queue[];
  
    //parameterised constructor
    Queue(int c){
      front = rear=0;
      capacity=c;
      queue=new int [capacity]; //dynamic allocation int array
      
    }
  
    public void enqueue(int data){
      //to check if the queue is full
      if (capacity==rear){
        System.out.println("Queue is full");
        return;
      }
      else{
        queue[rear]=data;
        rear++;
      }
      return;
    }
  
    public void dequeue(){
  
      if (front==rear){ //it is empty
        System.out.println("Queue is empty");
        return;
      }
      else {
           System.out.println("Dequeue is starting");
        for (int i=0;i<rear-1;i++){
          queue[i]=queue[i+1];
        }
  
        if (rear<capacity){
          queue[rear]=0;
        }
  
        rear=rear-1;
      }
      return;
    }
  
    public void print()
    {
      int i;
  
      if (front==rear){
        System.out.println("Queue is empty");
        return;
      }
      for (i=front;i<rear;i++){
        System.out.println("element is"+ queue[i]);
        
      }
      return;
    }
  
  
    
  }
  
  class MainQueue{
  
    public static void main(String args[]){
  
      Queue q=new Queue(4);
  
      q.enqueue(4);
      q.enqueue(40);
      q.enqueue(400);
      q.enqueue(4000);
      q.print();
      q.dequeue();
      q.print();
      
      
      
    }
  }