import java.util.Scanner;

interface StackIntADT {
	public void push(int element);
	public int pop();
	public int peek();
	public boolean isEmpty();
	public boolean isFull();
	public int size();
}


public class ArrayStack implements StackIntADT
{
	// fields
	private static int DEFAULT_SIZE = 10;
	private int stackPointer;
	private int[] myStack;
	private int size;

	// constructors
	public ArrayStack()
	{
		myStack = new int[DEFAULT_SIZE];
	}

	public ArrayStack(int size)
	{
		if(size > 0)
		{
			myStack = new int[size];
			stackPointer = -1;
		}
	}

	// stack class methods
	//add an element to the stack
	public void push(int element)
	{
		//if(stackPointer == myStack.length)
		if(isFull()==true)
		{

		}
		else myStack[stackPointer]=element;
	}

	//take an element off the stack
	public int pop() {
		if(isEmpty()==true)
		{

		}
		return(stackPointer--);


	}

	//access the element specified
	public int peek() {
		if (stackPointer == -1)
		{
			return -1;

		}
		else return myStack[stackPointer];

	}


	//check if the stack is empty
	public boolean isEmpty()
	{
		return (stackPointer == -1);
	}

	//check if the stack is full
	public boolean isFull()
	{
		if(stackPointer==size-1) return true;
		else return false;

	}
	public int size()
	{
		return myStack.length;
	}

	public static void main(String[] args)
	{
		Scanner b = new Scanner(System.in);

		System.out.println("Enter a size > 0, or enter -1 if you want the default size of 10\n");
		int sizeIn = b.nextInt();
		if (sizeIn == -1)
			{
				StackIntADT ASImp = new ArrayStack();
			}
		else
		{
			StackIntADT ASImp = new ArrayStack(sizeIn);

		}

	}


}
