package testngexample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTests {

    @DataProvider(name = "loanData")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "Personal Loan", 5000 }, { "Home Loan", 20000 } };
    }

    @Test(dataProvider = "loanData", groups = {"data-driven"})
    public void dataDrivenTest(String loanType, int amount) {
        System.out.println("Loan Type: " + loanType + ", Amount: " + amount);
    }
    @Test(dataProvider = "getdata")
    public void expldk(String username,String Password){
        System.out.println(username+Password);
    }
    @DataProvider
    public Object[][] getdata(){
        //3 times values with 2 values passing
        Object[][] data=new Object[3][2];
        //first set
        data[0][0]="username";
        data[0][1]="password";
        //columns in the rows are values
        //2nd set
        data[1][0]="secusername";
        data[1][1]="secpassword";
        //third set
        data[2][0]="thirdusername";
        data[2][1]="thirdpassword";
return data;
    }
}
