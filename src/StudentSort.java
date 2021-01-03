public class StudentSort {
    public static void sortStudentBasedOnClass(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getClassNumber() > students[j].getClassNumber()) {
                    final Student temporaryStore = students[i];
                    students[i] = students[j];
                    students[j] = temporaryStore;
                }
            }
        }
    }
}