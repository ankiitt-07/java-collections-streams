import com.methods.Method;

public class Main {
    public static void main(String[] args) {
        try{
            Method.method2(5,0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}