// https://www.learnjavaonline.org/en/Arrays
package learnjavaonline.Notes;

public class Arrays_notes {
    public static void main(String[] args) {
        // An array is a object that is a set of values. Arrays need to be declared before they are created.
        // Declaring Arrays
        int[] some_array;

        // Creating an array
        some_array = new int[15];

        // We can do both at once.
        int[] another_array = {5, 4, 3, 2, 1};

        // We can access the values inside an array using array_name[], with indexes starting from 0.
        some_array[0] = 4;
        System.out.println("First item in this array is: " + some_array[0]);

        // We can access the length of an array using its object method
        System.out.println("Length of the array is: " + some_array.length); // Prints 15

        // Printing all the contents of an array requires a loop, or it will give some strange nonsense (discussed in next note)
        for (int iterator = 0; iterator < another_array.length; iterator++) {
            System.out.println("This is item " + iterator + " of the array: " + another_array[iterator]);
        }
    }

}