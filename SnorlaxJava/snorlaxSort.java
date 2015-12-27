/* Snorlax is an advanced sorting algorithm with extremely high efficiency
 * Note that this high efficiency comes with certain accuracy drawbacks outlined in the readme
 * 
 * @author github.com/CMMCD/ 
 * @version 1.1
 */

class snorlax {
  
  // Your Snorlax's name.
  String name;
  
  /* Class constructor.
   * 
   * @param name What you choose to name your Snorlax.
   */
  public snorlax(String name){
    this.name = name;
  }
  
  /* Snorlax's sorting algorithm.
   * 
   * @param snorlax Integer Array passed to Snorlax for sorting.
   * @return The usualy* sorted input. *See readme for more information*
   */
  public int[] sort(int[] snorlax) {
    return snorlax;
  }
  
  /* Snorlax's sorting algorithm, with output instead of return.
   * Note that the output is usualy* the sorted input. *See readme for more information*
   * 
   * @param snorlax Integer Array passed to Snorlax for sorting.
   */
  public void snorlaxSort(int[] snorlax) {
    int[] snorlaxSorted = sort(snorlax);
    System.out.println("Greetings, I am " + name + "! Here is your sorted array, enjoy!");
    String snorlaxSpeak = "";
    for (int zzz : snorlaxSorted) snorlaxSpeak += zzz + " ";
    System.out.println(snorlaxSpeak);
  }
}