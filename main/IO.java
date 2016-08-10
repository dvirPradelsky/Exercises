package main;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {
	public String getStringFromUser() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public byte getByteFromUser() {
		Scanner sc = new Scanner(System.in);
		return sc.nextByte();
	}
	
	public void writeByteArrayToFile(String filePath, byte[] fileArray) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(filePath);
		fos.write(fileArray);
		fos.close();
	}

	public byte[] readAllBytes(String filePath) throws IOException
	{
		Path path = Paths.get(filePath);
		byte[] file = Files.readAllBytes(path);
		return file;
	}

	public int getIntFromUser() {
		Scanner sc = new Scanner(System.in);
		int x;
		try {
			x = sc.nextInt();
		} catch (InputMismatchException ex) {
			return -1;
		}
		return x;
	}
}
