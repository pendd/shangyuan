public class TestUser {
    public static void main(String[] args) throws Exception {
        Class<?> user = Class.forName("User");

        user.getField("age");
    }
}
