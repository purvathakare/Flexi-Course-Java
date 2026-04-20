class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;
    double marks;

    Student(String name, int age, int rollNumber, double marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks);
        this.specialization = specialization;
    }

    void displayGraduateInfo() {
        displayStudentInfo();
        System.out.println("Specialization: " + specialization);
    }
}

public class Main {
    public static void main(String[] args) {
        GraduateStudent g1 = new GraduateStudent(
                "Rahul Sharma", 23, 101, 85.5, "Computer Science"
        );

        System.out.println("---- Graduate Student Details ----");
        g1.displayGraduateInfo();
    }
}
