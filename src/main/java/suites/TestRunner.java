package suites;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import tests.uiTests.StatesTests;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(StatesTests.class);
    }
}
