package EqualsanHasEquals;

public class Students {
    public Students(String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    String adress;
    int age;


//    !OVERRIDING  EQUALS OF AN OBJECT

    @Override
    public  boolean equals (Object obj) {
//        COMPARE THE FOREIGN OBJECT TO THE CURRENT OBJECT THIS
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;
//        TYPE CAST THE OBJECT INTO STUDENT OBJECT
        Students students=(Students) obj;
        return students.age==this.age;

    }
}
