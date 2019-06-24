package CucumberTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


public class testngtes {
	@Test
	public void dologin(){
		System.out.println("check");
		String exp="A";
		String act="A";
		Assert.assertEquals(exp,act,"checking compare");
	}

}
