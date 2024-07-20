package com.stack;

public class StackImpl {
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public StackImpl(int size)
	{
		maxSize = size;
		stackArray = new int[maxSize];
		top=-1;
	}
	
	//push
	
	public void push(int value)
	{
		if(top == maxSize-1)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			stackArray[++top] = value;
		}
	}
	
	//pop
	
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			return stackArray[top--];
		}
	}
	//peek
	public int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			return stackArray[top];
		}
	}
	
	//isEmpty
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	//isFull
	public boolean isFull()
	{
		return (top == maxSize-1);
	}

}
