package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesToTal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesToTal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFeesPaid(int fees){
        feesPaid += fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesToTal() {
        return feesToTal;
    }
}