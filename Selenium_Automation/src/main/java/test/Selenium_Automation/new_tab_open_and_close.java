package test.Selenium_Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_tab_open_and_close {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        // open link
        
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("url is : "+ driver.getTitle());
        
        // Main window ID

        String parent = driver.getWindowHandle();

        
        // click for a open new tab

        driver.findElement(By.xpath("//button[text()='New Tab']")).click();
        System.out.println("url is : "+ driver.getTitle());
        
        Thread.sleep(1000);
        
        // get window handles of open window
        
        Set <String> windowHandles= driver.getWindowHandles();
        List <String> handles= new ArrayList<String>();
        handles.addAll(windowHandles);
        
        
        // Switch to new tab
        driver.switchTo().window(handles.get(1));
        
        driver.close();
        
        // switch to first first window 
        
        driver.switchTo().window(parent);
        System.out.println("url is : "+ driver.getTitle());

        

       
    }
}

