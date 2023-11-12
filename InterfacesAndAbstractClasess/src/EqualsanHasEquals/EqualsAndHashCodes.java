package EqualsanHasEquals;

public class EqualsAndHashCodes {
    public static void main(String[] args) {

//        INSTATIENT THREE OBJECT USING THE STUDENTS CLASS
        Students james=new Students("james","nakuru",21);
        Students jane =new Students("james","nakuru",22);
        Students  janis= new Students("janis","nakuru",21);

//        JANE AND JAMES HAVE THE SAVE PROPERTIES BUT WHEN  WE COMPARE THE TWO WE GET FALSE

        System.out.println(jane.equals(james));
// THE RESULTS OF THE ABOVE IS FALSE
//        JAVA CANT COMPARE OBJECTS DIRECTLY AS THE REFERENCES IN THE ADRESS WHERE
//        THE OBJECT IS STORED ARE THE ONE BEING COMPARED


    }
}
