import java.util.Scanner;

public interface StackIntADT {
	public void push(int element);
	public int pop();
	public int peek();
	public boolean isEmpty();
	public boolean isFull();
	public int size();
}

public class VMsoln
{
	public class MemoryBuild()
	{
		// fields
		private static int DEFAULT_SIZE = 32;
		private int[] memory = new int[DEFAULT_SIZE];

		// constructors
		public buildMemory()
		{
			new int[DEFAULT_SIZE];
		}

		public buildMemory(int size)
		{
			new int[size];
		}
	}

	public class ReadIn()
	{
		Scanner b = new Scanner(System.in);
		String input = null;
		//input = input.toLowerCase();
		public void reader()
		{
			while (!input.contains("done:"))
			{
				input = b.nextLine();
				String[] splitLine = input.split(" ");
				switch (splitLine[0])
				{

					case (input.contains("const") == true):
					//push p
					break;
					case (input.contains("load") == true):
					string[] lineInput = input.split(" ");
					String addressIn = splitLine[1];
					break;
					case (input.contains("sto") == true):
					string[] lineInput = input.split(" ");
					String addressIn = splitLine[1];
					break;


				}
			}
		}
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
			stackPointer = 0;
		}

		public ArrayStack(int size)
		{
			if(size > 0)
			{
				myStack = new int[size];
				stackPointer = 0;
			}
		}

		// stack class methods
		//add an element to the stack
		public void push(int element)
		{
			//if(stackPointer == myStack.length)

			if(isFull()==true)
			{
				System.out.println("isfull");
			}
			else
			{
				stackPointer++;
				myStack[stackPointer]=element;
			}
		}

		//take an element off the stack
		public int pop() {
			if(isEmpty()==true)
			{
				System.exit(0);

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
	}
}

//methodsi
