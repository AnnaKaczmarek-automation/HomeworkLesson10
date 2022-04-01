package Interactions;

import BaseData.BaseTest;
import org.openqa.selenium.Dimension;

public class ResizableTabSteps extends BaseTest {

    public void resizeWindowToTheRight(int a, int b){
        Dimension actualWindowSize = driver.manage().window().getSize();
        Dimension dimension = new Dimension(a,b);
        driver.manage().window().setSize(dimension);



    }
}
