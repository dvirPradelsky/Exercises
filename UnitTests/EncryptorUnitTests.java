package UnitTests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import Algorithms.CaesarAlgorithm;
import Crypto.Encryptor;
import main.IO;
import main.UserInteraction;

public class EncryptorUnitTests {
	Encryptor enc;

	@Test
	public void performSucces() throws IOException {
		enc = new Encryptor();
		String goodFile = "C:\\users\\oran\\desktop\\dvir.txt";
		enc.run(goodFile, new CaesarAlgorithm(), new IO(), new UserInteraction());
		assertEquals(enc.getClass(), CaesarAlgorithm.class);
	}
}
