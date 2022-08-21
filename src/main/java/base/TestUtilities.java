package base;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestUtilities extends BaseTest {

    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @DataProvider(name = "files")
    protected static Object[][] files(){
        return new Object[][]{
                {1,"sobaka.txt"},
                {2,"index.html"},
                {3,"test1"}
        };
    }
}
