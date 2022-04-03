package lession_11;

public abstract class LoginPage {
    ILogin  loginType;
    public void doLogin(){
        loginType.login();
    }
}
