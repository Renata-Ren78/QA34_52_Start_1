package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void ilCarro(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        pause(3000);

        // 1
        WebElement titleFindYourCarNow = driver.findElement
                (By.xpath("//*[text()='Find your car now!']"));
        System.out.println(titleFindYourCarNow.getText());

        // 2
        WebElement subTitleHitYalla = driver.findElement
                (By.xpath("//*[text()='Type your data and hit Yalla!']"));
        System.out.println(subTitleHitYalla.getText());

        // 3
        WebElement inputCity = driver.findElement
                (By.xpath("//input[@id='city']"));
        inputCity.sendKeys("Riga");
        pause(3000);

        // 4
        WebElement linkLetTheCarWork = driver.findElement
                (By.xpath("//a[@href='/let-car-work']"));
        linkLetTheCarWork.click();
        pause(3000);
        System.out.println(linkLetTheCarWork.isEnabled());
        System.out.println(linkLetTheCarWork.isDisplayed());

        // 5
        WebElement titleLetTheCarWork = driver.findElement
                (By.xpath("//*[text()=' Let the car work ']"));
        System.out.println(titleLetTheCarWork.getText());

        //6
        WebElement subTitle = driver.findElement
                (By.xpath("//*[text()=' Write some details about your car to rent it out ']"));
        System.out.println(subTitle.getText());

        // 7
        WebElement linkTermsOfUse = driver.findElement
                (By.xpath("//a[@href='/terms-of-use']"));
        linkTermsOfUse.click();
        pause(3000);
        System.out.println(linkTermsOfUse.isEnabled());
        System.out.println(linkTermsOfUse.isDisplayed());

        //8
        WebElement linkSignUp = driver.findElement
                (By.xpath("//*[text()=' Sign up ']"));
        linkSignUp.click();
        pause(3000);
        System.out.println(linkSignUp.isEnabled());
        System.out.println(linkSignUp.isDisplayed());

        // 9
        WebElement inputName = driver.findElement
                (By.xpath("//input[@id='name']"));
        inputName.sendKeys("Metra");
        pause(3000);

        // 10
        WebElement inputLastName = driver.findElement
                (By.xpath("//input[@id='lastName']"));
        inputLastName.sendKeys("Vetra");
        pause(3000);

        // 11
        WebElement inputEmail = driver.findElement(
                By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("metra_vetra@gmail.com");
        pause(3000);

        // 12
        WebElement inputPassword = driver.findElement
                (By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("qwer345ASD@!");
        pause(3000);

        // 13
        WebElement titleRegistration = driver.findElement
                (By.xpath("//h1[text()='Registration']"));
        System.out.println(titleRegistration.getText());

        // 14
        WebElement subtitleHitYalla = driver.findElement
                (By.xpath("//h2[@class='subtitle']"));
        System.out.println(subtitleHitYalla.getText());

        // 15
        WebElement linkLogin = driver.findElement
                (By.xpath("//*[text()=' Log in ']"));
        linkLogin.click();
        pause(3000);
        System.out.println(linkLogin.isEnabled());
        System.out.println(linkLogin.isDisplayed());


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
