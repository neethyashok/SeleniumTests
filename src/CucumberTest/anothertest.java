package CucumberTest;

import java.util.logging.Logger;

import org.testng.annotations.*;

public class anothertest {
	
	
	@BeforeMethod
	public void beforemethod()
	{
	 System.out.println("Before method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
	 System.out.println("after method");
	}
  @Test
  public void funtionname1() {
	  System.out.println("check 1");
	  Logger.getLogger("inside calss1");
  }
  @Test
  public void funtionname2() {
	  System.out.println("check 2");
	  Logger.getLogger("inside calss1");
  }
  @AfterTest
  public void funtionname3() {
	  System.out.println("check 3");
	  Logger.getLogger("inside calss1");
  }
  @Test(dataProvider="getData")
  public void funtionname4(String UserName,String Pass,String Name) {
	  System.out.println("check 4");
	  Logger.getLogger("inside calss1");
  }
  @BeforeTest
  public void funtionname5() {
	  System.out.println("check 5");
	  Logger.getLogger("inside calss1");
  }
  @DataProvider
  public Object[][] getData(){
	  
  Object[][] data =new Object[2][3];
  data[0][0]="User1";
  data[0][1]="Pass1";
  data[0][2]="Name1";
  data[1][0]="User2";
  data[1][1]="Pass2";
  data[1][2]="Name2";
  return data;
  
  
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Initialize Selenium");
  
  }
}
