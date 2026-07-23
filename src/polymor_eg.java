//polymorphism-->2 types-->method overloading and method overriding

//method overloading-->same mathod name,different no. of parameters
//                                  or
//                     same no. of parameters but different data types


// eg of method overloading
/*
public class polymor_eg{
    public static int sum(int a, int b){
        return a + b;

    }
    public static int sum(int a , int b, int c){
        return a + b+ c;

    }

    public static String sum(String x, String y){
        return x+y;
    }
    static void main(){
        System.out.println(sum(5,6));
        System.out.println(sum(5,8,7));
        System.out.println(sum("Rishabh", "Kumar"));
    }
}
*/






//eg of overriding

class Bank{
    public void ROInterest(){
        System.out.println("ROI is 15%");
    }
}
class SBI extends Bank{
    @Override
    public void ROInterest(){
        System.out.println("ROI is 21%");
    }
}
class PNB extends Bank{
    @Override
    public void ROInterest() {
        System.out.println("ROI is 19%");
    }
}

public class polymor_eg{
    static void main(){
        Bank obj1 = new Bank();
        SBI obj2 = new SBI();
        PNB obj3 = new PNB();

        obj1.ROInterest();
        obj2.ROInterest();
        obj3.ROInterest();
    }
}
