package Assignment2;

public class StudentDemo {
	public static void main(String[] args) {
        // Create Student object (prints message)
        Student student = new Student();

        // Create Commission object and operate on it
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }

}
