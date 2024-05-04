import java.util.Scanner;

public class DynamicBookArray {

    /**
     * Starting array size is 50
     */
    private static final int DEFAULT_SIZE = 50;

    /**
     * Default number to expand the array to fit all the words
     */
    private static final int DEFAULT_RESIZE_FACTOR = 2;

    /**
     * Original default array
     */
    private String[] TextArray;

    /**
     * Variable that will be called to resize the default array
     */
    private int nextAvailable;


    /**
     * The size of the array will start at the default size.
     * A pointer is needed to recognize if more the array is out of space.
     *
     * @param size int with the array linked to the text.
     */
    public DynamicBookArray(int size) {
           size = DEFAULT_SIZE;

        // Initialize the original array
           TextArray = new String[size];

        // Initialize pointer to the next available opening in the array.
            nextAvailable = 0;
    }

    /** Method to create a new dynamic object. */
    public DynamicBookArray() {
        DynamicBookArray s = new DynamicBookArray();
    }


    /** Method to resize the default array. */
    public void resize() {
        resize(DEFAULT_RESIZE_FACTOR);
    }

    /**
     * Resizes the array if more room is needed.
     * Checks if the array needs to resize.
     * Method is needed to connect and add the scanner to the object with the proper Strings.
     *
     * @param s String to add to the dynamic array.
     */
    public void add(String s) {
        // If there is no more room in the array, it has to expand.
        if (nextAvailable == TextArray.length)
            resize();

        // Room available for new String.
        TextArray[nextAvailable] = s;

        // Move the pointer to make sure there is always space
        nextAvailable++;
    }  // method add


    /**
     * Copies the content from the old array to the new array.
     * Resizes the array if needed.
     *
     * @param factor int multiplier for resizing the array.
     */
    public int resize(int factor) {

        // To expand the array.

        // Create a new array that has more room
        String[] bigger = new String[2 * TextArray.length];

        // Copy the old array contents to the new array
        for (int i = 0; i < TextArray.length; i++)
            bigger[i] = TextArray[i];

        // Copy the bigger array to the text array.
        TextArray = bigger;

        return resize(DEFAULT_RESIZE_FACTOR);

    }


    /**
     * Boolean is used to search for a string in an array.
     * If the string is not found then it will be added to the array
     *
     * @return array with no repeated words
     */

    public boolean contains(String string) {

        // Assume string doesn't exist to add to the array
        boolean found = false;
        // Array cursor
        int i = 0;
        // While loop to continue adding text
        while (!found && i < nextAvailable) {
            found = TextArray[i].equalsIgnoreCase(string);
            i++;
        }
        return found;
    }


}

