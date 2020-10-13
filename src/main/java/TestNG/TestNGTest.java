package TestNG;

import org.testng.annotations.Test;

public class TestNGTest 
{
   @Test(expectedExceptions= {Throwable.class})
	void firsttest()
  {
	   System.out.println("test bigins");
	   int i= 10/10;
	   System.out.println("test ends");
  }
   @Test()
   void logintest()
   {
 	   System.out.println("logintest");
 	   //int i= 10/0;  
   }
   
   @Test(dependsOnMethods="logintest")
   void dashboardtest()
   {
 	   System.out.println("Dashboard test....");
 	   
   }
   
   @Test(dependsOnMethods= {"logintest","dashboardtest"},invocationCount=2)
   void Searchtest()
   {
 	   System.out.println("Search Page test");
 	   
   }
}
