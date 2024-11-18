package learnjavaonline.Practice;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 'y'}; // Added 'y' on index 4 to avoid error and solve problem
        int length = numbers[3];
        char[] chars = new char[length];
        chars[numbers.length + 4] = 'y';
        System.out.println("Done!");
    }
}
