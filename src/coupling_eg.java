//degree of dependency of class is coupling
//tight coupling (BAD practice)

//eg of tight coupling
/*
class PetrolEngine{
    void start(){
        System.out.println("petrol engine started :");
    }
}
class Carrr{
    PetrolEngine engine = new PetrolEngine();//tight coupling
    void drive(){
        engine.start();
        System.out.println("car is moving :");

    }
}
public class coupling_eg{
    static void main(){
        Carrr c = new Carrr();
        c.drive();
    }
}
*/




//eg of loose coupling(GOOD practice)
//it is achieved by interface

interface Engine{
    void start();

}
class PetrolEngine implements Engine{
    public void start(){
        System.out.println("Petrol engine started ");
    }
}

class coupling_eg{
    static void main(){
        Engine eng = new PetrolEngine();//loose coupling
        eng.start();
    }
}