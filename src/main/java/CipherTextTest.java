import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CipherTextTest {
	
	
	//test1
	@Test
	public void cipherTest(){
		 final StringBuffer actual=CipherText.encrypt("nrfzh");
		assertEquals("quick", actual.toString());
	}
	 
	//test2
	@Test
	public void cipherTest1(){
		 final StringBuffer actual=CipherText.encrypt("sagar");
		assertEquals("sagar", actual.toString());
		
	}

}
