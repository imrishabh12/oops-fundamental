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






//VVIQ
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







//VVIQ
/*
//Q6)) Create a class Rectangle with attributes length and width, each defaulting to 1.
// The class should include set and get methods for both attributes, and a method to
// calculate the area of the rectangle.
class Rectangle{
    private int length=1;
    private int width=1;

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int calcarea(){
        return length * width;
    }
}
public class prac_ques{
    static void main(){
        Rectangle ob1 = new Rectangle();
        ob1.setLength(10);
        ob1.setWidth(12);
        int area = ob1.calcarea();
        System.out.println("area of rect is : " + area);
    }
}
*/







/*
//Method Overriding (toString())-->> this is new concept
//VVIQ
//Q7))Create a class Person with firstName and lastName as data members.
// Override the toString() method to return the full name of the person.
// Define constructors to take appropriate parameters.
class Person{
    String firstName;
    String lastName;

    Person(String firstName, String lastName){///here im using const for proper parameter
        this.firstName= firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

}
public class prac_ques{
    static void main(){
        Person p1 = new Person("Rishabh", "Kumar");
        System.out.println(p1);
    }
}
*/






/*
//VVIQ
//ive to create multiple instances--> means ive to use constructors
//Q8)). Create a Student class with name, rollNo, and marks as attributes.
// Write a method to calculate the grade based on the marks and display the grade.
// Create multiple instances of the Student class and print their grades.
class Studentt{
    String name;
    int roll;
    double marks;

    Studentt(String name, int roll, double marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    String calcGrade(){
        if(marks>=90){
            return "A";
        }

        else if(marks>=80){
            return "B";
        }

        else if(marks>=70){
            return "C";
        }

        else if(marks>=60){
            return "D";
        }

        else{
            return "F";
        }
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Marks :" + marks);
        System.out.println("So the grade is : " + calcGrade());
    }

}
public class prac_ques {
    static void main() {
        Studentt s1 = new Studentt("Nishant", 15, 55);
        s1.display();
    }
}
*/









/*
//Q9. Write a program to accept three numbers and find the largest of the three
// using method overloading.
class Studentt{

    int  largest(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }


    }
    int largest(int a, int b, int c){
        if((a>b) && (a>c)){
            return a;
        } else if ((b>a) && (b>c)) {
            return b;
        }
        else{
            return c;
        }

    }
}
public class prac_ques {
    static void main() {
        Studentt s2 = new Studentt();
        int m1 = s2.largest(18,27);
        System.out.println(m1);

        int m2 = s2.largest(18,5,20);
        System.out.println(m2);

    }
}
*/






/*
//Q10.) Write a program to accept a number and display its last digit in words
// using a method in a class.

class Number{
    String lastDig(int num){///taking string bcz return type is string not int
        int lastt = num%10;
        if (lastt == 0){
            return "zero";
        }
        else if (lastt == 1){
            return "one";
        }
        else if (lastt == 2){
            return "two";
        }
        else if (lastt == 3){
            return "three";
        }
        else if (lastt == 4){
            return "four";
        }
        else if (lastt == 5){
            return "five";
        }
        else if (lastt == 6){
            return "six";
        }
        else if (lastt == 7){
            return "seven";
        }
        else if (lastt == 8){
            return "eight";
        }
        else if (lastt == 9){
            return "nine";
        }
        else{
            return "invalid";
        }
    }
}
public class prac_ques {
    public static void main(String[] args){
        Number s2 = new Number();
        String number = s2.lastDig(1569);
        System.out.println(number);
    }

}
*/











//Q11.)) Create a program that keeps track of the number of objects created and displays
// the count in a function called display().























