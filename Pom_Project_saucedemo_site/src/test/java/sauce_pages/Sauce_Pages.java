package sauce_pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sauce_Pages {

	WebDriver d;

	// By Interface used to abstract class locate WebElement

	By username = By.id("user-name");
	By password = By.id("password");
	By button = By.id("login-button");
	By openmenu = By.id("react-burger-menu-btn");
	By Logout = By.id("logout_sidebar_link");
	By dynamicatlog = By.id("dynamic_catalog_sidebar_link");
	By lazyload = By.id("dynamic_catalog_lazy_load_link");
	By spinner = By.id("dynamic_catalog_spinner_link");
	By slider = By.id("dynamic_catalog_slider_link");
	By about = By.id("about_sidebar_link");
	By reset_app = By.id("reset_sidebar_link");
	By all_iteams = By.id("inventory_sidebar_link");
	By short_itam = By.xpath("//select[@class='product_sort_container']");
	By short_items = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	By cart1 = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By cart2 = By.id("add-to-cart-sauce-labs-backpack");
	By cart3 = By.id("add-to-cart-sauce-labs-bike-light");
	By cart4 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By cart5 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By cart6 = By.id("add-to-cart-sauce-labs-onesie");
	By remove_iteam1 = By.id("remove-test.allthethings()-t-shirt-(red)");
	By remove_iteam2 = By.id("remove-sauce-labs-bike-light");
	By Cart_enter =By.xpath("//a[@class='shopping_cart_link']");
	By remove_cart = By.id("remove-sauce-labs-backpack");
	By Continue_shoping = By.id("continue-shopping");
	By add_backpack = By.id("add-to-cart-sauce-labs-backpack");
	By check_out = By.id("checkout");
	By checkout_name = By.id("first-name");
	By checkout_lastname = By.id("last-name");
	By postal_code = By.id("postal-code"); 
	By cancle = By.id("cancel");
	By continueto_checkout = By.id("continue");
	By cancle_overview = By.id("cancel");
	By finish = By.id("finish");
	By generate_pdf = By.id("generate-pdf-order");
	By back_home = By.id("back-to-products");
	By Log_out = By.id("logout_sidebar_link"); 
	
	public Sauce_Pages(WebDriver d) {
		this.d = d;
	}

	public void enterUsername(String usersname) {
		d.findElement(username).sendKeys(usersname);
	}

	public void enterPassword(String Pass) {
		d.findElement(password).sendKeys(Pass);
	}

	public void loginBtn() {
		d.findElement(button).click();
	}

	public void open_menu() {
		d.findElement(openmenu).click();
	}

	public void dynamic_catlog() {
		d.findElement(dynamicatlog).click();
	}

	public void lazy_load() {
		d.findElement(lazyload).click();
	}

	public void spinner_link() {
		d.findElement(spinner).click();
	}

	public void slider_link() {
		d.findElement(slider).click();
	}

	public void about() {
		d.findElement(about).click();
	}

	public void navigate_back() {
		d.navigate().back();
	}

	public void reset_app() {
		d.findElement(reset_app).click();
	}

	public void all_iteam() {
		d.findElement(all_iteams).click();
	}

	public void short_itam() {
		d.findElement(short_itam).click();
	}

	public void dropdown() throws InterruptedException {

		WebElement dropdown = d.findElement(short_items);

		Select s = new Select(dropdown);

		int count = s.getOptions().size();

		for (int i = 0; i < count; i++) {

			WebElement newDropdown = d.findElement(short_items);

			Select newSelect = new Select(newDropdown);

			newSelect.selectByIndex(i);

			Thread.sleep(1000);
		}
	}

	public void addto_cart() {
		d.findElement(cart1).click();
		d.findElement(cart2).click();
		d.findElement(cart3).click();
		d.findElement(cart4).click();
		d.findElement(cart5).click();
		d.findElement(cart6).click();
	}

	public void remove_iteam() {
		d.findElement(remove_iteam1).click();
		d.findElement(remove_iteam2).click();
	}
	
	public void cart_enter() {
		d.findElement(Cart_enter).click();
	}
	
	public void remove_cart() {
		d.findElement(remove_cart).click();
	}
	
	public void continue_shoping() {
		d.findElement(Continue_shoping).click();
	}
	
	public void add_backpack() {
		d.findElement(add_backpack).click();
	}
	
	public void check_out() {
		d.findElement(check_out).click();
	}
	
	public void checkout_name(String name) {
		d.findElement(checkout_name).sendKeys(name);;
	}
	
	public void checkout_lastname(String lastname) {
		d.findElement(checkout_lastname).sendKeys(lastname);
	}
	public void postal_code(String code) {
		d.findElement(postal_code).sendKeys(code);
	}
	public void cancle_checkout() {
		d.findElement(cancle).click();
	}
	
	public void continueto_checkout() {
		d.findElement(continueto_checkout).click();
	}
	
	public void cancle_overview() {
		d.findElement(cancle_overview).click();
	}
	
	public void finish() {
		d.findElement(finish).click();
	}
	
	public void generate_pdf() {
		d.findElement(generate_pdf).click();
	}
	
	public String verify_pdf_downloaded() {

	    File folder = new File("C:\\Users\\aksha\\Downloads");

	    File[] files = folder.listFiles();

	    if (files != null) {
	        for (File pdf : files) {
	            if (pdf.getName().startsWith("swag-labs-order-")
	                    && pdf.getName().endsWith(".pdf")) {
	                return pdf.getName();
	            }
	        }
	    }

	    return null;
	}
	
	public void back_home() {
		d.findElement(back_home).click();
	}
	
	public void log_out() {
		d.findElement(Log_out).click();
	}
}