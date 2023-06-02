package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /* Navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
     Fill out the form
     Close the browser
     Note: use name or id as locators
  */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Antony");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Smit");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys("245 old augustine dr");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Palm cost");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("32256");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("245-433-0095");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("623-45-8290");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("smitAn@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.password")).sendKeys("AAhdgy@398");
        Thread.sleep(1000);
        driver.findElement(By.name("repeatedPassword")).sendKeys("AAhdgy@398");

        Thread.sleep(1000);
        driver.close();
    }
}