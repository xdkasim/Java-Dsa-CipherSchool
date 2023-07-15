/*
 * An interface is something like a blueprint of a class.
 * Interfaces can have only abstract methods.
 * They are used to achieve absolute abstraction and multiple inheritance in java.
 * An interface can have abstract methods and variables.
 * Variables declared inside interfaces are public,static and final by default.Even if we don't use these keywords explicitily.
 * Method declaration inside interfaces are public and abstract by default.
 */


interface Shape{
    double pi = 3.14;  //public ,static,final
    double getSquare(double r);  //public and abstract
} 

class Circle implements Shape{
    public double getSquare(double r){
        return r*r;
    }

    void fun(){
        System.out.println("Hey, I implemented an interface named Shape");
    }
}
public class InterfaceStudy {
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
}
