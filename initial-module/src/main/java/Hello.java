/**
 * Created by @amanmehara on 10/05/2017.
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println(greet("Aman"));
    }

    public static String greet(String name) {
        return String.format("Hello, %s.",name);
    }

}
