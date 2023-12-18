/* Bismillahir Rahmanir Rahim */
package labseven;

/**
 *
 * @author Nizam
 */
class ThreadExample extends Thread {

    public void run() {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        try {
            sleep(500);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Exception occured");
        } finally {
            System.out.println("End of Example!");
        }
    }
}

class Main2 {

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        ThreadExample t3 = new ThreadExample();

        t1.start();
        t2.start();

        t3.start();

        t2.suspend();

        t1.resume();

        t3.suspend();

        t2.resume();

        t3.resume();

    }
}
