package EqualsanHasEquals;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableSort {
    public static void main(String[] args) {

        ArrayList<SortStudents> myList=new ArrayList<SortStudents>();

        SortStudents jhon= new SortStudents("jhon","jhon@",5, 15);
        SortStudents jhon2= new SortStudents("jhon2","jhon2@",1, 8);
        SortStudents jhon3=new SortStudents("jhon3","jhon3@",8, 4);

        myList.add(jhon);
        myList.add(jhon2);
        myList.add(jhon3);



//##################################################################
// SORT USING THE COLLECTION METHOD THAT WE HAVE OVERRIDE

        Collections .sort(myList);

//        LOOP THROUGH EACH ELEMENT USING THE FOR EACH METHOD

        myList.forEach(sortStudents -> {
            System.out.println(sortStudents.getName());
        });


//    ##################################################################

//        SORT BASED ON  OUR CUSTOM COMPARATOR

        Collections.sort(myList,new AgeComparator() );


// PRINT THE DATA IN OUR LIST USING THE FOR LOOP
        System.out.println("THE NEW COMPARISON METHOD:");
        myList.forEach(sortStudents -> {
            System.out.println(sortStudents.getName());
        });
    }




}
