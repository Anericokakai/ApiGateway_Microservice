package EqualsanHasEquals;

import java.util.ArrayList;
import java.util.List;

public  class TryCatchException {

    public static   void WriteList(){
        try {
//            CREATE AN EMPTY LIST
            List<Integer> list=new ArrayList<>(5);
//           ADD ONE ELEMENT TO THE LIST

            list.add(20);
//                    ACCESS THE SECOND ELEMENT TO THE LIST WHICH DOES NOT EXIST
            System.out.println("we now enter the catch block since our code has an error");
            Integer a=list.get(0);
            System.out.println("accessing the first element"+a);
        }catch (ArrayIndexOutOfBoundsException error){
            System.err.println("IndexOutOfBoundsException error:"+error);

    }finally {
            System.out.println("THIS BLOCK WILL ALWAYS BE EXCECUTED");

        }
        }
    public static void main(String[] args) {
WriteList();
    }
}