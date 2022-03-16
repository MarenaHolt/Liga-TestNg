package Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass_D {

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @Test
    public void test_6(){
        System.out.println("Test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
}
