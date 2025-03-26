import com.custom_exceptions.InvalidAgeException;
import com.validators.AgeValidators;
public class Main {
    public static void main(String[] args) {
        try{
            AgeValidators.validateAge(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}