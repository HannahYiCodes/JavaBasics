package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

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
    public void addTeacher(Teacher teachers) {
        teachers.add(teacher);
    }

    // returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }

    // add student to school
    public void addStudent(Student students) {
        students.add(stduent);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
