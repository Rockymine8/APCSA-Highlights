public class TemperatureMonth
{

  private double[][] temperatures;


  public TemperatureMonth(double[][] t)
  {
    temperatures = t;
  }

  public double[] getMaxTempWeekly()
  {
    
     
    double[] arr = new double[temperatures.length];
    double max;
    for(int row = 0; row < arr.length; row++){
      
      max = temperatures[row][0];
      
      for(int col = 0; col <  temperatures[0].length; col++){
        if(temperatures[row][col] > max){
          max = temperatures[row][col];
        }
      
      }
      arr[row] = max;
    }
    
    return arr;

  }

  public double[] getMinTempWeekly()
  {
    double[] arr = new double[temperatures.length];
    double min;
    for(int row = 0; row < arr.length; row++){
      
      min = temperatures[row][0];
      
      for(int col = 0; col <  temperatures[0].length; col++){
        if(temperatures[row][col] < min){
          min = temperatures[row][col];
        }
      
      }
      arr[row] = min;
    }
    
    return arr;

  }

  public double getRange()
  {
    double[] maxArray = getMaxTempWeekly();
    double[] minArray = getMinTempWeekly();
    
    double max = 0;
    double min = Double.MAX_VALUE;
    for(int i = 0; i < temperatures.length; i++ ){
      if(maxArray[i] > max){
        max = maxArray[i];
      }
      
      if(minArray[i] < min){
        min = minArray[i];
      }
    }

  return max - min;
  }

  public double getCertainTemp(int week, int day)
  {
    return temperatures[week][day];
  }
}
