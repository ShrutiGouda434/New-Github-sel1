import org.testng.Reporter;
import org.testng.annotations.Test;

public class Cars {
	@Test
public void create() {
	System.out.println("print");
	Reporter.log("print successfully", true);
}
}
