import singleton.Singleton;

public class SingletonTest {

    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singletonInstance1 = Singleton.getInstance();
        System.out.println("Singleton instance 1 hash code: " + System.identityHashCode(singletonInstance1));

        // Try to get the singleton instance again
        Singleton singletonInstance2 = Singleton.getInstance();
        System.out.println("Singleton instance 2 hash code: " + System.identityHashCode(singletonInstance2));

        // Check if both instances are the same
        if (singletonInstance1 == singletonInstance2) {
            System.out.println("Both instances are the same. Singleton is working as expected.");
        } else {
            System.out.println("Error: Singleton pattern is broken.");
        }
    }
}
