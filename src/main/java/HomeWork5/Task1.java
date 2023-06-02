package HomeWork5;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 /*http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it  */

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement alert3= driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        alert3.click();
        Thread.sleep(3000);

        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.sendKeys("HomeWork");
        Thread.sleep(3000);
        confirmAlert.accept();





    }
}