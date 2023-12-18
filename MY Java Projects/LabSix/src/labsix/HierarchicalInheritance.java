/* Bismillahir Rahmanir Rahim */
package labsix;

/**
 *
 * @author Nizam
 */
public class HierarchicalInheritance {

    public static class A {

        public void methodA() {
            System.out.println("method of Class A");
        }
    }

    public static class B extends A {

        public void methodB() {
            System.out.println("method of Class B");
        }
    }

    public static class C extends A {

        public void methodC() {
            System.out.println("method of Class C");
        }
    }

    public static class JavaExample {

        public static void main(String args[]) {
            B obj1 = new B();
            C obj2 = new C();

            //All classes can access the method of class A
            obj1.methodA();
            obj2.methodA();

        }
    }

}
