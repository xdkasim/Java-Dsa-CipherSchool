
import java.util.*;
class Student{
    String name;
    int marks;
    boolean checkPass(){
    //    if(marks>40){
      //      return true;
        //}
       // else{
            //return false;
        //}
        
        if(marks>40) return true;
        return false;
    }
}


public class ControlFlow {
    int findMax(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name ="Asim";
        s1.marks = 80;

        Student s2 = new Student();
        s2.name ="Iqbal";
        s2.marks = 30;

        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        ControlFlow cf= new ControlFlow();
        System.out.println(cf.findMax(10,7,15));

        Scanner sc = new Scanner(System.in);

        char c = 'a';
        switch(c){
            case 'a':
            System.out.println("Hi, i am A");
            case 'b':
            System.out.println("Hi, i am B");
            case 'c':
            System.out.println("Hi, i am C");
            default:
            System.out.println("I'm not A,B or C");
            

        }

    }
    
}
