package Intefaces.MultipleInheritance;

public class KawasakiNinja  implements MotorBike{
    @Override
    public void gear(String gear) {
        System.out.println("kawasaki Ninja has upto "+ gear+" gears");

    }

    @Override
    public void color(String color) {

        System.out.println("kawasaki Ninja has a "+ color+" color");

    }

    @Override
    public void price(int price) {

        System.out.println("kawasaki Ninja costs around  "+ price+" USD");

    }

    @Override
    public void availabilty(String availbility) {

        System.out.println("kawasaki Ninja is availble in "+ availbility);

    }

    @Override
    public void speedLimit(String speed) {

        System.out.println("kawasaki Ninja has a speed limit of"+ speed+" km/hr");

    }

    public static void main(String[] args) {

        KawasakiNinja kawasakiNinja=new KawasakiNinja();
        kawasakiNinja.gear("7");
        kawasakiNinja.color("green and white");
        kawasakiNinja.availabilty("uganda ,kenya tanzania");
        kawasakiNinja.price(500_000);
        kawasakiNinja.speedLimit("200");

    }
}
