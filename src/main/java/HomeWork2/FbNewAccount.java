package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbNewAccount {
    /*
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
 */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Artur");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Galeyev");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Arturgaleyev@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Arturgaleyev@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password@3456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("January");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1996");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@class='_58mt']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();

        Thread.sleep(2000);
        driver.quit();

    }
}