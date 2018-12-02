package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.uiTests.StatesTests;
import tests.uiTests.ZipCodePositiveTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({ StatesTests.class, ZipCodePositiveTests.class})

public class SmokeTestingSuite {

}


