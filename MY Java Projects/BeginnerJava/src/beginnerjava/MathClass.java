
package beginnerjava;


public class MathClass {
    public static void main(String[] args) {
        int x =2;
        int y =3;
        int c =-6;
        
        //OR : System.out.println(Math.max(x, y));
        //math class java (google>oracle)
        int max = Math.max(x, y);
        System.out.println("Maximum = "+max);
        int min = Math.min(x, y);
        System.out.println("Minimum = "+min);
        
        int absolute = Math.abs(c);
        System.out.println("Absolute = "+absolute);
        
        double power = Math.pow(x,y);
        System.out.println("x to the power y = "+power);
        
        int round = Math.round(8.5f);
        System.out.println("Round of 8.5 = "+round);
        
        double floor = Math.floor(8.5f);
        System.out.println("Floor of 8.5 = "+floor);
        
        double pi = Math.PI;
        System.out.println("Pi = "+pi);
        
    
    }
    
}
