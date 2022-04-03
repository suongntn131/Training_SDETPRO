package lession_11;

public class ExternalLoginPage extends LoginPage{
    public ExternalLoginPage() {
        loginType = new SSOLogin();
    }
}
