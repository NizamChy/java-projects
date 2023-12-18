/* Bismillahir Rahmanir Rahim */
package labseven;

/**
 *
 * @author Nizam
 */
public class ThreadPriority {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

    }

}
