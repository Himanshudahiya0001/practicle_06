interface Payable {
    double calculateFees();
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
        System.out.println("Student constructor");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll No: " + rollNo + ", Course: " + course);
    }
}

class GraduateStudent extends Student implements Payable {
    String thesisTitle;

    GraduateStudent(String name, int age, int rollNo, String course, String thesisTitle) {
        super(name, age, rollNo, course);
        this.thesisTitle = thesisTitle;
        System.out.println("GraduateStudent constructor");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis: " + thesisTitle);
    }

    public double calculateFees() {
        return 25000.0;
    }
}

public class Main {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("Himanshu", 22, 101, "CS", "AI in Education");
        g.displayInfo();
        System.out.println("Fees: " + g.calculateFees());
    }
}
