

public class B {
    public static void main(String [] args){
        A obj = new A();
        System.out.println(obj.x);  //default is accessible is same package
        System.out.println(obj.y);  //private not accessible outside the class
        
    }
    
}
