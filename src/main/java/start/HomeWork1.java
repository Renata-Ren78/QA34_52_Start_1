package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork1 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBook(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        pause(2000);

        // 1
        WebElement linkHome = driver.findElement
                (By.cssSelector("[href='/home']"));
        linkHome.click();
        pause(2000);

        // 2
        WebElement linkAbout = driver.findElement
                (By.cssSelector("[href='/about']"));
        linkAbout.click();
        pause(2000);

        // 3
        WebElement linkLogin = driver.findElement
                (By.cssSelector("[href='/login']"));
        linkLogin.click();
        pause(2000);

        // 4
        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());
        pause(2000);

        // 5
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        pause(2000);

        //driver.get("https://telranedu.web.app/about");
        driver.navigate().back();

        // 6
        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(h2.getText());
        pause(2000);

        // 7
        WebElement h3 = driver.findElement(By.tagName("h3"));
        System.out.println(h3.getText());
        pause(2000);

        // 8
        WebElement divClass = driver.findElement(By.className("about_main__2Uv5W"));
        System.out.println(divClass.getAttribute("div class"));
        pause(2000);

        // 9
        WebElement logoPowByTelRan = driver.findElement
                (By.className("about_logo__1Y8cQ"));
        System.out.println(logoPowByTelRan.getText());
        pause(2000);

        driver.navigate().forward();

        // 10
        WebElement linkEmail = driver.findElement(By.name("email"));
        linkEmail.click();
        pause(2000);

        // 11
        WebElement linkPassword = driver.findElement(By.name("password"));
        linkPassword.click();
        pause(2000);

        // 12
        WebElement linkLogin1 = driver.findElement(By.name("login"));
        linkLogin1.click();
        pause(2000);

        driver.quit();
    }

    @Test
    public void ilCarro(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        pause(2000);

        // 1
        WebElement linkLetTheCar = driver.findElement(By.id("1"));
        linkLetTheCar.click();
        pause(2000);

        // 2
        WebElement linkLocation = driver.findElement(By.id("pickUpPlace"));
        linkLocation.click();
        pause(2000);

        // 3
        WebElement linkManufacture = driver.findElement(By.id("make"));
        linkManufacture.click();
        pause(2000);

        // 4
        WebElement linkModel = driver.findElement(By.id("model"));
        linkModel.click();
        pause(2000);

        // 5
        WebElement search =driver.findElement(By.linkText("Search"));
        search.click();
        pause(2000);

        // 6
        WebElement labelCity = driver.findElement
                (By.cssSelector("label[for='city']"));
        labelCity.click();
        pause(2000);

        // 7
        WebElement dates = driver.findElement(By.id("dates"));
        dates.click();
        pause(2000);

        // 8
        WebElement title1 = driver.findElement(By.className("title"));
        System.out.println(title1.getText());
        pause(2000);

        // 9
        WebElement title2 = driver.findElement(By.className("subtitle"));
        System.out.println(title2.getText());
        pause(2000);

        // 10
        WebElement titleFooter = driver.findElement(By.className("action"));
        System.out.println(titleFooter.getText());
        pause(2000);


        driver.quit();
    }

    public void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
