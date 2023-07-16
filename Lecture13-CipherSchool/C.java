

public class C extends A {
    public static void main(String [] args){
        A obj = new A();
        System.out.println(obj.x); // default is not accessible outside the package 
        System.out.println(obj.y); // private not accessible outside the class

    }
}
