/* Bismillahir Rahmanir Rahim */

package labseven;

/**
 *
 * @author Nizam
 */
public class SuspendResume extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
        SuspendResume t1=new SuspendResume();    
        SuspendResume t2=new SuspendResume();   
        SuspendResume t3=new SuspendResume();   
        // call run() method   
        t1.start();  
        t2.start();  
        t2.suspend(); // suspend t2 thread   
        // call run() method   
        t3.start();   
        t2.resume(); // resume t2 thread  
    }    
}  