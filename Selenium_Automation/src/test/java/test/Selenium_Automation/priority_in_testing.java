package test.Selenium_Automation;

import org.testng.annotations.Test;

public class priority_in_testing {
//	    @Test(priority=0)
//		public void launchwebsite() {
//			System.out.println("website launch : ");		
//			}
//		@Test(priority=1)
//		public void credentials() {
//			System.out.println("valid mail id and password : ");		
//			}
//		@Test(priority=2)
//		public void login() {
//			System.out.println("login sucessful : ");		
//			}
	
	// priority with a different type of numbers
	
	// in this case firstly execute -1 , 0 and then 1 priority block of code
	
	// priority(1, 0, -1):
	
	 @Test(priority=1)
		public void launchwebsite() {
			System.out.println("website launch : ");		
			}
		@Test(priority=0)
		public void credentials() {
			System.out.println("valid mail id and password : ");		
			}
		@Test(priority=-1)
		public void login() {
			System.out.println("login sucessful : ");		
			}
	
	// in this case we provide two times -1 priority to different type of block of code and one block of code we are not provide any priority then these two
	//numbers has showing first but which have top position execute first and then execute second and after that execute 3rd which has no priority set
	// the conclusion is that there are 2 block of code with -1 priority firstly execute first code with priority -1 then execute second block of code with priority 
	// -1 and then execute no priority block of code
	
	// priority (-1, -1, no priority):
	
//	 @Test
//		public void launchwebsite() {
//			System.out.println("website launch : ");		
//			}
//		@Test(priority=-1)
//		public void credentials() {
//			System.out.println("valid mail id and password : ");		
//			}
//		@Test(priority=-1)
//		public void login() {
//			System.out.println("login sucessful : ");		
//			}
	
	// in this scenario we provide 0 priority for 2 block of code and 1 remaining without priority and after execution of code 
	// we see that first execute that one remaining code which had no priority and then execute top block of code and then  last block of code the 
	// the conclusion is that after we provide priority of 0-no priority and then 0 priority code will execute first without priority then top code of 
	// 0 priority and then last code of priority 0.
	
	// priority (0, no priority, 0):

//	@Test(priority=0)
//	public void launchwebsite() {
//		System.out.println("website launch : ");		
//		}
//	@Test
//	public void credentials() {
//		System.out.println("valid mail id and password : ");		
//		}
//	@Test(priority=0)
//	public void login() {
//		System.out.println("login sucessful : ");		
//		}
	
	//the conclusion is there are 3 different priority of each block of code firstly execute 0 priority block of code then execute 2 priority block of code 
	// and then execute 3 priority block of code
	// priority(2, 0, 3):
	
//	@Test(priority=2)
//	public void launchwebsite() {
//		System.out.println("website launch : ");		
//		}
//	@Test(priority=0)
//	public void credentials() {
//		System.out.println("valid mail id and password : ");		
//		}
//	@Test(priority=3)
//	public void login() {
//		System.out.println("login sucessful : ");		
//		}
	
	// in this case priority are 6,-6 and no priority first execute -6 then execute no priority and then execute 6 priority block of code 
	// priority(6, -6, no priority):
	
//	@Test(priority=6)
//	public void launchwebsite() {
//		System.out.println("website launch : ");		
//		}
//	@Test(priority=-6)
//	public void credentials() {
//		System.out.println("valid mail id and password : ");		
//		}
//	@Test
//	public void login() {
//		System.out.println("login sucessful : ");		
//		}
		
	
}
