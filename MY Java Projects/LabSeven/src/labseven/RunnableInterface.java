/* Bismillahir Rahmanir Rahim */

package labseven;

/**
 *
 * @author Nizam
 */
public class RunnableInterface implements Runnable {
    
    public void run() {
        System.out.println("Thread using runnable interface is running...");
    }
    
    public static void main(String[] args) {
        
        RunnableInterface m1 = new RunnableInterface();
        
        Thread t1 = new Thread(m1);
        
        t1.start();
    }

}
