package TestNG_Projet.Test_Automation;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.helpers.Util;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test_automation {

	static WebDriver d;

	// Common Wait Method
	public void myWait() throws InterruptedException {
		Thread.sleep(1000);
	}

	@BeforeClass
	void test_site() throws InterruptedException {

		d = new ChromeDriver();

		d.manage().window().maximize();

		d.get("https://testautomationpractice.blogspot.com/");

	}

//    @Test(priority = 0)
//    void home_click() {
//
//        d.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[1]/a")).click();
//    }
//
//    @Test(priority = 1)
//    void Udemy_Courses_click() throws InterruptedException {
//
//        myWait();
//
//        d.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[2]/a")).click();
//
//        myWait();
//
//        d.navigate().back();
//    }
//
//    @Test(priority = 2)
//    void Online_Trainings_click() throws InterruptedException {
//
//        myWait();
//
//        d.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[3]/a")).click();
//
//        myWait();
//
//        d.navigate().back();
//    }
//
//    @Test(priority = 3)
//    void blog_click() throws InterruptedException {
//
//        myWait();
//
//        d.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[4]/a")).click();
//
//        myWait();
//
//        d.navigate().back();
//    }
//
//    @Test(priority = 4)
//    void playwright_click() throws InterruptedException {
//
//        myWait();
//
//        d.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[5]/a")).click();
//
//        myWait();
//
//        d.navigate().back();
//    }

//	@Test(priority = 5)
//	void enter_name() throws InterruptedException {
//
//		d.findElement(By.id("name")).sendKeys("Jack Sparrow");
//
//		myWait();
//	}
//
//	@Test(priority = 6)
//	void enter_email() throws InterruptedException {
//		d.findElement(By.id("email")).sendKeys("JackSporow11@gmail.com");
//		myWait();
//	}
//
//	@Test(priority = 7)
//	void enter_phone() throws InterruptedException {
//		d.findElement(By.id("phone")).sendKeys("+16462099461");
//		myWait();
//	}
//
//	@Test(priority = 8)
//	void enter_address() throws InterruptedException {
//		d.findElement(By.id("textarea")).sendKeys(" Pirates of the Caribbean universe");
//		myWait();
//	}
//
//	@Test(priority = 9)
//	void select_gender() {
//		d.findElement(By.id("male")).click();
//	}
//
//	@Test(priority = 10)
//	void days_select() throws InterruptedException {
//		WebElement div = d.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[1]"));
//
//		List<WebElement> checkbox = div.findElements(By.xpath("//div/input[@type='checkbox']"));
//
//		for (WebElement check : checkbox) {
//			if (!check.isSelected()) {
//				check.click();
//				myWait();
//			}
//		}
//
//	}
//
//	@Test(priority = 11)
//	void select_country() {
//		Select cou = new Select(d.findElement(By.id("country")));
//		cou.selectByVisibleText("Germany");
//	}
//
//	@Test(priority = 12)
//	void select_colour() {
//		Select col = new Select(d.findElement(By.id("colors")));
//		col.selectByVisibleText("Green");
//	}
//
//	@Test(priority = 13)
//	void select_sorted() {
//		Select sor = new Select(d.findElement(By.id("animals")));
//		sor.selectByVisibleText("Cheetah");
//	}
//
//	@Test(priority = 14)
//	void date_picker() {
//		d.findElement(By.xpath("//input[@id='datepicker']")).click();
//
//		for (int i = 0; i < 3; i++) {
//
//			d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
//		}
//
//		d.findElement(By.xpath("//a[text()='10']")).click();
//
//	}
//
//	@Test(priority = 15)
//	void text_date() {
//		d.findElement(By.id("txtDate")).click();
//		Select date = new Select(d.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
//		date.selectByVisibleText("Jan");
//
//		Select text = new Select(d.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
//		text.selectByVisibleText("2027");
//		d.findElement(By.xpath("//a[text()='10' and @class='ui-state-default']")).click();
//	}
//
//	@Test(priority = 16)
//	void Start_end_date() {
//		WebElement el = d.findElement(By.id("start-date"));
//
//		el.sendKeys("01/01/2027");
//
//		WebElement el2 = d.findElement(By.id("end-date"));
//		el2.sendKeys("31/03/2027");
//	}
//
//	@Test(priority = 17)
//	void press_button() {
//		d.findElement(By.xpath("//button[@onclick='calculateRange()']")).click();
//	}
//
//	@Test(priority = 18)
//	void single_upload() {
//		WebElement single = d.findElement(By.id("singleFileInput"));
//		single.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\1st test case.png");
//		d.findElement(By.xpath("//button[text()='Upload Single File']")).click();
//	}
//
//	@Test(priority = 19)
//	void multi_upload() {
//		WebElement multi = d.findElement(By.id("multipleFilesInput"));
//		multi.sendKeys("C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 194840.png" + "\n"
//				+ "C:\\Users\\aksha\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-21 234210.png");
//		d.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
//	}
//
//	@Test(priority = 20)
//	void static_table() {
//		WebElement tble = d.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]"));
//		System.out.println("Static table : " + "\n" + tble.getText());
//	}
//
//	@Test(priority = 21)
//	void dynamic_table9() {
//		WebElement dtable = d.findElement(By.id("taskTable"));
//		System.out.println("Dynamic table : " + "\n" + dtable.getText());
//	}
//
//	@Test(priority = 22)
//	void paragraph() {
//		WebElement div = d.findElement(By.id("displayValues"));
//
//		List<WebElement> para = div.findElements(By.tagName("p"));
//
//		for (int i = 0; i < para.size(); i++) {
//
//			System.out.println(para.get(i).getText());
//
//		}
//	}
//
//	@Test(priority = 23)
//	void pagination_table() {
//		WebElement table = d.findElement(By.xpath("//table[@id=\"productTable\"]"));
//
//		List<WebElement> boxes = table
//				.findElements(By.xpath("//table[@id='productTable']/tbody/tr[position()<=5]/td[4]/input"));
//
//		for (WebElement box : boxes) {
//			if (!box.isSelected()) {
//				box.click();
//			}
//		}
//	}

//	@Test(priority = 24)
//	void enterdata_keyboard_actions() {
//		for (int i = 1; i <= 3; i++) {
//
//			WebElement copy = d.findElement(By.id("para" + i));
//
//			String copytext = copy.getText();
//
//			WebElement paste = d.findElement(By.id("input" + i));
//
//			paste.sendKeys(copytext);
//
//			d.findElement(By.id("btn" + i)).click();
//
//		}
//	}
//
//	@Test(priority = 25)
//	void footer_link_hidden_input() throws InterruptedException {
//		d.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[2]/a")).click();
//
//		myWait();
//		d.findElement(By.id("input1")).sendKeys("Input : 1");
//
//		myWait();
//
//		WebElement input2 = d.findElement(By.id("input2"));
//
//		System.out.println(input2.isDisplayed());
//
//		d.findElement(By.id("toggleInput")).click();
//
//		input2.sendKeys("Jack");
//
//		System.out.println(input2.getAttribute("value"));
//
//	}
//
//	@Test(priority = 26)
//	void hidden_link_checkbox() throws InterruptedException {
//		d.findElement(By.id("checkbox1")).click();
//
//		myWait();
//
//		WebElement checkbox2 = d.findElement(By.id("checkbox2"));
//		System.out.println(checkbox2.isDisplayed());
//
//		d.findElement(By.id("toggleCheckbox")).click();
//
//		checkbox2.click();
//
//		System.out.println(checkbox2.isSelected());
//	}
//
//	@Test(priority = 27)
//	void ajax_content() {
//
//		d.findElement(By.id("loadContent")).click();
//
//		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
//
//		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajaxContent"), "AJAX Content Loaded"));
//
//		WebElement content = d.findElement(By.id("ajaxContent"));
//
//		System.out.println(content.getText());
//	}
	
	@Test(priority=28)
	void footer_download_files_txt() throws InterruptedException {
		
		d.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[3]/a")).click();
		d.findElement(By.id("inputText")).sendKeys("This is a project in selenium TestNG ");

		d.findElement(By.id("generateTxt")).click();
		d.findElement(By.id("txtDownloadLink")).click();

		Thread.sleep(3000);
		File file = new File("C:\\Users\\aksha\\Downloads\\info.txt");

		if(file.exists()) {
		    System.out.println("Text File Downloaded Successfully");
		}
		else {
		    System.out.println("File is Not Downloaded");
		}	
	}
	@Test(priority=29)
	void footer_download_files_pdf() throws InterruptedException {
		d.findElement(By.id("generatePdf")).click();
		d.findElement(By.id("pdfDownloadLink")).click();
		
		myWait();
		File file = new File("C:\\Users\\aksha\\Downloads\\info.pdf");
		if (file.exists()) {
			System.out.println("PDF File download successfully");
		}
		else {
			System.out.println("file is not downloded");
		}
	}
	
	@Test(priority=30)
	void pdf_file_with_browser() {
		d.findElement(By.xpath("//*[@id=\"post-body-7103635191948372757\"]/button[3]")).click();
		d.findElement(By.xpath("//*[@id=\"save\"]")).click();
		File file = new File("C:\\Users\\aksha\\Downloads\\info.pdf");
		if (file.exists()) {
			System.out.println("PDF File download successfully");
		}
		else {
			System.out.println("file is not downloded");
		}
	}
}
