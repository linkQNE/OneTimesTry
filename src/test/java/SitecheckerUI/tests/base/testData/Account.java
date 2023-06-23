package SitecheckerUI.tests.base.testData;


import static SitecheckerUI.api.TestMailAppApi.getWorkspaceName;

public enum Account {

    ONBOARDING_TEST_USER(null, null);



    Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public Account setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }
}
