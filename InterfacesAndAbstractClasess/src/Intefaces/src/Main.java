package Intefaces.src;

import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
 public  class Main {


//! IN METHODS


    private  static   void addNumbers(int i ){
i++;

    }


    public static void main(String[] args) {
int i=1;
        addNumbers(i);
        System.out.println("the value of i is :"+i);

//INSTANTIATE A  CLASS IN JAVA
        Students anerico=new Students("anerico kakai","nairobi k-South",20);



//MODIFYING THE OBJECT DIRECTLY


//ACCESSING THE OBJECTS IN THE CLASSES

        String name= anerico.getName();
        String adress= anerico.getAdress();
       int age= anerico.getAge();

       System.out.println("name :"+name);
        System.out.println("adress :"+adress);
System.out.println("age :"+age);
Students newStudent=createNewStudent(anerico);
        System.out.println("name :"+newStudent.getName());
        System.out.println("adress :"+newStudent.getAdress());
        System.out.println("age :"+newStudent.getAge());



    }


    static Students createNewStudent(Students students){
Students newStudent=new Students("misiko", students.getAdress(), students.getAge());
return  newStudent;
    }


}