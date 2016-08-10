package Crypto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import Algorithms.Algorithm;
import main.IO;
import main.UserInteraction;

public class Decryptor implements Crypto {
	@Override
	public void run(String filePath, Algorithm algorithm, IO io, UserInteraction ui) throws IOException {
		System.out.println("Starting decrypt");
		byte[] file = io.readAllBytes(filePath);
		algorithm.decrypt(file, ui, io);
		int lastDot = filePath.lastIndexOf('.');
		String newFilePath = filePath.substring(0, lastDot) + "_decrypted" + filePath.substring(lastDot);
		io.writeByteArrayToFile(newFilePath, file);
		System.out.println("Finished decrypt");
	}
}
