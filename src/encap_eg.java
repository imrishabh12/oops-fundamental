//achieved by access modifiers


class Student {
    private String name;    //private is an access modifier
    private int age;
    private int roll;


    //now we will use getter and setter

    //getter
    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public int getRoll() {
        return roll;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

    public class encap_eg{
        static void main(){
            Student obj = new Student();//creating obj

            //now set everything
            obj.setName("Rishu");
            obj.setAge(22);
            obj.setRoll(18);

            //now get evrything and print it out

            System.out.println(obj.getName());
            System.out.println(obj.getAge());
            System.out.println(obj.getRoll());

        }
    }
