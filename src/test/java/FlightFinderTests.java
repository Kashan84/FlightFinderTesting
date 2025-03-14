import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FlightFinderTests {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void verifyFlightFinderPageTitle() throws InterruptedException {
        WebElement flightFinderLink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
        flightFinderLink.click();

        Thread.sleep(5000);

        String flightFinderLink2 = driver.getTitle();
        String expectedFlightPageTitle = "Find a Flight: Mercury Tours:";
        Assert.assertEquals(flightFinderLink2,expectedFlightPageTitle);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
