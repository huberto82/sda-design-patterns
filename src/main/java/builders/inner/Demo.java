package builders.inner;

public class Demo {
    public static void main(String[] args) {
        User user = User.builder().login("abc").password("1233").build();
        System.out.println(user);
    }
}
