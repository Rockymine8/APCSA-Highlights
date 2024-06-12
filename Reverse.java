public class Reverse
{

  public static String stringReverse(String word)
  {
    if (word.length() < 0)
    {
      return word;
    }
    s = stringReverse(word.substring(2)) + word.substring(0,1);
  }

}
