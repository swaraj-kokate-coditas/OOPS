class Student {
    int roll_no;
    String name;
    float marks;

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Introduction_Main {
    public static void main(String[] args) {

        //student_1 reference variable declared of type Student
        Student student_1;

        //instantiated student_1 variable
        student_1 = new Student();

        student_1.marks = 22.6f;

        //hashed value will be printed
        System.out.println(student_1);

        //String representation will be printed
        //System.out.println(student_1.toString());
    }
}
