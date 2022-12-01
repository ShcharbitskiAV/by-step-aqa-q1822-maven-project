package by.step.aqa.q1822.maven.project.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass extends BaseTest {

    @Test
    public void verifyUrl() {
        String url = System.getProperty("base-url");
        Assertions.assertEquals("https://oz.by", url);

    }

    @Test
    public void verifyUserName() {
        String username = System.getProperty("base-name");
        Assertions.assertEquals("user", username);

    }

}
