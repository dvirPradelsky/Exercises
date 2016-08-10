package Crypto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import Algorithms.Algorithm;
import main.IO;
import main.UserInteraction;

public class Encryptor implements Crypto {
	@Override
	public void run(String filePath, Algorithm algorithm, IO io, UserInteraction ui) throws IOException {
		System.out.println("Starting encrypt");
		byte[] file = io.readAllBytes(filePath);
		algorithm.ecrypt(file, ui, io);
		String newFilePath = filePath + ".encrypted";
		io.writeByteArrayToFile(newFilePath, file);
		System.out.println("Finished encrypt");
	}
}
