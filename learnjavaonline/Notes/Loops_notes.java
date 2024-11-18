// https://www.learnjavaonline.org/en/Loops
package learnjavaonline.Notes;

public class Loops_notes {

    public static void main(String[] args) {

        System.out.println("\n");

        // A while loop evaluates a condition and stops running when it is false.
        // while(condition) e.g. while(value < 15)
        boolean value = true;
        while(value != false) {
            System.out.println("This is the only time this loop will run because the condition is broken by the point the loop starts again.");
            value = false;        
        }

        System.out.println("\n");

        // Since while loops break when the condition isn't true, they might not run at all.
        // In order to ensure at least one iteraton of the loop runs, we may use do while.
        do { 
            System.out.println("Even though the condition isn't true, this loop will run once.");
        } while (value == true);

        System.out.println("\n");

        // A for loop has three sections.
        // for(x; y; z) e.g. for(int iterator = 0; iterator < 10; iterator++)
        // section x is what runs when the loop starts (and runs only once)
        // section y is the condition. When the condition becomes false, the program exits the loop.
        // section z is the iterable and it runs every time the loop is finished. 
        for(int iterator = 0; iterator < 5; iterator++) {
            System.out.println("This is the " + (iterator + 1) + "th iteration of a for loop."); // This loop prints the current iterator value
        }

        System.out.println("\n");

        // When iterating on arrays with for loops, a shorthand can be used referred to as foreach.
        // It is functionally identical to foreach, but essentially, for every time the loop is run, the iterator increments by one index in the array
        int[] some_array = {1, 2, 3, 4, 5};
        for(int iterator_of_array: some_array){
            System.out.println("This is an item of the array: " + iterator_of_array);
        }

        System.out.println("\n");

        // We can use break to exit the loop at any given point. Usually used with a condition.
        for(int break_iterator = 0; break_iterator < 10; break_iterator++) {
            if (break_iterator == 5){
                break;
            }
            System.out.println("This loop will break in " + (5 - break_iterator) + " iterations.");
        }

        System.out.println("\n");

        // We can use continue to stop the current iteraton and skip to the next one
        for(int continue_iterator = 0; continue_iterator < 8; continue_iterator++) {
            if (continue_iterator == 6) {
                continue; // Thanks to this, the 7th iteration never gets printed.
            }
            System.out.println("This is the " + (continue_iterator + 1) + "th iteration of this loop.");

        }
    }

}
