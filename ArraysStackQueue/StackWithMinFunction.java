package ArraysStackQueue;
import LinkedList.Node;


public class StackWithMinFunction {
	Node top;
	
	int pop() 
	{
	if (top != null)
	{
	int item = top.num;
	top = top.next;
	return item;
	}
	return -1;
	}

	public void push(int item)
	{
		 Node t = new Node(item) ;
		t.next = top;
		 top = t;
		
	}

	int peek()
	{
	return top.num;
	}
	int findMinimum()
	{
		 int temp=pop();
		 while(top!=null)
		 {
			//System.out.println(top.num);
		
		 int nextPopped=pop();
		 int a;
		 if(temp>nextPopped)
		 {   
			 a=nextPopped;
			 nextPopped=temp;
			 temp=a;
			 
		 }
		 
		 }
		 return temp;
		 
	}


	
	
		 public static void main(String args[])
			{
				// First number 329
				StackWithMinFunction stack=new StackWithMinFunction();
				stack.push(1);
				stack.push(2);
				stack.push(3);
				stack.push(4);
				//System.out.println(stack.peek());
				//System.out.println(stack.pop());
				//System.out.println(stack.peek());
                //System.out.println(stack.findMinimum());//O(n)
				                                          //O(1) 
		}


}

