public class Student {
    private String name;
    private int classNumber;
    private int height;


    public String getName() {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid");
        }
        return name;
    }

    public int getClassNumber() {

        return classNumber;
    }

    public int getHeight() {

        return height;
    }

    public Student(final String name, final int classNumber, final int height) {
        this.name = name;
        this.classNumber = classNumber;
        this.height = height;
    }
}