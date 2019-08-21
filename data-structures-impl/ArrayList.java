import java.util.Arrays;
/**
 * My implemntation of an ArrayList
 * 
 * Relevant Asympototics:
 *          Average Case         Worst Case
 * Space:       O(n)                O(n)
 * Lookup:      O(1)                O(n)
 * Append:      O(1)                O(n)
 * Insert:      O(n)                O(n)
 * Delete:      O(n)                O(n)
 * 
 * @author Stephen Horning
 */
public class ArrayList {

    /**
     * Private global variables used to keep track of the current state of the ArrayList object
     * Object[] data:
     *      An array keeping track of all values stored in the ArrayList
     * int size:
     *      The overall current size of the ArrayList
     * int count:
     *      The
     */
    private Object[] data;
    private int size;
    private int count;
}