/* Bismillahir Rahmanir Rahim */
package labsix;

/**
 *
 * @author Nizam
 */
public class Constructor {

    int x;  // Create a class attribute

    // Create a class constructor for theconstructor class
    public Constructor() {
        x = 5;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        
        Constructor myObj = new Constructor();      // Create an object of class constructor
                                                                                  // (This will call the constructor)
        System.out.println(myObj.x);            // Print the value of x
    }
}
