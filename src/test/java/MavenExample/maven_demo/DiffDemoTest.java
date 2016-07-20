package MavenExample.maven_demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiffDemoTest {

	private DiffDemo diffDemo;
	
	@Before
	public void setup(){
		diffDemo = new DiffDemo();
	}
	
	@Test
	public void testGetDiff() {
		String str1 = "abcde";
		String str2 = "abcxy";
		String expected = "xy";
		try{
			String deffResult = diffDemo.getDiff(str1, str2);
			assertEquals(expected,deffResult);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//fail("Not yet implemented");
	}
	@Test(expected=Exception.class)
	public void testGetDiffWithException() throws Exception{
		String str1 ="";
		String str2 = "abcxy";
		diffDemo.getDiff(str1, str2);
	}

}
