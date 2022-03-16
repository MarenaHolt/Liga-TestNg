package Package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass_B {
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @Test
    public void test_3() {
        System.out.println("Test");
    }

    @Test
    public void test_4() {
        System.out.println("Test");
    }
}
