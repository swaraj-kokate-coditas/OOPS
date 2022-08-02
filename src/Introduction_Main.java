class Student {
    int roll_no;
    String name;
    float marks;

    Student(){

        //calling parameterized constructor from other constructor
        //will get executed as
        //Student(roll_no:12, name:Swaraj Kokate, marks:12.2)
        this(12,"Swaraj Kokate",12.2f);
    }



    Student(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void swap(Integer a, Integer b){
        Integer temporary = b;
        b = a;
        a = temporary;
    }
}

class Example {

    //We can't destroy objects explicitly but whenever the objects gets destroyed, jvm will check whether anything is specified in finalize block
    //Hence, finalize method is called whenever the object is to be destroyed for specified class
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

public class Introduction_Main {
    public static void main(String[] args) {

        //non-primitives value can't be changed while that of primitives can be changed as non-primitives are objects
        Integer a = 25, b = 24;


        //student_1 reference variable declared of type Student
        Student student_1, student_2;

        student_2 = new Student();
        student_2.name = "Swaraj";

        //instantiated student_1 variable and passing values from student_2 to student_1
        student_1 = new Student(student_2);

        //printing student_1 after passing values
        System.out.println(student_1);

        student_2.swap(a, b);
        System.out.println(a + " " + b);

        //student_1.marks = 22.6f;

        //hashed value will be printed
        //System.out.println(student_1);

        //String representation will be printed
        //System.out.println(student_1.toString());

        Example example;


        /* for(int iteration = 0; iteration < 10000000; iteration++) {
            example = new Example();
        }*/
    }
}
