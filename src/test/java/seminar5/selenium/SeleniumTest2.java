package seminar5.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest2 {
    @Test
    public void browserTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\GB\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        List<WebElement> searchResult = webDriver.findElements(By.cssSelector("div"));
        boolean isFind = false;
        for (WebElement element: searchResult) {
            if (element.getText().contains("selenium.dev")) {
                isFind = true;
                break;
            }
        }
        webDriver.quit();
        assertTrue(isFind);
    }

}
