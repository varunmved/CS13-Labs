import java.util.Scanner;

public class readIn
{
  public static void main(String[] args){
    Scanner b = new Scanner(System.in);
    String input = null;
    //input = input.toLowerCase();
    while (input.contains("done:") != true)
    {
      input = b.nextLine();
      if(input.split())
      switch (input)
      {

        case (input.contains("const") == true):
        //push p
        break;
        case (input.contains("load") == true):
        string[] lineInput = input.split(" ");
        int varIn = int(lineInput[2]);
        break;
        case (input.contains("sto") == true):
        string[] lineInput = input.split(" ");
        int varIn = int(lineInput[2]);
        break;
        case (input.contains("add") == true):
        /*
        y = pop() x = pop() d = x+ y push(d)
        */
        break;
        case (input.contains("sub") == true):
        /*
        y = pop() x = pop() d = x- y push(d)
        */
        break;
        case (input.contains("mul") == true):
        /*
        y = pop() x = pop() d = x* y push(d)
        */
        break;
        case (input.contains("div") == true):
        /*
        y = pop() x = pop() d = x/ y push(d)
        */
        break;
        case (input.contains("eql") == true):
        /*
        y = pop()
        x = pop()
        if x == y push(1) else push(0)
        */
        break;
        case (input.contains("lss") == true):
        /*
        y = pop()
        x = pop()
        if x < y push(1) else push(0)
        */
        break;
        case (input.contains("gtr") == true):
        /*
        y = pop()
        x = pop()
        if x > y push(1) else push(0)
        */
        break;
        case (input=="f"):
        string[] lineInput = input.split(" ");
        int varIn = int(lineInput[2]);
        break;



      }


    }
  }
}
