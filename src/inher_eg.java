// eg of single inheritance
   /*
    class Vehicle{
        double price;
        double mileage;
        String color;


    }
    class Car extends Vehicle{//single inheritance
        String ftype;
        boolean sunroof;
        String brand;

        void display(){
            System.out.println("price:" + price);
            System.out.println("mileage:" + mileage);
            System.out.println("color:" + color);
            System.out.println("ftype:" + ftype);
            System.out.println("Is there a sunroof:" + sunroof);
            System.out.println("brand is:" + brand);
        }
    }
    public class inher_eg {
    public static void main(String[] args){
        Car ob4 = new Car();
        ob4.brand="tata";
        ob4.price = 15000;
        ob4.mileage = 18.4;
        ob4.ftype = "petrol";
        ob4.color = "black";
        ob4.sunroof = true;
        ob4.display();
    }
}
*/






// eg of multi level inheritance

  /* class Vehicle{
       double mileage;
   }
   class Car extends Vehicle{
       String color;
   }
   class Maruti extends Car{
       int price;
       String model_name;
       void display(){
           System.out.println("mileage is :" + mileage);
           System.out.println("color is :" + color);
           System.out.println("model name is :" + model_name);
           System.out.println("price is :" + price);
       }
   }
   public class inher_eg{
       public static void main(String[] args){
           Maruti ob6 = new Maruti();
           ob6.model_name = "Ertiga";
           ob6.color = "white";
           ob6.mileage = 18.55;
           ob6.price = 1100000;
           ob6.display();
       }
   }

*/








/*
// eg of multiple inheritance-- it is not possible in java it is called diamond problem in java lets see why
//its not possible
class Ertiga{
    void avg(){
        System.out.println("print avg");
    }

}
class Baleno{
    void avg(){
        System.out.println("print avg");
    }

}

class New_Launch extends Ertiga{


}
class New_Launch extends Baleno{

}
//so in this we can not extend both class features in new class and if the object of 3rd class will run the avg
//avg method it will confused and ambiguity will arise and it will not execute

*/




//to overcome this we can use interface
//lets see interface first


/*
interface Animal{   //interface obj is not created and it dont have constructors
    // interface can't made private or protected else they will throw compilation error
    public void run();


}

class Tiger implements Animal{
    public void run(){
        System.out.println("here tiger is running");
    }

}

class Lion implements Animal{
    public void run(){
        System.out.println("lion is runnung here");
    }

}

public class inher_eg{
    public static void main(String[] args){
        Animal a1 = new Tiger();// syntax for creating objects when using interface(for multiple inheritance)
        Animal a2 = new Lion();
        a1.run();
        a2.run();


    }
}
*/







/*
//now see how to implement interface to achieve multiple inheritance
interface Ertiga{
    public void avg();

}
interface Baleno{
    public void avg();
}

class New_Car implements Ertiga,Baleno{
    public void avg(){
        System.out.println("this is multiple inheritance");
    }
}

public class inher_eg{
    public static void main(String[] args){
        // Class reference
        New_Car car = new New_Car();
        car.avg();

        // Interface reference
        Ertiga e = new New_Car();
        e.avg();

        // Another interface reference
        Baleno b = new New_Car();
        b.avg();

    }
}
*/






//super() keyword--->when parent and child both have same method name  used when we want to use parent variable,methodor constructor


//eg of using parent class variable using super() keyword
/*
class Car{
    String color = "this is of parent class: RED";

}
class Ertiga extends Car{
    String color = "this is of child class: PINK";
    public void veh_color(){
        System.out.println(color);
        System.out.println(super.color);
    }

}
public class inher_eg{
    static void main(){
        Ertiga a1 = new Ertiga();
        a1.veh_color();
    }
}
*/





/*
////eg of using parent class method using super() keyword
class Car{
    public void runn(){
        System.out.println("parent class ");
    }


}

class Baleno extends Car{
    public void runn(){
        System.out.println("child class");
        super.runn();    ///it will exec parent mathod
    }

}
public class inher_eg{
    static void main(){
        Baleno a1 = new Baleno();
        a1.runn();
    }
}
*/





////eg of using parent class construcor using super() keyword

class Car{
    Car(){
        System.out.println("Car is created");
    }

}
class Virtus extends Car{
    Virtus(){
        super();

        System.out.println("Virtus is created");
    }

}
public class inher_eg{
    static void main(){
        Virtus n1= new Virtus();

    }
}




//hierarchial inheritance











