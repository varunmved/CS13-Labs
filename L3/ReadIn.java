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
