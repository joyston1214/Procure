package sample;
import org.testng.annotations.Test;

public class TestScript12Test {
	
	
	@Test(groups = "smoke")
	public void ts1() {
		System.out.println("---TS1---");
	}
	
	@Test(groups = "regression")
	public void ts2() {
		System.out.println("---TS2---");
	}

}
