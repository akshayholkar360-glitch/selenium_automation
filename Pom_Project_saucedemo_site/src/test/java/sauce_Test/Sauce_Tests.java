package sauce_Test;

import org.testng.annotations.Test;

import sauce_base.Sauce_Base;
import sauce_pages.Sauce_Pages;

public class Sauce_Tests extends Sauce_Base {
	Sauce_Pages page;

	@Test
	public void VerifyLogin() throws InterruptedException {
		page = new Sauce_Pages(d);

		page.enterUsername("standard_user");

		Thread.sleep(1000);

		page.enterPassword("secret_sauce");

		Thread.sleep(1000);

		page.loginBtn();

		Thread.sleep(1000);

		page.open_menu();
     	Thread.sleep(1000);

		page.dynamic_catlog();
		Thread.sleep(1000);

		page.lazy_load();
		Thread.sleep(1000);

		page.open_menu();
		Thread.sleep(1000);

		page.dynamic_catlog();
		Thread.sleep(1000);

		page.spinner_link();
		Thread.sleep(5000);

		page.open_menu();
		Thread.sleep(1000);

		page.dynamic_catlog();
		Thread.sleep(1000);

		page.slider_link();
		Thread.sleep(5000);

		page.open_menu();
		Thread.sleep(1000);

		page.about();
		Thread.sleep(2000);

		page.navigate_back();

		page.open_menu();
		Thread.sleep(1000);

		page.reset_app();
		Thread.sleep(1000);

		page.all_iteam();
		Thread.sleep(1000);

		page.short_itam();

		page.dropdown();

		page.addto_cart();
		Thread.sleep(1000);

		page.remove_iteam();
		Thread.sleep(1000);
		
		page.cart_enter();
		Thread.sleep(2000);
		
		page.remove_cart();
		Thread.sleep(1000);
		
		page.continue_shoping();
		
		page.add_backpack();
		Thread.sleep(1000);
		
		page.cart_enter();
		Thread.sleep(1000);
		
		page.check_out();
		Thread.sleep(1000);
		
		page.checkout_name("Akshay");
		Thread.sleep(1000);
		
		page.checkout_lastname("Holkar");
		Thread.sleep(1000);
		
		page.postal_code("413504");
		Thread.sleep(1000);
		
		page.cancle_checkout();
		Thread.sleep(1000);
		
		page.check_out();
		Thread.sleep(1000);
		
		page.checkout_name("Akshay");
		Thread.sleep(1000);
		
		page.checkout_lastname("Holkar");
		Thread.sleep(1000);
		
		page.postal_code("413504");
		Thread.sleep(1000);
		
		page.continueto_checkout();
		Thread.sleep(1000);
		
		page.cancle_overview();
		Thread.sleep(1000);
		
		page.cart_enter();
		Thread.sleep(1000);
		
		page.check_out();
		Thread.sleep(1000);
		
		page.checkout_name("Akshay");
		Thread.sleep(1000);
		
		page.checkout_lastname("Holkar");
		Thread.sleep(1000);
		
		page.postal_code("413504");
		Thread.sleep(1000);
		
		page.continueto_checkout();
		Thread.sleep(1000);
		
		page.finish();
		Thread.sleep(1000);

		page.generate_pdf();
		Thread.sleep(1000);
		
		String name = page.verify_pdf_downloaded();

		System.out.println("PDF Name: " + name);
		
		page.back_home();
		Thread.sleep(1000);
		
		page.open_menu();
     	Thread.sleep(1000);
     	
     	page.log_out();
	}
}
