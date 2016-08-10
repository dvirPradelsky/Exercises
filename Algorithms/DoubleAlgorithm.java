package Algorithms;

import main.IO;
import main.UserInteraction;

public class DoubleAlgorithm extends AbstractAlgorithm {

	@Override
	public void decrypt(byte[] file, UserInteraction ui, IO io) {
		StandaloneAlgorithm algorithm1 = ui.userChooseStandaloneAlgorithm(io);
		StandaloneAlgorithm algorithm2 = ui.userChooseStandaloneAlgorithm(io);
		System.out.println("First algorithm key (second in decryption) -");
		byte key1 = ui.userChooseKey(io);
		System.out.println("Second algorithm key (first in decryption) -");
		byte key2 = ui.userChooseKey(io);
		algorithm2.decryptLogic(file, key2);
		algorithm1.decryptLogic(file, key1);
	}

	@Override
	public void ecrypt(byte[] file, UserInteraction ui, IO io) {
		StandaloneAlgorithm algorithm1 = ui.userChooseStandaloneAlgorithm(io);
		StandaloneAlgorithm algorithm2 = ui.userChooseStandaloneAlgorithm(io);
		System.out.println("First algorithm key -");
		byte key1 = ui.userChooseKey(io);
		System.out.println("Second algorithm key -");
		byte key2 = ui.userChooseKey(io);
		System.out.println("keys are: (1) " + key1 + " (2) " + key2);
		algorithm1.encryptLogic(file, key1);
		algorithm2.encryptLogic(file, key2);
	}

}
