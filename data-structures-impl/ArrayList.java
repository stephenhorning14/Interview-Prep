import java.util.Arrays;

/********************************************************************************
 * My implmentation of an ArrayList
 * 
 * Relevant Asympototics: 
 *          Average Case         Worst Case 
 * Space:       O(n)                 O(n) 
 * Lookup:      O(1)                 O(n) 
 * Append:      O(1)                 O(n) 
 * Insert:      O(n)                 O(n) 
 * Delete:      O(n)                 O(n)
 * 
 * @author Stephen Horning
 */
public class ArrayList {

    /*****************************************************************************
     * Private global variables used to keep track of the current state of the ArrayList 
     * 
     * object Object[] data: 
     *      An array keeping track of all values stored in the ArrayList 
     * int TOTAL_CAPACITY: 
     *      The overall number of open slots in the ArrayList 
     *          - Doubles once the current cap size is hit 
     * int count: 
     *     The number ofactual elements stored int the ArrayList
     */
    private Object[] data;
    private int TOTAL_CAPACITY = 10;
    private int size;

    // Default consturctor
    public ArrayList() {
        data = new Object[TOTAL_CAPACITY];
        size = 0;
    }

    /**
     * Constructor used to set the default capacity to a given capacity
     * @param initialCapacity
     *      The new initial capacity to be set, is not used if less than the standard starting capacity 
     */
    public ArrayList(int initialCapacity) {
        if (initialCapacity < 10) {
            data = new Object[TOTAL_CAPACITY];
        } else {
            data = new Object[initialCapacity];
        }
        size = 0;
    }

    /**
     * Adds the parameter element to the end of the ArrayList
     * @param element
     *      The element to be appended onto the end of the ArrayList
     */
    public void add(Object element) {
        checkCapacity(size + 1);
        data[size] = element;
        size++;
    }

    /**
     * Checks if current ArrayList needs its capacity increased/decreased
     * 
     * @param size
     *      The current number of elements inside the ArrayList
     */
    private void checkCapacity(int size) {
        // TODO -- Add check to shrink size
        if (size != 0 && size == TOTAL_CAPACITY) {
            increaseCapacity();
        } 
    }

    // Doubles current total capacity of the given ArrayList
    private void increaseCapacity() {
        Object[] tmp = new Object[TOTAL_CAPACITY * 2];
        for (int i = 0; i < TOTAL_CAPACITY; i++) {
            tmp[i] = data[i];
        }
        TOTAL_CAPACITY *= 2;
        data = tmp;
    }

    // Returns the current size of the given ArrayList
    public int size() {
        return this.size;
    }

    // Returns true if the given ArrayList has zero elements it, false otherwise
    public boolean isEmpty() {
        return this.size == 0;
    }

    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        test.add("Test");
        System.out.println(test.get(0));
        System.out.println("Is the ArrayList empty? " + test.isEmpty());
    }
}
