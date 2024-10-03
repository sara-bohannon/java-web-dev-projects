public class StudentPractice {
    public static void main(String[] args) {
        Student student = new Student("Sara Bohannon", 12345, 1, 4.0);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Credits: " + student.getNumberOfCredits()); // This should work if the method is defined
        System.out.println("GPA: " + student.getGpa());
    }
}