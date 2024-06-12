class binarySearch
{
  public static int iterativeSearch(int[] numbers, int value)
  {
    int lowerIndex = 0;
    int upperIndex = numbers.length - 1;

    while (lowerIndex <= upperIndex)
    {
      int mid = (lowerIndex + upperIndex) / 2;
      if (value == numbers[mid])
      {
        return mid;
      }
      else if (value > numbers[mid])
      {
        lowerIndex = mid + 1;
      }
      else if (value < numbers[mid])
      {
        upperIndex = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args)
  {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int num = 8;
    int location = iterativeSearch(arr, num);

    System.out.println(num + " was found at index " + location);
  }
}
