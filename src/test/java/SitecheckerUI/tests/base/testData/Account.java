package SitecheckerUI.tests.base.testData;


import static SitecheckerUI.api.TestMailAppApi.getWorkspaceName;

public enum Account {
    ADMIN("admin@boosta.co", "c0deCrew"),
    KEYWORD_USER("keywordsAutotest@boosta.co", "boostaCo"),
    RECRAWL_USER("recrawlUser@boosta.co", "rrrrrr"),
    POSITIONS_USER("positions@boosta.co", "123456"),
    AUTO_TEST_USER("autotest@boosta.co", "92yQ_krd.kTdvnGs"),
    GA_USER_FLOW_TEST_USER("ga_user_flow_autotest@boosta.co", "H8oyWKLMom#76JNx13$itkF4"),
    USER_FLOW_TEST_USER("user_flow_autotest@boosta.co", "u16WzXgYlotR(D)w#(CtGwWI"),
    AUTO_TEST_FUNNEL_USER("funnelAutotest@gmail.com", "funnelTest3535"),
    AUTO_TEST_MONITORING_USER("monitoring.autotest@gmail.com", "monitoringTest3535"),
    AUTO_TEST_GA_USER("autotest_ga@boosta.co", "92yQ_krd.kTdvnGs"),
    AUTO_TEST_GA_USER_TESTSERVER("autotest+autotest_ga@boosta.co", "92yQ_krd.kTdvnGs"),
    AUTO_TEST_SCOPE_USER("crawl_user@boosta.co", "gFYKgxMDU*$bV*g4nROf6#U!"),
    PROTON_USER("boosta_autotest", "BoostaTest35"),
    AUTOTEST_GOOGLE_ACCOUNT("autotest@boosta.co", "gZAe=E2H11!!@"),
    PROTON_ON_BOARDING_USER("onboardingletters", "sitechecker"),
    ONBOARDING_TEST_USER(null, null),
    FREE_TRAIL_DEMO_FUNNEL(getWorkspaceName() + ".demo_test_minitool@inbox.testmail.app", getWorkspaceName() + ".demo_test_minitool@inbox.testmail.app"),
    BACKLINK_TRACKER_IMPORT_TEST_USER("sobaka_test_minitool@mailto.plus", "sobaka_test_minitool@mailto.plus"),
    RESTRICTION_TEST_USER("restriction_test@mailto.plus", "restriction_test@mailto.plus"),
    TEMP_TEST_USER(null, null);


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
