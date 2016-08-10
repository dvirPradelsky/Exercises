package Algorithms;

import main.IO;
import main.UserInteraction;

public interface Algorithm {
	public void decrypt(byte[] file, UserInteraction ui, IO io);
	public void ecrypt(byte[] file, UserInteraction ui, IO io);
}
