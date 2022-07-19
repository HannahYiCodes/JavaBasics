package school.management.system;

import jdk.jfr.FlightRecorder;

import javax.swing.event.ChangeEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 1000);
        Teacher melissa = new Teacher(2, "Melissa", 1000);
        Teacher randall = new Teacher(3, "Randall", 800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(randall);

        Student hannah = new Student(1, "Hannah", 9);
        Student martin = new Student(2, "Martin", 5);
        Student elijah = new Student(3, "Elijah", 3);
        Student susan = new Student(4, "Susan", 12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(hannah);
        studentList.add(martin);
        studentList.add(elijah);
        studentList.add(susan);

        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(4, "Megan", 900);
        ghs.addTeacher(megan);

        Student king = new Student(5, "King", 1);
        ghs.addStudent(king);

        hannah.payFees(2000); // why is fees not casting?
        susan.payFees(3000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY------");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has paid " + lizzy.getName()
        + " and now has $" + ghs.getTotalMoneyEarned());

        melissa.receiveSalary(melissa.getSalary());
        System.out.println("GHS has paid " + melissa.getName()
        + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(hannah);
        System.out.println(randall);


    }
}
