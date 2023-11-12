package Intefaces.src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args)  throws FileNotFoundException,IOException {

//         CHECKED EXCEPTION
//        JAVA CAN NOT ALLOW YOU TO RUN THE PROGRAM WITH CHECKED EXCEPTION
//        UN LIKE UNCHECKED EXCEPTIONS WHERE JAVA ALLOWS YOU TO RUN THE PROGRAM
//        WE HAVE A CHECKED EXCEPTION
//        I USED THE WRONG PATH TO OUR FILE AT src
        FileReader file=new FileReader("/home/devkakai/projects/OOP/sr/shoes.json");

        BufferedReader fileData=new BufferedReader(file);
//        PRINT THE FIRST 5 LINES OF THE FILE
        for (int i=0;i<5;i++){
            System.out.println(fileData.readLine());
        }
    }
}
