abstract class Car // we cannot instantiate an abstract class,which means we cannot create objects of an abstract
{
   int maxSpeed ;
   abstract void accelerate(); //Only declared but not implemented it is without a body
   // they are created to force the child classes to implement them before using .We will use them after 
    abstract void brake();

} 

abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying Brakes");

    }
}

abstract class A{  // An abstract class can exist without abstract methods
                    // We simply mean we will not be able to create object of this class 

    int x= 10;
    void fun() // Abstract class can have concrete methods
    {
        System.out.println("Hello , I'm A");

    }
}

public class AbstractStudy {
    public static void main(String[] args){
        //BMW beemer = new BMW();
        //beemer.accelerate();
        BMW2 b =new BMW2();
        b.accelerate();
        b.brake();

    }
}
