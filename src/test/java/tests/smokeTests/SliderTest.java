package tests.smokeTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.SliderPage;

public class SliderTest extends TestUtilities {


    @Test
    public void checkSliderMoving() {
        SliderPage sliderPage = new SliderPage(driver, log);
        sliderPage.openPage();

        sliderPage.setSliderTo("3.5");

        System.out.println(sliderPage.getSliderValue());
        Assert.assertEquals(sliderPage.getSliderValue(), "3.5");
    }

}
