package HomeWork3;
//Open chrome browser
//Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
//fill in the complete form

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Artur");
        WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Galeyev");
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("Arturgaleyev@gmail.com");
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("9042343212");
        WebElement adress=driver.findElement(By.xpath("//input[@name='address']"));
        adress.sendKeys("717 Old St Augustine");
        WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Jacksonville");
        WebElement state=driver.findElement(By.xpath("//option[text()='Illinois']"));
        state.click();
        WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
        zipCode.sendKeys("32258");
        WebElement a=driver.findElement(By.xpath("//input[@name='website']"));
        a.sendKeys("www.google.com");
        WebElement select=driver.findElement(By.xpath("//input[@value='no']"));
        select.click();
        WebElement d= driver.findElement(By.xpath("//textarea[@name='comment']"));
        d.sendKeys("Good Job my friend!");
        Thread.sleep(5000);
        //driver.close();


    }
}