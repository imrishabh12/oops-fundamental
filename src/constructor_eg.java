//eg of constructor(paramatrized and default)
public class constructor_eg {
    int id;
    int age;
    constructor_eg(int id, int age){
        this.id=id;
        this.age=age;
        System.out.println("the id is :" + " " + id);
        System.out.println("the age is:"+ " " + age);
        System.out.println("after id and age final message will be displayed in newline");
        System.out.println("hey!!! how are you doing??");
        System.out.println("above is the eg of parametrized constructor");

    }

    constructor_eg(){
        System.out.println(" ");
        System.out.println("now this is default constructor");
    }

    public static void main(String[] args){
        constructor_eg ob3= new constructor_eg(168,23);
        constructor_eg ob4 = new constructor_eg();//for default

    }
}




