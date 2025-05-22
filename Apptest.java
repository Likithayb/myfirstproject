package dev_.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import dev.java.App;
public class Apptest {
	 @Test
	public void test1() {
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("sjcit","sjc123"));
		
	}
	 @Test
	public void test2() {
		App myapp2=new App();
		Assert.assertEquals(1,myapp2.userLogin("sjcit","sjc123"));
		
	}
}
