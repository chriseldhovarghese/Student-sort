import lombok.NonNull;
import lombok.Value;

/**
 * This is the class containing the variables for the sorting
 * as well as the constructor
 */
@Value
public class Student {
    @NonNull
    String name;
    @NonNull
    int classNumber;
    @NonNull
    int height;
}
