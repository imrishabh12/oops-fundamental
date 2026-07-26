//NOTE in this we will cover try,catch,finally,throw,throws






//eg1 try and catch block
//there must be atleast 1 catch/finally block should be used in try block
/*
import java.util.Scanner;
public class exception_handeg{
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend");
        float dividend = sc.nextFloat();
        System.out.println("enter divisor");
        float divisor = sc.nextFloat();
        try {
            float res = dividend / divisor;
            System.out.println("the final result is : " + res);
        } catch (Exception e) {
            System.out.println("divisor can't be 0"); //sout(e.getMessage());
        }
    }
}
*/








//eg2)) multiple try and catch block
/*
import java.util.Scanner;
public class exception_handeg {
    static void main() {
        int arr[] = new int[5];
        try {
            arr[6] = 10/0;// here we can get 2 exceptions first is arr is of size 5 and 10 cant div by 0

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

 */









/*
//eg3)) nested try and catch block
import java.util.Scanner;
public class exception_handeg {
    static void main() {
        int arr[] = new int[5];
        try {
            System.out.println("this is first try block");
            try {
                arr[6] = 7;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
*/














//eg4)) throw keyword--> to manually create exception
/*
import java.util.Scanner;
public class exception_handeg {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            throw new RuntimeException("sorry you can't vote");
        } else {
            System.out.println("you can vote");
        }
    }
}
*/









//eg5)) throws keyword-->used in method/func to indicate that it may throw exception
public class exception_handeg{
    public static void excepeg(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
    public static void main(String[] args){
        excepeg(5,0);
    }
}










