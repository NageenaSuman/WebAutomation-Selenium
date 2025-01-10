package org.nageena.SeleniumTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exe_021_09012025_DataDrivenTesting_HardCoded {

    @DataProvider(parallel=false) // true if you want to run parrally and if your test cases are independent
    public Object[][] getdata(){
        return new Object[][] {
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin1@gmail.com", "pass124"},
                new Object[]{"admin2@gmail.com", "pass123"}
        };
    }
    @Test(dataProvider = "getdata")
    public void test_login(String email, String password){

        System.out.println(email + " | " + password);
    }
    
}
