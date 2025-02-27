/*
 * This source file was generated by the Gradle 'init' task
 */


/**
 * The App class serves as the entry point for the application.
 * It creates an instance of the Business class and calls its doBusiness method.
 * The result of the doBusiness method is printed to the console twice.
 */
public class App {


    /**
     * The main method serves as the entry point for the application.
     * It creates an instance of the Business class, calls its doBusiness method,
     * and prints the result to the standard output.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {

        Business business = new Business();
        
        String result = business.doBusiness();

        System.out.println(result);
    }
}
