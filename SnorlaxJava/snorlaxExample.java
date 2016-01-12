/** This is an example of using the Snorlax sort
 * 
 *  @author github.com/CMMCD/ 
 *  @version 1.2
 */

public class SnorlaxExample {
  public static void main(String[] args){

    // Creating an example array to be sorted
    int[] input = {1,24,1283786,999999999};
    
    // Creating a new Snorlax named Aslan
    Snorlax aslan = new Snorlax("Aslan");
    
    // Using aslan to call snorlaxSort on our array
    aslan.snorlaxSort(input);
  }
}