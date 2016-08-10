package UnitTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Algorithms.Algorithm;
import Algorithms.CaesarAlgorithm;
import Algorithms.XorAlgorithm;
import Crypto.Decryptor;
import Crypto.Encryptor;
import Factories.AlgorithmFactory;
import Factories.CryptoFactory;

public class AlgorithmFactoryUnitTests 
{
	AlgorithmFactory af;
	@Test
	public void getAlgorithmNumIs1ReturnsCaesarAlgorithm() 
	{
		Algorithm ces = af.getAlgorithm(1);
		assertEquals(ces.getClass(), CaesarAlgorithm.class);
	}
	
	@Test
	public void getAlgorithmNumIs2ReturnsXorAlgorithm() 
	{
		Algorithm ces = af.getAlgorithm(2);
		assertEquals(ces.getClass(), XorAlgorithm.class);
	}
	

	@Test (expected=IllegalArgumentException.class)
	public void getAlgorithmNumIsNot1To6ThrowsException() 
	{
		af.getAlgorithm(325);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void getStandaloneAlgorithmNumIs4ThrowsException() 
	{
		af.getStandaloneAlgorithm(4);
		
	}
	
	@Test
	public void  getStandaloneAlgorithmNumIs2ReturnsXorAlgorithm() 
	{
		Algorithm ces = af.getStandaloneAlgorithm(2);
		assertEquals(ces.getClass(), XorAlgorithm.class);
	}
}
