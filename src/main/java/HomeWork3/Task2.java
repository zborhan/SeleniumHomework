package HomeWork3;
//Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text “Password cannot be empty” is displayed. (edited)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();


        WebElement username=driver.findElement(By.cssSelector(" input[id='txtUsername']"));
        username.sendKeys("ArturGaleyev");

        WebElement btnLogin=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        btnLogin.click();
        WebElement text=driver.findElement(By.cssSelector("span[id='spanMessage']"));
        text.getText();
        if(text.equals("Password cannot be empty")){
            System.out.println("Password is correct");
        }else{
            System.out.println("Password was empty");
        }
        Thread.sleep(5000);
        driver.close();
    }
}