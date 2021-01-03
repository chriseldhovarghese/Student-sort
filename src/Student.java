import org.apache.commons.lang.StringUtils;

/**
 * This is the class containing the variables for the sorting
 * as well as the constructor
 */
public class Student {
    private String name;
    private int classNumber;
    private int height;

    /**
     * these are the getters and setters
     * @return
     * It returns the name if getName is called
     */
    public String getName() {
        return name;
    }

    public int getClassNumber() {

        return classNumber;
    }

    public int getHeight() {

        return height;
    }

    /**
     * This is the constructor
     * @param name
     * The name of each student
     * @param classNumber
     * The classNumber of each student
     * @param height
     * The height of each student
     */
    public Student(final String name, final int classNumber, final int height) {

        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("Invalid name");
        }

        this.name = name;
        this.classNumber = classNumber;
        this.height = height;
    }
}
