import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest_1 {

    @Test
    public void testPrice() {
        System.setProperty("webdriver.chrome.driver", "c:/Users/Оля/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().window().maximize();
            driver.get("https://umedlab.com.ua/ru/glavnaya");

            WebElement searchButton = driver.findElement(By.className("get_button"));

            searchButton.click();

            String expectedUrl = "https://umedlab.com.ua/ru/prajs/";
            String actualUrl = driver.getCurrentUrl();

            Assert.assertEquals(actualUrl, expectedUrl);
        }finally {
            driver.quit();
        }
    }
}