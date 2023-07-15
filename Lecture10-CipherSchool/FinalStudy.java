class A{
    final int noOfAlphabets=26;  //Final variables - Value once assigned cannot be changed
    final int noOfDigits;
    // Either assign the value at time of declaration or assign the value inside constructors
    A(){
        noOfDigits =10;
    }
    final void fun(){
        System.out.println("Hi, I'm a function in class A");
    }
}

class B extends A  // Final classes cannot be inherited 
{
   // void fun(){
    //    System.out.println("I'm a function in B overriding function in A");
   // }
}



public class FinalStudy {
    public static void main(String[] args){

    }
}
