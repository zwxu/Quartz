package com.ustc.test;
public class StackApp {
	public static void main(String[] args) {
		ArrayStack stack=new ArrayStack(2);
		stack.push(5);
		stack.push(6);
		System.out.print(stack.pop());
		ArrayQueue queue=new ArrayQueue(2);
		queue.push(5);
		queue.push(6);
		System.out.print(queue.pop());
		System.out.print(queue.pop());
		System.out.print(queue.pop());
		//System.out.print(stack.pop());
	}

}
class ArrayQueue{
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nElems;
	public ArrayQueue(int maxSize) {
		super();
		this.maxSize = maxSize;
		queueArray=new long[maxSize];
		front=0;
		rear=-1;
		nElems=0;
	}
	public void push(int i){
		if(isFull())
		{
			throw new RuntimeException("队满");

		}
		queueArray[++rear]=i;
		nElems++;
	}
	public long pop(){
		if(isEmpty())
		{
			throw new RuntimeException("队空");
		}
		long i=queueArray[front++];
		nElems--;
		return i;
	}
	public boolean isEmpty(){
		return (nElems==0);
	}
	public boolean isFull(){
		return (nElems==maxSize);
	}	
}
class ArrayStack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	public ArrayStack(int maxSize) {
		super();
		this.maxSize = maxSize;
		stackArray=new long[maxSize];
		top=-1;
	}
	public void push(long i){
		if(isFull())
		{
			//throw new RuntimeException("栈满");
			pop();
		}
		stackArray[++top]=i;
	}
	public long pop(){
		if(isEmpty())
		{
			throw new RuntimeException("栈空");
		}
		return stackArray[top--];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==maxSize-1);
	}	
}