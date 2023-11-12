package EqualsanHasEquals;
// ################################################
// THE COMPARATOR INTERFACE IS USED TO  SORT  THE SAME OBJECT BASED ON DIFFERENT LOGIC
// UNLIKE THE COMPARABLE WHERE WE ONLY HAVE ONE LOGIC OF SORT


// TO IMPLIMENT THE COMPARISON

import java.util.Comparator;

public class AgeComparator implements Comparator<SortStudents> {

//    !forces us to implement the method compare

    @Override
    public  int compare(SortStudents student1,SortStudents student2){
        if(student1.getAge()<student2.getAge()) return -1;
        if (student1.getAge()>student2.getAge()) return 1;
        else return 0;
    }
}
