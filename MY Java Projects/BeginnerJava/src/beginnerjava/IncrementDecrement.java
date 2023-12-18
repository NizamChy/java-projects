
package beginnerjava;


public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 25;
        int y;
        
        y = x++; //post increment
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        
        int a = 25;
        int b;
        
        b = ++a; //pre increment
        System.out.println("b = "+b);
        
        b = a;
        System.out.println("b = "+b);
        
        
        
        
        int p = 25;
        int q;
        
        q = p--; //post decrement
        System.out.println("q = "+q);
        
        q = p;
        System.out.println("q = "+q);
        
        int m = 25;
        int n;
        
        n = --m; //pre decrement
        System.out.println("n = "+n);
        
        n = m;
        System.out.println("n = "+n);
    }
}
