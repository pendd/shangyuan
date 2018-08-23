package reflection_login;

public class UserService {
    public boolean login(String username,String password){
        if(username.equals("pd") && password.equals("123"))
            return true;
        return false;
    }
}
