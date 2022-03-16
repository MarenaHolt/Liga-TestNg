package Package;

import org.testng.annotations.*;


public class TestClass_A {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }


    private static Object[][] testData = new Object[][]{
            {1, 2},
            {"three", "four"},
            {true, false}
    };

    @DataProvider(name = "Test_data")
    public static Object[][] getData() {
        return testData;
    }

    @Test
    public void test_1 (){
        System.out.println("Test");
    }


    @Test(dataProvider = "Test_data")
    public void test_2(Object param_1, Object param_2) {
        if (param_1.equals(1) & param_2.equals(2)) {
            System.out.println ("Test");
            testData(param_1, param_2);
            afterMethod();
        }
        else {
            System.out.println ("Test");
            testData(param_1, param_2);}
    }


    @Test(dataProvider = "Test_data", enabled = false)
    public static void testData(Object param_1, Object param_2) {
        System.out.println("Test data: " + param_1 + " " + param_2);
    }


    @AfterMethod()
    public static void afterMethod() {
        System.out.println("AfterMethod");
    }

}
