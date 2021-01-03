import org.junit.Assert;
import org.junit.Test;

/**
 * This class the unit tests the name of the students and the IllegalArgumentException
 */
public class StudentTest {
    /**
     * This code unit tests the Name
     */
    @Test
    public void testGetNameHappyCase()
    {
        // Arrange
        final Student student = new Student("Chris", 3, 50);

        // Act
        final String name = student.getName();

        // Verify
        Assert.assertEquals("Chris", name);
    }

    /**
     * This is where the  IllegalArgumentException unit testing is done
     */
    @Test(expected = NullPointerException.class)
    public void testStudentWithEmptyName()
    {
        //Act
        new Student(null, 3,50);
    }
}
