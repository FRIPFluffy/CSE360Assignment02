package cse360assignment02;
/**
 * 
 * @author Jalen Solis
 * CSE 360 Assignment01: Version Control
 * Assignment Description: Create the Adding Machine file and perform operations based on input
 * 
 */


public class AddingMachine 
{
  private int total;
  private StringBuffer formula = new StringBuffer("0");
  
  public AddingMachine ()
  {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal ()
  {
    return total;
  }
  
  public void add (int value)// add value to total
  {
	 total+= value;
	 formula.append(" + " + value);
  }

  public void subtract (int value) // subtract value from total
  {
	  total = total - value;
	  formula.append(" - " + value);
  }

  public String toString ()// returns the operation
  {
    return formula.toString();
  }

  public void clear()// clears memory
  {
	  System.gc();
  }
  public static void main(String[] args)  //Test run
  { 
  	AddingMachine test = new AddingMachine();
  	test.add(4);
  	test.subtract(2);
  	test.add(5); 
  	System.out.println(test.toString());
  	System.out.println("Total is: " + test.getTotal());
  }

}