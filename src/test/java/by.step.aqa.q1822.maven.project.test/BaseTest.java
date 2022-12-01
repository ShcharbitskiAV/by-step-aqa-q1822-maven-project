package by.step.aqa.q1822.maven.project.test;

import org.junit.jupiter.api.BeforeAll;

public class BaseTest implements PropertiesReader {

    @BeforeAll
    public void testProperties () {
        propertiesReadFile();
    }

}
