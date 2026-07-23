//eg of abstraction

abstract class Carr{
    abstract public void fueltype();
    public void color(){
        System.out.println("Black");
    }

}
class Tata extends Carr{
    public void fueltype(){
        System.out.println("diesel");
    }

}
public class abst_eg{
    static void main(){
        Tata punch = new Tata();
        punch.fueltype();
        punch.color();
    }
}