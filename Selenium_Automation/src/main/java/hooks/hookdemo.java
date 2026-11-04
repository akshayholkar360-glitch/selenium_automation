package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class hookdemo {

	@Before
	public void beforeHook() {
		System.out.println("Before hook");
	}

	@After
	public void afterHook() {
		System.out.println("after hook");
	}

	@BeforeStep
	public void BStep() {
		System.out.println("Before step");
	}

	@AfterStep
	public void aStep() {
		System.out.println("AFTER step");
	}
}
