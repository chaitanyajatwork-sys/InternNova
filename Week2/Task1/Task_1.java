package Week3.Task1;
class Student {
    String studentName;
    int rollNumber;
    String branch;
    double cgpa;
    // Constructor
    Student(String studentName, int rollNumber, String branch, double cgpa) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.cgpa = cgpa;
    }
    // Method to display student information
    void displayStudentInfo() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Branch       : " + branch);
        System.out.println("CGPA         : " + cgpa);
    }
}
public class Task_1 {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student student1 = new Student("Chaitanya Jain", 101, "CSE-AIML", 8.7);
        Student student2 = new Student("Rahul Sharma", 102, "CSE", 8.4);
        Student student3 = new Student("Ananya Singh", 103, "CSE-AIML", 9.1);
        // Displaying student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}