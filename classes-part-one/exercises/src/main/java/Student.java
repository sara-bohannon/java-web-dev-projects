public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits;
        private double gpa;

        // Constructor
        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Getters
        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() { // Ensure this method exists
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        // Setters
        public void setName(String name) {
                this.name = name;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        // Optional: Consider making this setter package-private if you want restricted access
        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
}


