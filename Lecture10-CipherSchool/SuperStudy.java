class loan{
    int rate;
    loan(){
        System.out.println("Hi, I'm default constructor of loan");

    }

    loan(int rate){
        this.rate = rate;
    }

    void printRate(){
        System.out.println(this.rate);
    }
}

class carLoan extends loan{
    int rate;

    carLoan(){
        System.out.println("Hi ,I'm default constructor of carLoan");
        System.out.println(super.rate);  // Using super to access instance variable of
    }
    carLoan(int rate){
        super(7);  // 3 -To invoke the constructor of parent class (must be 1st line of )
        this.rate = rate;
    }

    void printRate(){
        System.out.println(this.rate);
        super.printRate();  // Using super to invoke methods of the parent class
        System.out.println(super.rate);
    }
}
public class SuperStudy {
    public static void main(String [] args){
        carLoan cl2 = new carLoan();
        carLoan cl= new carLoan(8);
        cl.printRate();
    }
}
