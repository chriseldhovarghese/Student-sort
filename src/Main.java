/**
 * This class contains the array which is being sorted
 * and all the student details for getting sorted
 */
public class Main {
    /**
     * This  is  where the Student details are provided
     */
    public static void main(String[] args) {

        Student chris = new Student("Chris", 7, 59);
        Student sony = new Student("Sony", 3, 63);
        Student natalie = new Student("Natalie", 6, 56);
        Student allen = new Student("Allen", 21, 65);

        Student[] students = {chris, sony, natalie, allen};


        StudentSort.sortStudentBasedOnClass(students);

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
