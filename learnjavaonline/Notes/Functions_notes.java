package learnjavaonline.Notes;

public class Functions_notes {
    // All functions are a part of/inside classes. They are also referred to as methods.
    // Before that, lets decode some of these words. Public means it can be accessed anywhere.
    // Static means that it is a part of the class (main class in this case) rather than a instance.
    // Void means it doesnt return anything.
    // some_method is a 'function' or a 'method' of the main class.
    public static void some_method() {
    } 

    // A method can be called by using its name
    // some_method(args);

    // Methods can also have arugments. Arugmnets in methods are 'copied' from the source where they are called.
    public static void method_with_args (int arg_1, String arg2) {
    }

    // Assuming x and y are two variables and method_with_args is called, the values of x and y are copied onto arg_1 and arg_2 respecitvely. Changing arg_1 and arg_2 doesn't affect x and y.

    // Assigning objects is a little different (yes, you can assign objects as arguments) because running methods on argumnets will change the object but changing the values of the reference to the object doesn't affect the object in any way.
    // To put this in perspective, for example, changing the name of the object after it has been taken as an argument would change the name of the parent object as well.
    // But, creating a new instance of the object with a different name would not change the original object, as it is only an instance.

    // Non static methods work only on objects, and not the class. Basically, they alter the instance rather than the blueprint.
    public static void main(String[] args) {
    }
}
