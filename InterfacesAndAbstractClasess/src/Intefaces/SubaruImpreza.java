package Intefaces;

public class SubaruImpreza  implements CarInteface {
    private String  color,model,engine;
    @Override
    public String color() {
         color="red ";
        return color;
    }

    @Override
    public String model() {
        model="2016 new model";
        return model;
    }

    @Override
    public String engine() {
        engine="v12 gazler ";
        return engine;
    }
    public  void  PrintCarInfo(){
        System.out.println("the car is a "+model +"it has a "+engine+ "engine  and is "+ color+" in color" );

    }

    public static void main(String[] args) {

        SubaruImpreza subaruImpreza= new SubaruImpreza();
        subaruImpreza.color();
        subaruImpreza.engine();
        subaruImpreza.model();
        subaruImpreza.PrintCarInfo();

    }
}
