package Intefaces;

public class Volvo implements  CarInteface{
    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public String model() {
        return "2012";
    }

    @Override
    public String engine() {
        return "2017 v8 6.5 liter";
    }

    public static void main(String[] args) {
        Volvo volvo=new Volvo();
        System.out.println(volvo.color());
        System.out.println(volvo.engine());
        System.out.println(volvo.model());
    }
}
