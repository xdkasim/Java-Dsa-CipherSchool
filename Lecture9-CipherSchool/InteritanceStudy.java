/*
 * INHERITANCE
 * Using inheritance , we can create new classes from already existing classes.
 * Existing classes from which new classes are derived are called base/parent/super classes.
 * New classes are called derived/child/sub classes.
 * Derived class inherits all the fields and methods form base class and can add their own elements.
 * Code Reusability is the main benefit of Inheritance.
 */
class Shape{ // parent class,Base class,Super class
    double pi= 3.14;
    double getSquare(int r){
        return r*r;
    }
}

class Circle extends Shape{ // Child class ,Derived class,Sub class
    void area (int r){
        System.out.println(pi*getSquare(r));
    }
}
public class InteritanceStudy {
    public static void main(String [] args){
        Circle c =new Circle();
        c.area(5);
    }
}
