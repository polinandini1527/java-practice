public class Main
{
	public static void main(String[] args) {
		StackImp st = new StackImp();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();
		
		st.push(60);
		
		st.pop();
		st.pop();
		st.pop();
		st.display();
		
		st.peek();
		st.stackSize();
		
		st.push(30);
		st.push(40);
		st.push(50);
		
		if(st.isFull() == 1)
		    System.out.println("Stack is FULL\n");
		else    
		    System.out.println("Stack is NOT FULL\n");
	    
	    st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		if(st.isEmpty() == 1)
		    System.out.println("Stack is EMPTY\n");
		else    
		    System.out.println("Stack is NOT EMPTY\n");
	    
	    st.pop();
	}
}

class StackImp {
    int N = 5;
    int[] s = new int[N];
    int top = -1;
    
    void push(int x) {
        if(top == N-1)
            System.out.println("Stack Overflow\n");
        else
            s[++top] = x;
    }
    
    void pop() {
        if(top == -1)
            System.out.println("Stack Underflow\n");
        else 
            top--;
    }
    
    void peek() {
        if(top == -1)
            System.out.println("Stack is EMPTY\n");
        else
            System.out.println("Top element : " + s[top]);
    }
    
    int isEmpty() {
        if(top == -1)
            return 1;
        return 0;
    }
    
    int isFull() {
        if(top == N-1)
            return 1;
        return 0;
    }
    
    void stackSize() {
        System.out.println("Stack Size : " + (top+1));
    }
    
    void display() {
        for(int i=top; i>=0; i--)
            System.out.print(s[i] + " ");
        
        System.out.println("\n");
    }
}

