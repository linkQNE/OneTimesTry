package SitecheckerUI.tests.base.testData;

public enum TestDomain {

    BOOSTA_BIZ("boosta.biz"),
    BURLAK_BG("burlak.bg"),
    SITECHECKER_PRO("sitechecker.pro"),
    HELP_SITECHECKER_PRO("help.sitechecker.pro"),
    XMG_GG("xmg.gg"),
    FLEXSOLUTIONS_COM("flexsolsolutions.com"),
    IVANHOE_PRO("ivanhoe.pro"),
    KPARSER_COM("kparser.com"),
    COPYWRITELY_COM("copywritely.com"),
    PLERDY_COM("plerdy.com"),
    EDUBIRDIE_COM("edubirdie.com"),
    TEST_MONITORING_SITECHECKER_APP("test-monitoring.sitechecker.app"),
    TEST_CRAWLER_STRESS_SITECHECKER_APP("test.crawler-stress.sitechecker.app"),
    CRAWLER_TEST_COM("crawler-test.com"),
    HOLYMOLYCASINOS_COM("holymolycasinos.com"),
    PAPERIAL_COM("paperial.com"),
    REFACTORING_GURU("refactoring.guru"),
    SIMPLE_SITE("simplesitedesigns.com"),
    DIGITAL_STRIKE("digitalstrike.com");


    private String domain;

    TestDomain(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
