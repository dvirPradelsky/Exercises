package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import Algorithms.Algorithm;
import Algorithms.StandaloneAlgorithm;
import Crypto.Crypto;
import Factories.AlgorithmFactory;
import Factories.CryptoFactory;

public class UserInteraction {
	public Crypto userChooseCrypto(IO io) {
		System.out.println("Choose:");
		System.out.println("(1) Encryption");
		System.out.println("(2) Decryption");
		int num = io.getIntFromUser();
		return CryptoFactory.getCrypto(num, true);
	}

	public String userChooseFile(IO io) throws FileNotFoundException {
		System.out.println("Enter file path: ");
		String filePath = io.getStringFromUser();
		File f = new File(filePath);
		if (!f.exists() || f.isDirectory()) {
			throw new FileNotFoundException();
		}
		return filePath;
	}

	public StandaloneAlgorithm userChooseStandaloneAlgorithm(IO io) {
		System.out.println("Choose standalone algorithm:");
		System.out.println("(1) Caesar algorithm");
		System.out.println("(2) XOR algorithm");
		System.out.println("(3) Multiplication algorithm");
		int algorithmNum = io.getIntFromUser();
		StandaloneAlgorithm algorithm = AlgorithmFactory.getStandaloneAlgorithm(algorithmNum);
		return algorithm;
	}

	public Algorithm userChooseAlgorithm(IO io) {
		System.out.println("Choose algorithm:");
		System.out.println("(1) Caesar algorithm");
		System.out.println("(2) XOR algorithm");
		System.out.println("(3) Multiplication algorithm");
		System.out.println("(4) Double algorithm");
		System.out.println("(5) Reverse algorithm");
		System.out.println("(6) Split algorithm");
		int algorithmNum = io.getIntFromUser();
		Algorithm algorithm = AlgorithmFactory.getAlgorithm(algorithmNum);
		return algorithm;
	}

	public byte userChooseKey(IO io) {
		System.out.println("Enter a key:");
		byte key = io.getByteFromUser();
		return key;
	}
}
