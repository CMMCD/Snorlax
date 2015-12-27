/* This is an example of using the Snorlax sort
 * 
 * @author github.com/CMMCD/ 
 * @version 1.1
 */

class snorlaxExcample {
  public static void main(String[] args){

    // Creating an example array to be sorted
    int[] input = {1,24,1283786,999999999};
    
    // Creating a new snorlax named Aslan
    snorlax Aslan = new snorlax("Aslan");
    
    // Using Aslan to call snorlaxSort on our array
    Aslan.snorlaxSort(input);
    
    int[] r = Aslan.sort(input);
  }
}