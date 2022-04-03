package lession_11;

public class Lab11 {
    /**
     * Please use Strategy Design Pattern to solve below problem:
     * ILOgin: login
     * NormalLogin implements ILOgin
     * SSOLogin implements ILOgin
     *
     * LoginPage - abstract
     * InternalLoginPage use normal login type
     * ExternalLoginPage use SSO type
     */

    public static void main(String[] args) {
        LoginPage internalLoginPage = new InternalLoginPage();
        internalLoginPage.doLogin();
        LoginPage externalLoginPage = new ExternalLoginPage();
        externalLoginPage.doLogin();
    }
}
