public class Main
{
	public static void main(String[] args) {
		QueueImp qu = new QueueImp();
		
		qu.enque(10);
		qu.enque(20);
		qu.enque(30);
		qu.enque(40);
		qu.enque(50);
		qu.display();
		
		qu.enque(60);
		
		qu.deque();
		qu.deque();
		qu.deque();
		qu.display();
		
		qu.enque(60);
		qu.display();
		
		qu.deque();
		qu.deque();
		qu.deque();
		qu.deque();
	}
}

class QueueImp {
    int N = 5, front = -1, rear = -1;
    int[] q = new int[N];
    
    void enque(int x) {
        if(front == -1 && rear == -1) {
            front = rear = 0;
            q[rear] = x;
        }
        else if((rear + 1) % N == front)
            System.out.println("Queue is FULL\n");
        else {
            rear = (rear + 1) % N;
            q[rear] = x;
        }
    }
    
    void deque() {
        if(front == -1 && rear == -1)
            System.out.println("Queue is EMPTY\n");
        else if(front == rear)
            front = rear = -1;
        else 
            front = (front + 1) % N;
    }
    
    void display() {
        if(front == -1 && rear == -1)
            return;
            
        for(int i=front; i!=rear; i=(i+1)%N)
            System.out.print(q[i] + " ");
        
        System.out.println(q[rear] + "\n");
    }
}


