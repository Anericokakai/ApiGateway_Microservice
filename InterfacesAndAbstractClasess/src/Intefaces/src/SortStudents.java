package Intefaces.src;

import java.util.Objects;

public class SortStudents implements  Comparable<SortStudents> {
    private String name;
    private  String Email;
    private int RegNo;
    private int age;

//    #################################################################################################
    //     WE HAVE TO IMPLEMENT  THE COMPARE TO METHOD JAVA FORCES US THROUGH CHECKED EXCEPTIONS

    @Override
    public int compareTo(SortStudents sortStudents){
        return  this.RegNo-sortStudents.RegNo;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    #################################################################################################
    public SortStudents(String name, String email, int regNo, int age) {
        this.name = name;
        Email = email;
        RegNo = regNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getRegNo() {
        return RegNo;
    }

    public void setRegNo(int regNo) {
        RegNo = regNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SortStudents)) return false;
        SortStudents that = (SortStudents) o;
        return getRegNo() == that.getRegNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegNo());
    }


}
