package UnitTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Crypto.Decryptor;
import Crypto.Encryptor;
import Factories.CryptoFactory;

public class CryptoFactoryUnitTests {
	
	CryptoFactory taget;
	
	@Before
	public void before()
	{
		taget = new CryptoFactory();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getCryptoIllegalNumThrowsException1() {
		taget.getCrypto(-1, true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getCryptoIllegalNumThrowsException2() {
		taget.getCrypto(3, false);
	}
	
	@Test
	public void getCryptoNumIsOneReturnsEncryptor() {
		assertEquals(taget.getCrypto(1, false).getClass(), Encryptor.class);
	}
	
	@Test
	public void getCryptoNumIsTwoReturnsDecryptor() {
		assertEquals(taget.getCrypto(2, false).getClass(), Decryptor.class);
	}
}
