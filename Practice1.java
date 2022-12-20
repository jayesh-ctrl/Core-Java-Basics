abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void changeNib(){
        System.out.println("changeNib");
    }
    void write()
    {
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
}

public class Practice1{
    public static void main(String []args)
    {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();
    }
}