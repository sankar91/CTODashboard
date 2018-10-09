import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport","junit:target/cucumber-junit.xml","json:target/cucumber-report.json"})

public class RunCukesTest {
}