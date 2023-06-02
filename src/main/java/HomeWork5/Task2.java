package HomeWork5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*goto https://chercher.tech/practice/frames   click on check box
then select baby cat from drop down,  then enter text in text box */
public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {


        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.switchTo().frame("frame2");
        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select =new Select(animals);
        select.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        Thread.sleep(2000);
        WebElement textBox= driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Baby Cat");
        Thread.sleep(2000);
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();

    }
}