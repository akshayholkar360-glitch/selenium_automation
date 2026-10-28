package test.Selenium_Automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class automation_task_ {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("(//option[@value='white'])")).click();
		driver.findElement(By.xpath("(//option[@value='cheetah'])")).click();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		driver.findElement(By.id("txtDate")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		sel.selectByVisibleText("Jan");
		
		Select sel2=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		sel2.selectByVisibleText("2027");
		driver.findElement(By.xpath("//a[text()='10' and @class='ui-state-default']")).click();
		
		WebElement el= driver.findElement(By.id("start-date"));
		
		el.sendKeys("01/01/2027");

		WebElement el2= driver.findElement(By.id("end-date"));
		el2.sendKeys("31/03/2027");
		driver.findElement(By.xpath("//button[@onclick='calculateRange()']")).click();
		
		//copy and paste keyboard actions
		
		WebElement el3=driver.findElement(By.id("field1"));
		
		el3.sendKeys(Keys.CONTROL+"A");
		el3.sendKeys(Keys.CONTROL+"C");
		
		WebElement el4=driver.findElement(By.id("field2"));
		
		el4.sendKeys(Keys.CONTROL+"V");
		
		// double click
		
		WebElement el5=driver.findElement(By.xpath("//h2[text()='Double Click']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(el5).build().perform();
		
		// single file upload
		
		WebElement el6=driver.findElement(By.id("singleFileInput"));
		el6.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\1st test case.png");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		// multiple file upload
		
		WebElement el7=driver.findElement(By.id("multipleFilesInput"));
		el7.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 194840.png"+"\n"+"C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 234210.png");
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		
		// scrolling drop down
		
		driver.findElement(By.id("comboBox")).click();
		driver.findElement(By.xpath("//div[text()='Item 3']")).click();
		
		// clickable links laptop link 1st link
		
		driver.findElement(By.id("apple")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		// clickable links laptop link 2nd
		
		driver.findElement(By.id("lenovo")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		// clickable links laptop link 3rd
		
		driver.findElement(By.id("dell")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		// all broken links 
		
//		driver.findElement(By.xpath("//a[text()='Errorcode 400']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[text()='Errorcode 401']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[text()='Errorcode 403']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[text()='Errorcode 404']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[text()='Errorcode 408']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[text()='Errorcode 500']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[text()='Errorcode 502']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[text()='Errorcode 503']")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
		
		// form section 1
		
		WebElement copy1=driver.findElement(By.id("para1"));
		String copytext=copy1.getText();
		
		WebElement paste1=driver.findElement(By.id("input1"));
		paste1.sendKeys(copytext);
		driver.findElement(By.id("btn1")).click();
		
		// form section 2
		
		WebElement copy2=driver.findElement(By.id("para2"));
		String copytext1=copy2.getText();
				
		WebElement paste2=driver.findElement(By.id("input2"));
		paste2.sendKeys(copytext1);
		driver.findElement(By.id("btn2")).click();

		// form section 2
		
		WebElement copy3=driver.findElement(By.id("para3"));
		String copytext2=copy3.getText();
						
		WebElement paste3=driver.findElement(By.id("input3"));
		paste3.sendKeys(copytext2);
		driver.findElement(By.id("btn3")).click();

		
		// static table
		
		WebElement tble= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]"));
		System.out.println("Static table : " + "\n"+  tble.getText());
		
		// dynamic table
		
		WebElement table2 = driver.findElement(By.id("taskTable"));
		System.out.println("Dynamic table : "+"\n" + table2.getText());
		
		// display values
		
		WebElement ele= driver.findElement(By.id("displayValues"));
		System.out.println("Elements are :"+ "\n" + ele.getText());
		
		// mobile labels
		
		WebElement mob = driver.findElement(By.id("mobiles"));
		System.out.println("Mobile Element : "+ "\n" + mob.getText());
		
		// check box
		
		WebElement table = driver.findElement(By.xpath("//table[@id=\"productTable\"]"));

		List<WebElement> boxes = table.findElements(By.xpath("//table[@id='productTable']/tbody/tr[position()<=5]/td[4]/input"));

		for (WebElement box : boxes) {
		    if (!box.isSelected()) {
		        box.click();
		    }
		   
		}
		
		Thread.sleep(2000);
		
		// for next page 2
		
//		WebElement next =driver.findElement(By.xpath("//*[@id=\"pagination\"]/li[2]/a"));
//		next.click();
//		
//		// for next table check box
//		
//		WebElement tablex = driver.findElement(By.xpath("//*[@id=\"productTable\"]"));
//
//		
//		List<WebElement> box1 = tablex.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		for (WebElement check : box1) {
//			if(!check.isSelected()) {
//				check.click();
//			}
//		}
//		
//		Thread.sleep(2000);
		
		//*[@id="productTable"]/tbody/tr[1-4]/td[4]/input
		//*[@id="productTable"]/tbody/tr[2]/td[4]/input
		//input[@type='checkbox']
		
		
		
		
		
		
		
		
		
		


		
		
}
}
