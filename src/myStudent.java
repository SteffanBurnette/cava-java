public class myStudent {

    public static void main(String [] args){


        Student student = new Student("tom", 17, 4.0);
        System.out.println(student.name);

        student.study();

        Student[] students = {
                new Student("toe", 23, 2.5),
                new Student(),
                new Student("ash", 25, 3.4)
        };



        for(Student mystudent : students){
            System.out.println(mystudent.name);
        }
    }
}
