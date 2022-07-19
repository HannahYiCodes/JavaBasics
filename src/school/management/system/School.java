package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // returns the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // add a teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }

    // add student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    } // money spent by the school

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
} // update total money given by school to teachers
