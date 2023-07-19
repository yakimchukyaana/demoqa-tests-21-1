package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
        Configuration.browser = "chrome";
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    beforeEach");
//        open("https://google.com");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    afterEach");
    }

    @Test
    void firstTest() {
        System.out.println("            firstTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("            secondTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("            thirdTest");
        Assertions.assertTrue(3 > 2);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

}
