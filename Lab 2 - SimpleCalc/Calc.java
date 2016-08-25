
/**
 * Write a description of class Calc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calc
{  // instance variables     - replace the example below with your own
  private int a ;
  private int b ;
  
    /**
     * Constructor for objects of class Calc
     */
    public Calc(int c, int d)
    {
       a = c;
       b = d;
      
    }
    public int add()
    {
        return a + b;
    }
    public int sub()
    {
        return a - b;
    }
    public int mult()
    {
        return a * b;
    }
    public int div()
    {
        return a / b;
    }
}
