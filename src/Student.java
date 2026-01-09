public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;


    Student(){
        this.name = "Default Student";
        this.age = -1;
        this.gpa = 0.0;
        this.isEnrolled = false;
    }

    //Creating the constructor
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }



    void study(){
        System.out.println(this.name + " has began studying.");
    }

}
