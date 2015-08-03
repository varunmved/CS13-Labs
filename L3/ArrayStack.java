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
