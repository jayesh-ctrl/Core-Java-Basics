class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    

    public Car(int cylinders,String name)
    {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName(){
            return name;
        }

        public String startEngine(){
            return "Car -> startEngine()";
        }
    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> Brake()";
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders,String name)
    {
        super(cylinders,name);
    }


    public String startEngine(){
            return "Mitsubishi -> startEngine()";
    }


    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }

    public String brake(){
        return "Mitsubishi -> Brake()";
    }
}
public class Prac1
{
    public static void main(String []args)
    {
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());


        Mitsubishi m=new Mitsubishi(6,"Outlander VRW 4WD");
        System.out.println(m.startEngine());
        System.out.println(m.accelerate());
        System.out.println(m.brake());
    }
    
}