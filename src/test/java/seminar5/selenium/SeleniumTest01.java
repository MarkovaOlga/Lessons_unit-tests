package seminar5.selenium;
//1. Открывает главную страницу Google.
//        2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//        3. В результатах поиска ищет ссылку на официальный сайт Selenium
//        (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
//        результатов поиска.

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest01 {
    @Test
    public void browserTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\GB\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("GeekBrains");
        searchBox.submit();
        Thread.sleep(10000);
        webDriver.quit();
    }
}
