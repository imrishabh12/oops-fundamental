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

   class Vehicle{
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











// eg of multiple inheritance-- it is not possible in java it is called diamond problem in java lets see why
//its not possible



