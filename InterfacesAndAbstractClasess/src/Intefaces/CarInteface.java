package Intefaces;

public  interface CarInteface {
    static  final  String cars="This a car inteface";
   public String  color();
   public   String  model();
    public String  engine();
//    ! default methods
    default  void printWelcome(){
        System.out.println("this is the default method of an interface");

    }
}
