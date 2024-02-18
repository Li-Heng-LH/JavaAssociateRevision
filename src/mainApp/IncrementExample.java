package mainApp;

public class IncrementExample {

    public static void main(String[] args) {
        int i = 0;

        // Post-increment: i++ returns the current value of i, then increments i
        int postIncrement = i++;
        System.out.println("Post-increment: " + postIncrement); // Output: 0
        System.out.println("After post-increment: " + i); // Output: 1

        // Reset i for demonstration
        i = 0;

        // Pre-increment: ++i increments i, then returns the updated value
        int preIncrement = ++i;
        System.out.println("Pre-increment: " + preIncrement); // Output: 1
        System.out.println("After pre-increment: " + i); // Output: 1
    }
}

