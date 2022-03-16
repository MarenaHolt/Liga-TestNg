package Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static Package.TestClass_A.afterMethod;
import static Package.TestClass_A.testData;

public class TestClass_C {


    @Test(dataProvider = "Test_data", dataProviderClass = TestClass_A.class)
    public void test_5(Object param_1, Object param_2) {
        if (param_1.equals(1) & param_2.equals(2)) {
            System.out.println("Test");
            testData(param_1, param_2);
            afterMethod();
        } else {
            System.out.println("Test");
            testData(param_1, param_2);
        }

    }

    @AfterClass
    public void afterClassFirst() {
        System.out.println("AfterClass");
    }
    @AfterClass
    public void afterClassSecond() {
        System.out.println("AfterClass");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

}

