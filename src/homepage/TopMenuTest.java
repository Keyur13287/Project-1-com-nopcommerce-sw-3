package homepage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    //@Test
    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), '"+menu+"')]"));
        //menuElement.click();
    }

    @Test
    public void verifyPageNavigation() {
        String menuName="Books";
        selectMenu(menuName);
        // Verify that the page has navigated correctly
        String expectedTitle = "nopCommerce demo store. " + menuName ;
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Page title does not match!" ,expectedTitle, actualTitle);
    }
    public void tearDown(){
        closeBrowser();
    }
}
