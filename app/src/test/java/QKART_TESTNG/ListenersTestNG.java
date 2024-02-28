package QKART_TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener{

   public void onTestFailure(ITestResult result){

     System.out.println("Taking Screenshot for :" +result.getName());
   }

   public void onTestSuccess(ITestResult result){

    System.out.println("Taking Screenshot for test successs :" +result.getName());
  }


  public void onStart(ITestContext context) {
      // TODO Auto-generated method stub
     
      System.out.println("Test cases Execution started :");

  }
}
