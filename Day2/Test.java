package Day2;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student("joud", 1);
        Student student2 = new Student("shouq", 2);
        Student student3 = new Student("ali", 3);

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        Student retrievedStudent = studentManager.getStudentById(2);
        System.out.println("Retrieved student: " + retrievedStudent.getName() + " (ID: " + retrievedStudent.getId() + ")");

        System.out.println("\nAll students:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println(student.getName() + " (ID: " + student.getId() + ")");
        }

        boolean removed = studentManager.removeStudentById(3);
        if (removed) {
            System.out.println("\nStudents after removal:");
            for (Student student : studentManager.getAllStudents()) {
                System.out.println(student.getName() + " (ID: " + student.getId() + ")");
            }
        } else {
            System.out.println("\nStudent with ID 3 not found.");
        }
    }
}