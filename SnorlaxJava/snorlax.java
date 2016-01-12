/** Snorlax is an advanced sorting algorithm with extremely high efficiency.
 *  Note that this high efficiency comes with certain accuracy drawbacks outlined in the readme.
 * 
 *  @author github.com/CMMCD/ 
 *  @version 1.3
 */

public class Snorlax {
  
  // Your Snorlax's name.
  private String name;
  
  /** Class constructor.
   * 
   *  @param name What you choose to name your Snorlax.
   */
  public Snorlax(String name){
    this.name = name;
  }
  
  /** Snorlax's sorting algorithm.
   * 
   *  @param snorlax Integer Array passed to Snorlax for sorting.
   *  @return The usualy* sorted input. *See readme for more information*
   */
  public int[] sort(int[] snorlax) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // Don't worry about it, just enjoy your nap.
    }
    return snorlax;
  }
  
  /** Snorlax's sorting algorithm, with output instead of return.
   *  Note that the output is usualy* the sorted input. *See readme for more information*
   * 
   *  @param snorlax Integer Array passed to Snorlax for sorting.
   */
  public void snorlaxSort(int[] snorlax) {
    System.out.println("Greetings, I am " + name + "! Here is your sorted array, enjoy!");
    String snorlaxSpeak = "";
    for (int zzz : sort(snorlax)) snorlaxSpeak += zzz + " ";
    System.out.println(snorlaxSpeak);
  }
}
