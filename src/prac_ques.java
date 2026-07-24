//Q1)). Create a class MessagePrinter with a method printMessage(String name)
//which prints the message "hello <name>".

/*class MessagePrinter{
    void printMessage(String name){
        System.out.println("Hello "+ name);
    }
}
public class prac_ques{
    static void main(){
        MessagePrinter ob1= new MessagePrinter();
        ob1.printMessage("Rishabh");
    }
}*/








//Q2 2. Create a class Calculator with the following methods:
//calculateSum(int number1, int number2) to calculate the sum of two numbers.
//calculateDifference(int number1, int number2) to calculate the difference between two numbers.
/*
class Calculator{
    void calculateSum(int number1, int number2){
        System.out.println(number1+number2);

    }
    void calculateDifference(int number1, int number2){
        System.out.println(number1-number2);

    }


}
public class prac_ques {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        obj1.calculateSum(5,3);
        obj1.calculateDifference(6,1);


    }

}

 */




/*
//VVIQ
//Q3)) Create a class Employee with overloaded constructors to initialize employee
// details based on different combinations of arguments. Ensure the constructors
// support the creation of objects in various ways.
class Employee{
    String name;
    int age;
    double salary;
    int id;

    //default constuctor
    Employee(){
        System.out.println("this is default constructor");
    }
    //const with 1 parameter
    Employee(String name){
        this.name = name;
    }
    //const with 2 para
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    //const with 3 para
    Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
        System.out.println();
    }
}
public class prac_ques{
    public static void main(String[] args){
        Employee e1= new Employee();

        Employee e2= new Employee("Rishu");
        e2.display();

        Employee e3 = new Employee("Gaurav", 19);
        e3.display();

        Employee e4 = new Employee("Satyam", 18, 51000);
        e4.display();

    }
}
*/








/*
//Q4. Create a class SeriesCalculator with a method calculateSum(int n) to calculate
// the sum of the first n numbers in the series 1 + 3 + 5 + 7 + ....
// Use the formula Sum = (n/2) * [2*a + (n-1)*d], where "a" is the first term and "d"
// is the common difference.
class SeriesCalculator{
    int calculateSum(int n){
        int a= 1;
        int d=2;
        return (n * (2 * a + (n - 1) * d)) / 2;

    }
}
public class prac_ques{
    public static void main(String[] args){
        SeriesCalculator c1 = new SeriesCalculator();
        int sum = c1.calculateSum(7);
        System.out.println("the sum of the series is : " + sum);
    }
}
*/







/*
//Q5))Create a class Biggest that contains a single-dimensional array as a data member
// and a method display() to find and display the largest element of the array.
class Biggest{
    int arr[]={10,45,20,90,5};
    void display(){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("the largest element is : " + max);
    }
}
public class prac_ques{
    static void main(){
        Biggest ob1 = new Biggest();
        ob1.display();
    }
}
/*
 */





//Q5 b))Q. Create a class Smallest that contains a single-dimensional array as a
// data member and a method display() to find and display the smallest element of
// the array.
/*
class Smallest{
    int arr[]= {10,45,20,90,5};
    void display(){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];

            }
        }
        System.out.println("the smallest element is : " + min);
    }
}
public class prac_ques{
    static void main(){
        Smallest ob2 = new Smallest();
        ob2.display();
    }
}
*/








//Q6)) Create a class Rectangle with attributes length and width, each defaulting to 1.
// The class should include set and get methods for both attributes, and a method to
// calculate the area of the rectangle.
class Rectangle{
    double length=1;
    double width=1;
}






