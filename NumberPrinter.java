import java.util.Scanner;

public class NumberPrinter
{
  public static void main(String[] args)
  {
    // Final Output
    for (int i = 10; i > 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }
}
