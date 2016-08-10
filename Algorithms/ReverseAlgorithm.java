package Algorithms;

import main.IO;
import main.UserInteraction;

public class ReverseAlgorithm extends AbstractAlgorithm {

	@Override
	public void decrypt(byte[] file, UserInteraction ui, IO io) {
		StandaloneAlgorithm algorithm = ui.userChooseStandaloneAlgorithm(io);
		byte key = ui.userChooseKey(io);
		algorithm.encryptLogic(file, key);
	}

	@Override
	public void ecrypt(byte[] file, UserInteraction ui, IO io) {
		StandaloneAlgorithm algorithm = ui.userChooseStandaloneAlgorithm(io);
		byte key = super.generateKey();
		System.out.println("keys is: " + key);
		algorithm.decryptLogic(file, key);
	}
}