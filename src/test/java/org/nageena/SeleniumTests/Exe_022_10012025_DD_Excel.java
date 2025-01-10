package org.nageena.SeleniumTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exe_022_10012025_DD_Excel {
//to read data from excel we need data provider and data reader class
    @Test(dataProvider="getdata", dataProviderClass= UtilExcel.class)
        public void test_Login(String email, String password){
        System.out.println("Email - "+ email);
        System.out.println("Password - "+ password);

    }



}
