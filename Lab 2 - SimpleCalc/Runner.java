
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    // instance variables - replace the example below with your own
 

    /**
     * Constructor for objects of class Runner
     */
    public static void main (String[] args)
    {
        Calc calc = new Calc(2,4);
       System.out.println(calc.add());
       System.out.println(calc.sub());
       System.out.println(calc.mult());
       System.out.println(calc.div());

    }
}
