package tests.smokeTests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.DragAndDropPage;

public class DragAndDropTest extends TestUtilities {

    @Test
    public void checkDragAtoB(){
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver,log);
        dragAndDropPage.openPage();

        Assert.assertEquals(dragAndDropPage.getHeaderOfElementA(),"A");
        sleep(2000);
        dragAndDropPage.dragElementAtoElementB();
        sleep(2000);
        Assert.assertEquals(dragAndDropPage.getHeaderOfElementA(),"B");
    }
}
