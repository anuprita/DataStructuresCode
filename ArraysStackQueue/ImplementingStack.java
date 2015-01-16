package ArraysStackQueue;
import LinkedList.Node;


public class ImplementingStack {
	
	public static void main(String args[])
	{
		// First number 329
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());

}
}
class Stack {
	 Node top;
	
	 int pop() {
	if (top != null) {
	 int item = top.num;
	top = top.next;
	 return item;
	 }
	 return -1;
	 }
	
	 void push(int item)  {
	 Node t = new Node(item) ;
	t.next = top;
	 top = t;
	 }
	
	 int peek(){
	 return top.num;
	 }
	}

