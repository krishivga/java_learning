// https://www.learnjavaonline.org/en/Conditionals
package learnjavaonline.Practice;

public class Conditionals {
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = "Nope!";
        String d = "Wow!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}