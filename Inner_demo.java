// class A{
//     int rollNo;
//     String sname;

//     class B{
//         public void show()
//         {
//             System.out.println("Hello");
//         }
//     }

// }

// class A{
//     int rollNo;
//     String sname;

//     static class B{
//         public void show()
//         {
//             System.out.println("Hi...!!");
//         }
//     }
// }

// class A{
//     int rollNo;
//     String sname;


//         public void show()
//         {
//             System.out.println("Hi...!!");
//         }
    
// }
interface B{
    public void show();

}
public class Inner_demo {
    public static void main(String[] args) {
        // A obj = new A();

        // A.B obj1 = obj.new B();
        // obj1.show();

        // A.B obj = new A.B();
        // obj.show();

        // A obj = new A(){
        //     public void show()
        //     {
        //         System.out.println("Jai Ho...!!!");
        //     }
        // };
        // obj.show();
        // B obj = new B() {
        //     public void show()
        //     {
        //         System.out.println("Hahaahhaa");
        //     }
        // };
        // obj.show();


        B obj = ()->System.out.println("Hello");

        
        obj.show();
    }
}
