package cse360assignment02;
import java.util.*;
public class AddingMachine {
	 private int total;
	
	 private String tostr="0 ";  
	 /**
	   * This method is the constructor of AddingMachine. 
	   * @param Unused
	   * @return nothing 
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /**
	   * This method is used to get toal sum. 
	   * @param Unused
	   * @return total value 
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * This method is used to add a number to total. 
	   * @param value is the integer to be added to the sum total.
	   * @return nothing 
	   */
	  public void add (int value) {
		  total+=value;
        tostr+="+ "+value+" ";
	  }
	  
	  /**
	   * This method is used to subtract the number from the total. 
	   * @param value is the integer to be subtracted from the sum total.
	   * @return nothing 
	   */
	  public void subtract (int value) {
		  total-=value;
        tostr+="- "+value+" ";
	  }

	  /**
	   * This method is used to print out the outcome in string type
	   * @param Unused
	   * @return a string shows the total value in natural language
	   */
	  public String toString () {
	    return tostr;
	  }
	  
	  /**
	   * This method is used to clear and reset the total. 
	   * @param unused
	   * @return nothing 
	   */
	  public void clear() {
		  total=0;
        }

}